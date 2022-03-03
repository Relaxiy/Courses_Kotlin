package com.example.lesson4.domain

import com.example.lesson4.domain.ext.concat
import com.example.lesson4.domain.models.GraphicCardPresent

class CardInteractorImpl(val repository: CardRepository): CardInteractor {
    override fun getCards(): List<GraphicCardPresent> {
        return repository.getCards().map { graphicCardData ->
            GraphicCardPresent(
                graphicCard = graphicCardData.concat()
            )
        }
    }
}