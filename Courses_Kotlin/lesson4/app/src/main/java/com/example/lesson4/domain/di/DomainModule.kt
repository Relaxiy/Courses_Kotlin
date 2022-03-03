package com.example.lesson4.domain.di

import com.example.lesson4.data.GraphicCardRepositoryImpl
import com.example.lesson4.domain.CardInteractor
import com.example.lesson4.domain.CardInteractorImpl
import com.example.lesson4.domain.CardRepository
import org.koin.dsl.module

val domainModule = module {

    single<CardInteractor> {
        CardInteractorImpl(
            repository = get()
        )
    }

    single<CardRepository> {
        GraphicCardRepositoryImpl
    }
}