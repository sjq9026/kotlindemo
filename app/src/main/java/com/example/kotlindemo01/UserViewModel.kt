package com.example.kotlindemo01

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {
    var user: MutableLiveData<UserInfo> = MutableLiveData()
    fun changeValue(value: UserInfo) {
        user.value = value
    }
    fun getValue(): MutableLiveData<UserInfo> {
        if(user.value == null){
            user.value = UserInfo()
        }
        return user
    }
}