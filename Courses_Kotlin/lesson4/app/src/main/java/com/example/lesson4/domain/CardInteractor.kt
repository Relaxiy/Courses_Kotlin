package com.example.lesson4.domain

import com.example.lesson4.domain.models.GraphicCardPresent

interface CardInteractor {
    fun getCards(): List<GraphicCardPresent>
}