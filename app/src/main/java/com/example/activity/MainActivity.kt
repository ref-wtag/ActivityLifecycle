package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : SecondActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast()
        getId()

        goToSecondActivity()
        //showSecondActivityUI()
    }

    override fun getId(): Int {
        Toast.makeText(this, "Executing get id function", Toast.LENGTH_SHORT).show()
        return 5
    }

    override fun setupUI() {
        super.setupUI()
        val textField = findViewById<TextView>(R.id.textView2)
        textField.text = "Showing 2nd Activity From 1st Activity"
    }

    fun showToast() {
        val button = findViewById<Button>(R.id.button3)
        button.setOnClickListener {
            Toast.makeText(this, "This is First Activity", Toast.LENGTH_SHORT).show()
        }
    }

    //this will crash the app as second activity is a abstract activity
    //abstract activities can't be instantiated, they are only intended to be subclassed
    fun goToSecondActivity() {
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    //this will also crash the app
    fun showSecondActivityUI() {
        setupUI()
    }
}