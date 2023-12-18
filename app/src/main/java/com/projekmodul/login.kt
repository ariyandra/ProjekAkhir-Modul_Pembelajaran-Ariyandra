package com.projekmodul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnlogin = findViewById<TextView>(R.id.btnLogin)

        btnlogin.setOnClickListener{
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)
            }
        }
}