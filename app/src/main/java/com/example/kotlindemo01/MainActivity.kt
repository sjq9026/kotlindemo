package com.example.kotlindemo01

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.kotlindemo01.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //获取binding
        var binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        //获取ViewModel
        val userInfoVM: UserViewModel = ViewModelProvider(this).get(UserViewModel::class.java);
        //绑定生命周期
        binding.lifecycleOwner = this
        Log.i("TAG", userInfoVM.getValue()?.value?.userName)
        //绑定数据
        binding.user = userInfoVM
        //设置点击事件
        binding.button.setOnClickListener {
            var u1 = UserInfo("张三", userInfoVM.getValue()?.value?.userAge?.plus(1))
            Log.i("TAG", u1.userAge?.toString())
            //数据变化自动更新
            userInfoVM.changeValue(u1)
        }
    }
}
