package com.example.lesson4.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson4.enums.Cars
import com.example.lesson4.recycler.clickListener.TextViewOnClick

class CarAdapter(private val textViewOnClick: TextViewOnClick): RecyclerView.Adapter<CarViewHolder>() {
    private var items: List<Cars> = emptyList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder.newInstance(parent, textViewOnClick)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun submitList(data: List<Cars>){
        items = data
        notifyDataSetChanged()
    }
}