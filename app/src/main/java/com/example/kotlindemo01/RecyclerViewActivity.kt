package com.example.kotlindemo01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindemo01.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    val TAG = "RecyclerViewActivity";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_recycler_view)
        var dataBinding: ActivityRecyclerViewBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_recycler_view)
        var users = mutableListOf<UserInfo>();
        for (i in 1..100) {
            Log.i(TAG, "onCreate: $i")
            users.add(UserInfo("张三$i", i.plus(i)))
        }
        dataBinding.recyclerView.adapter = MyAdapter(this@RecyclerViewActivity, users)
        dataBinding.recyclerView.layoutManager =
            LinearLayoutManager(this@RecyclerViewActivity, LinearLayoutManager.VERTICAL, false)
    }
}