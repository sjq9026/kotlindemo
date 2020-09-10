package com.example.kotlindemo01

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kotlindemo01.databinding.ActivityTimeBinding
import java.lang.Exception
import java.net.URL
import java.net.URLConnection
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import java.util.logging.SimpleFormatter

class TimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityTimeBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_time
        )
        binding.button2.setOnClickListener {
            Thread(Runnable {
                //            try {
                var url: URL = URL("http://www.baidu.com")
                val uc: URLConnection = url.openConnection() //生成连接对象
                uc.connect();
                var longTime: Long = uc.date
                var format: DateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                var date = Date(longTime);
                var time = format.format(date)
                Log.i("time", "时间=$time")
               // binding.textView2.text=time
//            }catch (ex:Exception){
//                Log.i("time", "异常了")
//            }
            }).start()




        }
    }
}