package com.example.lesson4.domain

import com.example.lesson4.domain.models.GraphicCardPresent
import com.example.lesson4.domain.validation.CardConcat

class CardInteractorImpl(val repository: CardRepository): CardInteractor {
    override fun getCards(): List<GraphicCardPresent> {
        return repository.getCards().map { graphicCardData ->
            GraphicCardPresent(
                graphicCard = CardConcat.returnCard(graphicCardData)
            )
        }
    }
}