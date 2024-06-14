package com.example.frutlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FrutAdapter(val nutritions:List<String>):RecyclerView.Adapter<FrutViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FrutViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FrutViewHolder(layoutInflater.inflate(R.layout.item_frut, parent, false))
    }

    override fun getItemCount(): Int = nutritions.size

    override fun onBindViewHolder(holder: FrutViewHolder, position: Int) {
        val item = nutritions[position]
        holder.bind(item)
    }

}