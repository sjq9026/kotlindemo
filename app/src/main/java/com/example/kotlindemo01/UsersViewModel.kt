package com.example.kotlindemo01

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.kotlindemo01.recycleview.UserInfo

class UsersViewModel(application: Application) : AndroidViewModel(application) {
    private var users: MutableLiveData<List<UserInfo>> = MutableLiveData();

    fun initUsers(users: List<UserInfo>) {

    }

}