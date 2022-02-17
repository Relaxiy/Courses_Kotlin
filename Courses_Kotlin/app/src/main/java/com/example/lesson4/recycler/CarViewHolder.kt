package com.example.lesson4.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson4.enums.Cars
import com.example.lesson4.recycler.clickListener.TextViewOnClick
import com.example.lesson4.R

class CarViewHolder(
    itemView: View,
    private val textViewOnClick: TextViewOnClick
    ): RecyclerView.ViewHolder(itemView) {
    companion object{
        fun newInstance(
            parent: ViewGroup,
            textViewOnClick: TextViewOnClick
        ) = CarViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.car_item,
                    parent,
                    false),
            textViewOnClick
        )
    }

    private val viewCarModel by lazy {
        itemView.findViewById<TextView>(R.id.car_text)
    }

    private val rootView by lazy {
        itemView.findViewById<ConstraintLayout>(R.id.root)
    }

    fun bindItem(item: Cars){
        with(item){
            viewCarModel.text = carsModel
        }

        itemClickListener(item)
    }


    private fun itemClickListener(item: Cars){
        rootView.setOnClickListener {
            textViewOnClick.textViewClick(item)
        }
    }
}