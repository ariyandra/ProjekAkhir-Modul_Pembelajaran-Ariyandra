package com.projekmodul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.projekmodul.fetchapi.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btndetail = findViewById<ImageView>(R.id.backButton)

        btndetail.setOnClickListener{
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)

        val dataModul = findViewById<RecyclerView>(R.id.Detaill)
        ApiConfig.getService().getmodul1().enqueue(object : Callback<ResponseModul> {
            override fun onResponse(
                call: Call<ResponseModul>,
                response: Response<ResponseModul>
            ) {
                if (response.isSuccessful) {
                    val responseDetail = response.body()
                    val datadetail = responseDetail?.data
                    val detailAdapter = DetailAdapter(datadetail)
                    dataModul.apply {
                        layoutManager = LinearLayoutManager(this@detail)
                        setHasFixedSize(true)
                        detailAdapter.notifyDataSetChanged()
                        adapter = detailAdapter
                    }
                }
            }

            override fun onFailure(call: Call<ResponseModul>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })
    }
}}