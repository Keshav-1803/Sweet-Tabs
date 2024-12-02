package com.example.sweettabs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SweetListAdapter(private val sweetList: List<Sweet>) :
    RecyclerView.Adapter<SweetListAdapter.SweetViewHolder>() {

    class SweetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sweetName: TextView = itemView.findViewById(R.id.sweet_name)
        val sweetImage: ImageView = itemView.findViewById(R.id.sweet_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SweetViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_sweet_list, parent, false)
        return SweetViewHolder(view)
    }

    override fun onBindViewHolder(holder: SweetViewHolder, position: Int) {
        val sweet = sweetList[position]
        holder.sweetName.text = sweet.name
        holder.sweetImage.setImageResource(sweet.imageResId)
    }

    override fun getItemCount(): Int = sweetList.size
}
