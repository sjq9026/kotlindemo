package com.example.kotlindemo01.room

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*

@Dao
interface StudentDao {
    @Query("select * from student")
    fun findAll(): Array<Student>

    @Query("select * from student where id = :uid")
    fun findStudentById(uid: Int):Student


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertStudent(s: Student)

    @Delete
    fun deleteStudent(s: Student)

    @Query("DELETE  from student where 1=1")
    fun deleteAllStudent()


    @Query("select * from student")
    fun findStudents(): List<Student>


}