package com.projekmodul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnmain = findViewById<TextView>(R.id.btnmain)
        
        btnmain.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}