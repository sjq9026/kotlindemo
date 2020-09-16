package com.example.kotlindemo01.room

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindemo01.R
import com.example.kotlindemo01.databinding.StudentItemLayoutBinding

class StudentAdapter(var students: List<Student>) : RecyclerView.Adapter<StudentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {

        var binding = DataBindingUtil.inflate<StudentItemLayoutBinding>(
            LayoutInflater.from(parent.context),
            R.layout.student_item_layout,
            parent,
            false
        )
        return StudentViewHolder(binding)
    }

    override fun getItemCount(): Int {

       return students.size

    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.dataBinding.student = students[position]
    }

}


class StudentViewHolder(var dataBinding: StudentItemLayoutBinding) :
    RecyclerView.ViewHolder(dataBinding.root) {

}