package com.example.kotlindemo01

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindemo01.databinding.RecyclerItemLayoutBinding

class MyAdapter(private val context: Context, private val users: MutableList<UserInfo>) :
    RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var binding = DataBindingUtil.inflate<RecyclerItemLayoutBinding>(
            LayoutInflater.from(parent.context),
            R.layout.recycler_item_layout,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.user = users[position]
        holder.binding.executePendingBindings()
    }

    override fun getItemCount() = users.size
}

class MyViewHolder(val binding: RecyclerItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)