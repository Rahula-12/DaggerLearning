package com.example.daggerlearning

import android.app.Application

class DaggerApplication:Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent=DaggerAppComponent.builder().build()
    }
}