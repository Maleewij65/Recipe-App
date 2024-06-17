package com.example.dishdive

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.dishdive.R.id.resback

class recipe : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        val reseback = findViewById<Button>(resback)
        reseback.setOnClickListener {
            intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()

        }
    }
}