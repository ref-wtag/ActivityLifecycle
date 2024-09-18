package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("log1", "on second Activity")
        goToFirstActivity()
    }

    fun goToFirstActivity() {
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            //this will close the current activity and go back to the previous activity in the stack
            finish()
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d("log1", "Back from second Activity")
    }
}