package com.example.lesson4.presenter.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson4.domain.models.GraphicCardPresent

class CardAdapter(private val send: (card: GraphicCardPresent) -> Unit): RecyclerView.Adapter<CardViewHolder>() {
    private var items: List<GraphicCardPresent> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        return CardViewHolder.newInstance(parent, send)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun submitList(data: List<GraphicCardPresent>){
        items = data
        notifyDataSetChanged()
    }
}