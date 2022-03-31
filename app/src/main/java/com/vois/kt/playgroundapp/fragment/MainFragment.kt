package com.vois.kt.playgroundapp.fragment

import android.content.SharedPreferences
import android.location.Location
import android.location.LocationListener
import android.os.*
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextClock
import androidx.annotation.WorkerThread
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.google.gson.Gson
import com.jayway.jsonpath.JsonPath
import com.vois.kt.playgroundapp.R
import com.vois.kt.playgroundapp.model.ConfigModel
import com.vois.kt.playgroundapp.model.MyHashMap
import com.vois.kt.playgroundapp.model.MySparseArray
import com.vois.kt.playgroundapp.view.MessageHandler
import com.vois.kt.playgroundapp.worker.LongRunningWorker
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.nio.charset.Charset


class MainFragment : Fragment(), View.OnClickListener, Handler.Callback,
    SharedPreferences.OnSharedPreferenceChangeListener, TextWatcher, LocationListener {

    private var textViewReceivedMessage: AppCompatTextView? = null
    private var sharedPreferences: SharedPreferences? = null
    private val fragmentHandler = Handler(Looper.myLooper() ?: Looper.getMainLooper(), this)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewFragment =
            LayoutInflater.from(context).inflate(R.layout.fragment_main, container, false)
        viewFragment.findViewById<Button>(R.id.defaultListButton).setOnClickListener(this)
        viewFragment.findViewById<Button>(R.id.modifiedListButton).setOnClickListener(this)
        viewFragment.findViewById<Button>(R.id.workerButton).setOnClickListener(this)
        viewFragment.findViewById<Button>(R.id.testHashMapButton).setOnClickListener(this)
        viewFragment.findViewById<Button>(R.id.testSparseArrayButton).setOnClickListener(this)
        viewFragment.findViewById<Button>(R.id.gsonJsonButton).setOnClickListener(this)

        val hashMap = MyHashMap<Int, String>()
        hashMap["abc1".hashCode()] = "abc1"
        hashMap["abc2".hashCode()] = "abc2"
        hashMap["abc3".hashCode()] = "abc3"

        hashMap["abc1".hashCode()]?.let { Log.i("MainFragment", it) }

        return viewFragment
    }

    override fun onClick(clickedView: View?) {
        when (clickedView?.id) {
            R.id.defaultListButton, R.id.modifiedListButton -> {
                handleClickAction(view) { sendActionToActivity(clickedView.id) }
            }
            R.id.gsonJsonButton -> {
                handleClickAction1(view) {
                    CoroutineScope(Dispatchers.IO).launch {
                        kotlin.runCatching {
                            val inputStream = clickedView.context.assets.open("config1.json")
                            val configOneString =
                                inputStream.bufferedReader(Charset.forName("UTF-8")).readText()
                            inputStream.close()
                            parseLevelDetectionPath(configOneString)
                            parseLevelDetectionGson(configOneString)
                        }
                    }
                }
            }
            R.id.testHashMapButton -> {
                handleClickAction(view) { allocateHashMap() }
            }
            R.id.testSparseArrayButton -> {
                handleClickAction(view) { allocateSparseArray() }
            }
            R.id.workerButton -> {
                handleClickAction(view) {
                    if (clickedView.tag == null) {
                        sharedPreferences = view?.context?.getSharedPreferences(
                            "appEventsPrefs",
                            AppCompatActivity.MODE_PRIVATE
                        )
                        sharedPreferences?.registerOnSharedPreferenceChangeListener(this)
                        val oneTimeWorkRequest = OneTimeWorkRequestBuilder<LongRunningWorker>().build()
                        if (view?.context != null) {
                            WorkManager.getInstance(view?.context!!).enqueue(oneTimeWorkRequest)
                        }
                        clickedView.tag = oneTimeWorkRequest.id
                        setButtonText(clickedView, R.string.stop_worker)
                    } else {
                        sharedPreferences?.unregisterOnSharedPreferenceChangeListener(this)
                        if (view?.context != null) {
                            WorkManager.getInstance(view?.context!!).cancelAllWork()
                        }
                        clickedView.tag = null
                        setButtonText(clickedView, R.string.start_worker)
                    }
                }
            }
        }
    }

    private fun handleClickAction(view: View?, func: (() -> Unit?)?) {
        view?.setOnClickListener(null)
        func?.invoke()
        view?.setOnClickListener(this)
    }

    private fun handleClickAction1(view: View?, job: (() -> Job?)?) {
        view?.setOnClickListener(null)
        job?.invoke()
        view?.setOnClickListener(this)
    }

    private fun sendActionToActivity(sendMessageToActivity: Int) {
        val activityMessageHandler =
            activity?.findViewById<MessageHandler>(R.id.messageHandler)
        val handler = activityMessageHandler?.handlerObj
        val message = Message()
        message.what = sendMessageToActivity
        handler?.sendMessage(message)
    }

    @WorkerThread
    private fun parseLevelDetectionGson(configOneString: String) {
        val configModel = Gson().fromJson(configOneString, ConfigModel::class.java)
        if (configModel != null) {
            configModel.rootDetection?.rootDetectionLevel?.let { Log.i("TAG Gson", it) }
        }
    }

    @WorkerThread
    private fun parseLevelDetectionPath(configOneString: String) {
        val rootDetectionLevel =
            JsonPath.parse(configOneString).read<String>("$.rootDetection.rootDetectionLevel")
        if (rootDetectionLevel != null) {
            Log.i("TAG JsonPath", rootDetectionLevel)
        }
    }

    private fun allocateHashMap() {
        val hashMap = MyHashMap<Int, String>()
        Trace.beginSection("HashMap 100 objects creation")
        for (i in 0 until 100) {
            hashMap[i] = "Item $i"
        }
        Trace.endSection()
    }

    private fun allocateSparseArray() {
        val sparseArray = MySparseArray<String>()
        Trace.beginSection("SparseArray 100 objects creation")
        for (i in 0 until 100) {
            sparseArray.put(i, "Item $i")
        }
        Trace.endSection()
    }

    private fun setButtonText(view: View?, stringRes: Int) {
        (view as Button).text = getString(stringRes)
    }

    override fun handleMessage(msg: Message): Boolean {
        Log.i(tag, "Message Received $msg")
        textViewReceivedMessage?.text = String.format("${textViewReceivedMessage?.text}$msg\n")
        return false
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {
        val result = sharedPreferences?.getFloat(key, 0.0f)
        if (result != 0.0f) {
            val message = Message()
            message.obj = result
            fragmentHandler.sendMessage(message)
            Log.i("SharedPreferences ", "onReceiving Result $result")
        }
    }

    override fun onStop() {
        sharedPreferences?.unregisterOnSharedPreferenceChangeListener(this)
        view?.findViewById<TextClock>(R.id.textClock)?.removeTextChangedListener(this)
        WorkManager.getInstance(view?.context!!).cancelAllWork()
        super.onStop()
    }

    override fun beforeTextChanged(
        charSequence: CharSequence?,
        start: Int,
        count: Int,
        after: Int
    ) {

    }

    override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {

    }

    override fun afterTextChanged(editable: Editable?) {

    }

    override fun onLocationChanged(location: Location) {
        fragmentHandler.sendMessage(Message().apply { obj = location })
    }

}