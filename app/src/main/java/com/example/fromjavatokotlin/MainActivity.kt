package com.example.fromjavatokotlin

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.fromjavatokotlin.data.Weather
import com.example.fromjavatokotlin.repository.RepositorySingle

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

        val recyclerWeather = findViewById<RecyclerView>(R.id.recyclerWeather)
        val adapter = WeatherAdapter(RepositorySingle)
        recyclerWeather.adapter = adapter

        for(i in 1..10) {
            Log.i("Cycles", "Hello world!")
        }
        for(i in 12 downTo 1 step 2 ) {
            Log.i("Cycles", "Hello Kotlin!")
        }

        for(weather in RepositorySingle.getWeathers()) {
            Log.i("Cycles", weather.city)
        }

    }


}