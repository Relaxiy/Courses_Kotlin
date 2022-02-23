package com.example.lesson4.domain.validation

import com.example.lesson4.domain.models.GraphicCardData

class CardConcat {
    companion object{
        fun returnCard(graphicCardData: GraphicCardData): String{
            val card: String
            graphicCardData.apply {
                card = "$series $number $postfix"
            return card
            }
        }
    }
}