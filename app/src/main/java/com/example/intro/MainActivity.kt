package com.example.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.button2)
        myButton.setOnClickListener{
            val intent = Intent(this, login_1::class.java)
            startActivity(intent)
        }

        val myButton1 = findViewById<Button>(R.id.button3)
        myButton1.setOnClickListener{
            val intent = Intent(this, signup_1::class.java)
            startActivity(intent)
        }
    }
}