package com.vois.kt.playgroundapp.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vois.kt.playgroundapp.R
import com.vois.kt.playgroundapp.model.ResourceData

class MainAdapter(private var items: ArrayList<ResourceData>) :
    RecyclerView.Adapter<ItemViewHolder>(),
    View.OnClickListener {

    init {
        Log.i("", "init is called")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.listitem_row1, parent, false)
        return ItemViewHolder(view, this)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onClick(view: View?) {
        Log.i("TextView${view?.tag} onClickListener", "${view?.tag}")
    }

//    fun addItems(mItems: List<ResourceData>) {
//        items.addAll(mItems.map {
//            it.copy()
//        })
//        notifyDataSetChanged()
//    }

}

class ItemViewHolder(private val view: View, private val onClickListener: View.OnClickListener) :
    RecyclerView.ViewHolder(view) {

    fun bind(resourceData: ResourceData) {
        val textView1 = view.findViewById<TextView>(R.id.textView1)
        val imageView = view.findViewById<ImageView>(R.id.imageView)
        textView1.text = resourceData.title
        imageView.setImageResource(if (resourceData.resId != -1) resourceData.resId else R.drawable.ic_launcher_foreground)
        textView1.setOnClickListener(onClickListener)
        imageView.setOnClickListener(onClickListener)
    }

}