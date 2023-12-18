package com.projekmodul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnlogin = findViewById<TextView>(R.id.btn_register)

        btnlogin.setOnClickListener{
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)
        }
    }
}