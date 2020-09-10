package com.example.kotlindemo01

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class UsersViewModel(application: Application) : AndroidViewModel(application) {
    private var users: MutableLiveData<List<UserInfo>> = MutableLiveData();

    fun initUsers(users: List<UserInfo>) {

    }

}