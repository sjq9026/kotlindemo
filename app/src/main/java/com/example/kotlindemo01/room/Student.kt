package com.example.kotlindemo01.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "student")
data class Student(@PrimaryKey  var id:Int, @ColumnInfo(name = "name")  var name:String,  var gender:String){

}