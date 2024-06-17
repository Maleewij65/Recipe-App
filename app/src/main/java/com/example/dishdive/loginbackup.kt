package com.example.dishdive

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loginbackup : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginbackup)

        val log = findViewById<Button>(R.id.logid)
        log.setOnClickListener {
            intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }
    }
}