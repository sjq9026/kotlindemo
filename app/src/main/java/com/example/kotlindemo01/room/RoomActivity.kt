package com.example.kotlindemo01.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindemo01.R
import com.example.kotlindemo01.databinding.ActivityRoomBinding

class RoomActivity : AppCompatActivity() {
    var vm: StudentViewModel? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var dataBinding: ActivityRoomBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_room)
        vm = ViewModelProvider(this).get(StudentViewModel::class.java)


        dataBinding.studentRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        vm!!.findAll();
        dataBinding.studentRecyclerView.adapter = StudentAdapter(vm!!.students.value!!)
        dataBinding.listener = View.OnClickListener {
            Toast.makeText(this, "插入", Toast.LENGTH_LONG).show()
            when (it) {
                dataBinding.deleteBtn -> {
                    vm!!.deleteAllStudent()
                }
                dataBinding.insertBtn -> insert()
                dataBinding.queryBtn -> {
                    vm!!.findAll()
                }
            }

        }
        vm!!.students.observe(this,
            Observer<List<Student>> { t -> dataBinding.studentRecyclerView.adapter = StudentAdapter(t) })


    }

    private fun insert() {

        for (i in 1..300) {

            vm!!.insertStudent(Student(i, "张三$i", if (i % 2 == 0) "男" else "女"))
        }
    }

    private fun delete() {

    }
}