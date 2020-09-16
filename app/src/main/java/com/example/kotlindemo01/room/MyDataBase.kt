package com.example.kotlindemo01.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext

@Database(entities = [Student::class], version = 1)
abstract class MyDataBase : RoomDatabase() {

    abstract fun getStudentDao(): StudentDao

    //伴生对象，在类初始化的时候就加载
    companion object {
        private var instance: MyDataBase? = null;
        fun getInstance(context: Context): MyDataBase {
            return instance ?: Room.databaseBuilder(context, MyDataBase::class.java, "mydatabase.db")
                .allowMainThreadQueries()
                .build()
        }
    }
}