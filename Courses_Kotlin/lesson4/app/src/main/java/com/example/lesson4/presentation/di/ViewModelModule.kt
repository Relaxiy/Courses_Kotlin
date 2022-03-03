package com.example.lesson4.presentation.di

import com.example.lesson4.presentation.CardsBottomFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        CardsBottomFragmentViewModel(
            interactor = get()
        )
    }
}