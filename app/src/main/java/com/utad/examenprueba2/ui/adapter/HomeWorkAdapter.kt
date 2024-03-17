package com.utad.examenprueba2.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.utad.examenprueba2.data.network.model.HomeWorkResponse
import com.utad.examenprueba2.databinding.ItemBaseBinding

class HomeWorkAdapter(): ListAdapter<HomeWorkResponse, HomeWorkAdapter.BaseViewHolder>(BaseItemCallBack) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBaseBinding.inflate(inflater, parent, false)
        return BaseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val item = getItem(position)

        //TODO pintar datos de la recycler view

        //holder.binding.tvTitle.text = item.title
        //holder.binding.tvTeacher.text = item.teacherName
        //holder.binding.tvSubject.text = "${item.subject.title} - ${item.subject.classX}"
        //holder.binding.tvDeadline.text = item.date

    }


    inner class BaseViewHolder(val binding: ItemBaseBinding) : RecyclerView.ViewHolder(binding.root)


}


object BaseItemCallBack : DiffUtil.ItemCallback<HomeWorkResponse>() {
    override fun areItemsTheSame(oldItem: HomeWorkResponse, newItem: HomeWorkResponse): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: HomeWorkResponse, newItem: HomeWorkResponse): Boolean {
        return oldItem == newItem
    }

}