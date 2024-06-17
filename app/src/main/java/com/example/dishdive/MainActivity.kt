package com.example.dishdive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startbutton = findViewById<Button>(R.id.startbutton)
        startbutton.setOnClickListener {
            intent = Intent(this, loginbackup::class.java)
            startActivity(intent)
            finish()
        }
    }
}