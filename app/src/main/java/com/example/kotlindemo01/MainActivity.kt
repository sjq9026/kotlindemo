package com.example.kotlindemo01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.kotlindemo01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        var binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        var userInfo = UserViewModel()
        binding.user = userInfo
    }
}
