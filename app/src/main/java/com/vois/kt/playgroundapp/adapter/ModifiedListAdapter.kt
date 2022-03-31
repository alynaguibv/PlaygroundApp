package com.vois.kt.playgroundapp.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.vois.kt.playgroundapp.R
import com.vois.kt.playgroundapp.model.ResourceData

class ModifiedListAdapter :
    RecyclerView.Adapter<ItemViewHolder>(),
    View.OnClickListener {

    private val diffUtilObj = AsyncListDiffer(this, object : DiffUtil.ItemCallback<ResourceData>() {
        override fun areItemsTheSame(oldItem: ResourceData, newItem: ResourceData): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ResourceData, newItem: ResourceData): Boolean {
            return oldItem == newItem
        }
    })


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.listitem_row1, parent, false)
        return ItemViewHolder(view, this)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(diffUtilObj.currentList[position])
    }

    fun setCurrentItems(mItems: List<ResourceData>) {
        diffUtilObj.submitList(mItems.map {
            it.copy()
        })
    }

    override fun getItemCount(): Int {
        return diffUtilObj.currentList.size
    }

    override fun onClick(view: View?) {
        Log.i("TextView${view?.tag} onClickListener", "${view?.tag}")
    }

    override fun getItemId(position: Int): Long {
        return diffUtilObj.currentList[position].id
    }


}