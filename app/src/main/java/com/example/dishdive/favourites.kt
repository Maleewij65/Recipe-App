package com.example.dishdive

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class favourites : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourites)

        val fav = findViewById<Button>(R.id.back2)
        fav.setOnClickListener {
            intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }
    }
}