package com.vois.kt.playgroundapp.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vois.kt.playgroundapp.R
import com.vois.kt.playgroundapp.adapter.ModifiedListAdapter
import com.vois.kt.playgroundapp.model.ResourceData
import kotlinx.coroutines.*
import java.util.*
import kotlin.collections.ArrayList

class TestModifiedListFragment : Fragment() {

    private var infiniteJob : Job? = null

    private val tag_ = "TestModifiedListFragment"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewFragment =
            LayoutInflater.from(context).inflate(R.layout.fragment_list_fragment, container, false)
        val recyclerView = viewFragment.findViewById<RecyclerView>(R.id.recyclerView)
        val imagesTypedArray = resources.obtainTypedArray(R.array.default_drawables)
        var arrIndex = -1
        val imagesArr = arrayOfNulls<Int>(imagesTypedArray.length())
        for (i in imagesArr.indices) {
            arrIndex = if (arrIndex >= imagesTypedArray.length() - 1) 0 else arrIndex + 1
            imagesArr[i] = imagesTypedArray.getResourceId(arrIndex, -1)
        }
        imagesTypedArray.recycle()
        val randomImagesList: ArrayList<ResourceData> = getRandomImagesList(imagesArr)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val recyclerAdapter = ModifiedListAdapter()
        recyclerView.adapter = recyclerAdapter
        recyclerAdapter.setCurrentItems(randomImagesList)
        infiniteJob = CoroutineScope(Dispatchers.IO).launch {
            while (true) {
                randomImagesList.addAll(getRandomImagesList(imagesArr))
                recyclerAdapter.setCurrentItems(randomImagesList)
                Log.i(tag_, "Updated List size ${randomImagesList.size}")
                delay(5000)
            }
        }
        return viewFragment

    }

    private fun getRandomImagesList(imagesArr: Array<Int?>): ArrayList<ResourceData> {
        val randomImagesList = ArrayList<ResourceData>()
        var arrIndex = -1
        for (i in 0 until 10) {
            arrIndex = if (arrIndex >= imagesArr.size - 1) 0 else arrIndex + 1
            imagesArr[arrIndex]?.let {
                randomImagesList.add(
                    ResourceData(
                        it, "Item $i", System.currentTimeMillis() + i
                    )
                )
            }
        }
        return randomImagesList
    }

    override fun onPause() {
        super.onPause()
        infiniteJob?.cancel()
    }
}