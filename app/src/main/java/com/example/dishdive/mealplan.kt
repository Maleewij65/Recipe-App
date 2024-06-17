package com.example.dishdive

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class mealplan : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mealplan)

        val back = findViewById<Button>(R.id.back1)
        back.setOnClickListener {
            intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }
    }
}