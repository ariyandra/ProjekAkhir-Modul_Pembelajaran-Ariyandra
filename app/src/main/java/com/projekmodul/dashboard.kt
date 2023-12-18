package com.projekmodul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btndashboard = findViewById<ImageView>(R.id.mybg)

        btndashboard.setOnClickListener{
            val intent = Intent(this, detail::class.java)
            startActivity(intent)
        }
    }
}