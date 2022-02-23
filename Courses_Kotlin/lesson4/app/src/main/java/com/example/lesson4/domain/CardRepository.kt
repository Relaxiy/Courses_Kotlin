package com.example.lesson4.domain

import com.example.lesson4.domain.models.GraphicCardData

interface CardRepository {
    fun getCards(): List<GraphicCardData>
}