package com.example.lesson4

import android.app.Application
import com.example.lesson4.domain.di.domainModule
import com.example.lesson4.presentation.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CardApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@CardApplication)
            modules(
                listOf(
                    domainModule,
                    viewModelModule
                )
            )

        }
    }
}