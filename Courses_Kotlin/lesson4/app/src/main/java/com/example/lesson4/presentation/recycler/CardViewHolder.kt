package com.example.lesson4.presentation.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson4.R
import com.example.lesson4.domain.models.GraphicCardPresent

class CardViewHolder(
    itemView: View,
    val send: (card: GraphicCardPresent) -> Unit
    ): RecyclerView.ViewHolder(itemView) {
    companion object{
        fun newInstance(
            parent: ViewGroup,
            send: (card: GraphicCardPresent) -> Unit
        ) = CardViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.card_item,
                    parent,
                    false),
            send
        )
    }

    private val viewCardModel by lazy {
        itemView.findViewById<TextView>(R.id.card_text)
    }

    private val rootView by lazy {
        itemView.findViewById<ConstraintLayout>(R.id.root)
    }

    fun bindItem(item: GraphicCardPresent){
        with(item){
            viewCardModel.text = graphicCard
        }

        rootView.setOnClickListener {
            send(item)
        }
    }

}