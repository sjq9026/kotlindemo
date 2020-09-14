package com.example.kotlindemo01.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.kotlindemo01.R
import com.example.kotlindemo01.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var dataBinding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)
        dataBinding.lifecycleOwner = this
        dataBinding.loginUser = ViewModelProvider(this).get(LoginViewModel::class.java)
    }
}