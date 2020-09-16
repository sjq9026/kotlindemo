package com.example.kotlindemo01.room

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class StudentViewModel(application: Application) : AndroidViewModel(application) {

    var repository: StudentRepository = StudentRepository(application);

    var students: MutableLiveData<List<Student>> = MutableLiveData()

    var s: Student? = null

    fun findAll() {
        students.value = repository.findStudents()
        Log.i("TAG", students.value.toString())
    }

    fun findStudentById(uid: Int) {
        s = repository.findStudentById(uid)
    }

    fun insertStudent(s: Student) = repository.insertStudent(s)

    fun deleteStudent(s: Student) = repository.deleteStudent(s)

    fun deleteAllStudent() = repository.deleteAllStudent()

    fun findStudents() {
        students.value = repository.findStudents()
    }
}