package com.picpay.desafio.android

import android.app.Application
import com.picpay.desafio.android.di.module.appModule
import com.picpay.desafio.android.di.module.repoModule
import com.picpay.desafio.android.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}
