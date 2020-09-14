package com.example.kotlindemo01.login

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class LoginViewModel(application: Application) : AndroidViewModel(application) {
     var userName: MutableLiveData<String> = MutableLiveData()
     var psd: MutableLiveData<String> = MutableLiveData()

    private fun printValue() {
       Log.i("TAG","用户名:${userName.value}  密码：${psd.value}")
    }

    fun doLogin() {
        printValue()
        Toast.makeText(getApplication(), "登陆成功", Toast.LENGTH_LONG).show()
    }


}