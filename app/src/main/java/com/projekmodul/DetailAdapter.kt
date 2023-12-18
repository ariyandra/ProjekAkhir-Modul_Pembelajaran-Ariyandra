package com.projekmodul

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DetailAdapter (val dataModul : List<DataItem?>?) : RecyclerView.Adapter<DetailAdapter.MyViewHolder>() {
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val judul = view.findViewById<TextView>(R.id.judul)
        val isi = view.findViewById<TextView>(R.id.isi)
        val file = view.findViewById<TextView>(R.id.file)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_detail, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        if (dataModul != null){
            return dataModul.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.judul.text = dataModul?.get(position)?.judul
        holder.isi.text = dataModul?.get(position)?.isi
        holder.file.text = dataModul?.get(position)?.file
    }
}
