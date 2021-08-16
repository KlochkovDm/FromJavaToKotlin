package com.example.fromjavatokotlin

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                getString(R.string.button_message),
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}