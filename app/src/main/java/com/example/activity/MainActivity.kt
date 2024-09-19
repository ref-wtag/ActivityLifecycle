package com.example.activity

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.ReturnThis


class MainActivity : AppCompatActivity() {
    lateinit var receiver: SecondActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        receiver = SecondActivity()
        IntentFilter(IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
           registerReceiver(receiver, it)
        })

        startService(Intent(this, ThirdActivity::class.java))
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}