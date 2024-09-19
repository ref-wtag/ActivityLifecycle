package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

abstract class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
    }

    abstract fun getId(): Int

    open fun setupUI() {
        showToast("this is from Second activity setupUI")
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}