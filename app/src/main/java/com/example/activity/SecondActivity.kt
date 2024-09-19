package com.example.activity

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class SecondActivity : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
      val isAeroplaneMood = intent?.getBooleanExtra("state", false) ?: true

        if (isAeroplaneMood) {
            Toast.makeText(context, "Airplane Mode Enabled", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "Airplane Mode Disabled", Toast.LENGTH_LONG).show()
        }
    }
}