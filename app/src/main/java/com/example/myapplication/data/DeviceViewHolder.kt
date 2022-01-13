package com.example.myapplication.data

import android.view.View
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.adapter.RecyclerAdapter

class DeviceViewHolder(itemView: View) : RecyclerAdapter.ViewHolder(itemView) {
    val name: TextView = itemView.findViewById(R.id.title)
}