package com.example.kotlindemo01.room

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

class StudentRepository(var context: Context) {
    var dataBase: MyDataBase = MyDataBase.getInstance(context)
    val dao: StudentDao = dataBase.getStudentDao()

    fun findAll(): Array<Student>{
        Log.i("TAG---findAll","")
       return dao.findAll()
    }

    fun findStudentById(uid: Int):Student{
        return dao.findStudentById(uid)
    }

    fun insertStudent(s: Student){
        Log.i("TAG---insert",s.toString())
        return dao.insertStudent(s)
    }

    fun deleteStudent(s: Student){
        Log.i("TAG---delete",s.toString())
        return dao.deleteStudent(s)
    }

    fun deleteAllStudent(){
        dao.deleteAllStudent()
    }

    fun findStudents(): List<Student>{
        return dao.findStudents()
    }

}