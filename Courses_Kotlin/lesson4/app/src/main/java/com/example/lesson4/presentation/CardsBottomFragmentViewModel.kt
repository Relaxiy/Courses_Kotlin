package com.example.lesson4.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lesson4.data.GraphicCardRepositoryImpl
import com.example.lesson4.domain.CardInteractor
import com.example.lesson4.domain.CardInteractorImpl
import com.example.lesson4.domain.CardRepository
import com.example.lesson4.domain.models.GraphicCardPresent

class CardsBottomFragmentViewModel(val interactor: CardInteractor): ViewModel() {

    val cardsLiveData: LiveData<List<GraphicCardPresent>> get() = _cardsLiveData
    private val _cardsLiveData = MutableLiveData<List<GraphicCardPresent>>()

    init {
        loadCards()
    }

    private fun loadCards() {

        _cardsLiveData.value = interactor.getCards()
    }
}