package com.example.dishdive

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val start = findViewById<Button>(R.id.rec)
        start.setOnClickListener {
            intent = Intent(this, mealplan::class.java)
            startActivity(intent)
            finish()


        }

       val res = findViewById<Button>(R.id.resipee)
        res.setOnClickListener {
            intent=Intent(this,recipe::class.java)
            startActivity(intent)
            finish()
        }






        val youfav = findViewById<Button>(R.id.youfa)
        youfav.setOnClickListener {
            intent = Intent(this, favourites::class.java)
            startActivity(intent)
            finish()

        }
    }
}
