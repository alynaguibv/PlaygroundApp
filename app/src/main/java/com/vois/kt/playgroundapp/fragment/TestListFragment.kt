package com.vois.kt.playgroundapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vois.kt.playgroundapp.R
import com.vois.kt.playgroundapp.adapter.MainAdapter
import com.vois.kt.playgroundapp.model.ResourceData

class TestListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewFragment =
            LayoutInflater.from(context).inflate(R.layout.fragment_list_fragment, container, false)
        val recyclerView = viewFragment.findViewById<RecyclerView>(R.id.recyclerView)
        val userList = ArrayList<ResourceData>()
        val imagesTypedArray = resources.obtainTypedArray(R.array.default_drawables)
        val arrLength = imagesTypedArray.length()
        var arrIndex = -1
        val imagesArr = arrayOfNulls<Int>(imagesTypedArray.length())
        for (i in imagesArr.indices) {
            arrIndex = if (arrIndex >= arrLength - 1) 0 else arrIndex + 1
            imagesArr[i] = imagesTypedArray.getResourceId(arrIndex, -1)
        }
        imagesTypedArray.recycle()
        for (i in 0 until 100) {
            arrIndex = if (arrIndex >= arrLength - 1) 0 else arrIndex + 1
            imagesArr[arrIndex]?.let {
                userList.add(
                    ResourceData(
                        it, "Item $i", System.nanoTime() + i.toLong()
                    )
                )
            }
        }
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = MainAdapter(userList)
        return viewFragment

    }

}