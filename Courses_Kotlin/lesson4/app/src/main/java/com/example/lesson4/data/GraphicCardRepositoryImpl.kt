package com.example.lesson4.data

import com.example.lesson4.domain.CardRepository
import com.example.lesson4.domain.models.GraphicCardData

object GraphicCardRepositoryImpl: CardRepository {
    private var cars = mutableListOf(
        GraphicCardData(
            series = "RTX",
            number = 3090,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 3080,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 3070,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 3060,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 3050,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 3040,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 3030,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 3020,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 3010,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 3000,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 2090,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 2080,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 2070,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 2060,
            postfix = "TI"
        ),
        GraphicCardData(
            series = "RTX",
            number = 2050,
            postfix = "TI"
        ))

    override fun getCards(): List<GraphicCardData> {
        return cars
    }
}