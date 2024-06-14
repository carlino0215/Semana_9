package com.example.frutlist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.frutlist.databinding.ItemFrutBinding
import com.squareup.picasso.Picasso

class FrutViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemFrutBinding.bind(view)

    fun bind(nutrition: String){
        Picasso.get().load(nutrition).into(binding.ivDog)
    }
}