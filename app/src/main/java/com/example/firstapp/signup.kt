package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btn = findViewById<Button>(R.id.btnsignup)


        btn.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)

          Toast.makeText(applicationContext,R.string.toast_msg,Toast.LENGTH_LONG).show()
        }

    }
}