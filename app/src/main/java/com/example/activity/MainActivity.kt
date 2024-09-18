package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var cnt = 1

    //called when the activity is first created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d ("log1", "${cnt++} executing onCreate")
        buttonClicked()
    }

    fun buttonClicked() {
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    // called when activity is becoming visible to user
    override fun onStart() {
        super.onStart()
        Log.d ("log1","${cnt++} executing onStart")
    }

    //called when activity will start interacting with user
    override fun onResume() {
        super.onResume()
        Log.d("log1","${cnt++} executing onResume")
    }

    //called when activity is not visible to user
    override fun onPause() {
        super.onPause()
        Log.d("log1", "${cnt++} executing onPause")
    }

    //called when current activity is no longer visible to user & new activity become visible to user
    override fun onStop() {
        super.onStop()
        Log.d("log1", "${cnt++} executing onStop")
    }

    //called after activity is stopped, prior to start
    override fun onRestart() {
        super.onRestart()
        Log.d("log1", "${cnt++} executing onRestart")
    }

    //called before the activity is destroyed
    override fun onDestroy() {
        super.onDestroy()
        Log.d("log1", "${cnt++} executing onDestroy")
    }


}