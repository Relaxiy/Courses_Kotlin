package com.example.lesson4.presenter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lesson4.data.GraphicCardRepositoryImpl
import com.example.lesson4.domain.CardInteractor
import com.example.lesson4.domain.CardInteractorImpl
import com.example.lesson4.domain.CardRepository
import com.example.lesson4.domain.models.GraphicCardPresent

class ViewModelBottomFragment: ViewModel() {

    val cardsLiveData: LiveData<List<GraphicCardPresent>> get() = _cardsLiveData
    private val _cardsLiveData = MutableLiveData<List<GraphicCardPresent>>()

    private val repository: CardRepository = GraphicCardRepositoryImpl

    private val interactor: CardInteractor = CardInteractorImpl(
        repository = repository
    )

    private fun loadCards() {

        _cardsLiveData.value = interactor.getCards()
    }

    init {
        loadCards()
    }
}