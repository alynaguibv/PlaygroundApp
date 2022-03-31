package com.vois.kt.playgroundapp.activity

import android.app.ActivityManager
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.doOnAttach
import androidx.core.view.doOnDetach
import androidx.fragment.app.Fragment
import com.vois.kt.playgroundapp.R
import com.vois.kt.playgroundapp.fragment.MainFragment
import com.vois.kt.playgroundapp.fragment.TestListFragment
import com.vois.kt.playgroundapp.fragment.TestModifiedListFragment
import com.vois.kt.playgroundapp.view.MessageHandler
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity(), Handler.Callback, View.OnClickListener {


    private val hTextViewActionInt = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rootView = findViewById<ConstraintLayout>(R.id.contentActivity)

        if (savedInstanceState == null) {
            addFragment(MainFragment(), "mainFragment")
        }
        rootView.doOnAttach {
            val messageHandler = findViewById<MessageHandler>(R.id.messageHandler)
            messageHandler.setHandlerCallback(this)
            handleClickTextView()
        }


    }

    private fun handleClickTextView() {
        val hTextView = findViewById<TextView>(R.id.hTextView)
        hTextView.doOnAttach {
            val handler = Handler(hTextView.handler.looper, this)
            val job = scheduleInfiniteJob(handler)
            hTextView.setOnClickListener(this)
            hTextView.tag = job
        }
        hTextView.doOnDetach {
            if (it.tag != null) {
                (it.tag as Job).cancel("", null)
            }
        }

    }

    private fun addFragment(fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction().addToBackStack(tag).setReorderingAllowed(true)
            .add(R.id.fragmentContent, fragment, tag).commit()
    }

    private fun scheduleInfiniteJob(proposedHandler: Handler?): Job {
        return CoroutineScope(Dispatchers.Unconfined).launch {
            while (isActive) {
                proposedHandler?.sendMessage(Message().apply {
                    what = hTextViewActionInt
                    arg1 = hTextViewActionInt
                    obj = System.nanoTime()
                })
                delay(10L)
            }
        }
    }

    override fun handleMessage(msg: Message): Boolean {
        when (msg.what) {
            R.id.defaultListButton -> {
                addFragment(TestListFragment(), "testListFragment")
            }
            R.id.modifiedListButton -> {
                addFragment(TestModifiedListFragment(), "testListFragment")
            }
            hTextViewActionInt -> {
                findViewById<TextView>(R.id.hTextView).text = msg.obj.toString()
            }
        }
        return true
    }

    override fun onBackPressed() {
        //super.onBackPressed() leak activity instance
        if (supportFragmentManager.backStackEntryCount == 1) {
            finishAfterTransition()
            return
        } else super.onBackPressed()
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.hTextView -> {
                if (view.tag != null) {
                    (view.tag as Job).cancel("", null)
                    view.tag = null
                } else {
                    handleClickTextView()
                }
            }
        }
    }

}