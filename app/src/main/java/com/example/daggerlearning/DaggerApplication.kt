package com.example.daggerlearning

import android.app.Application

class DaggerApplication:Application() {
    lateinit var component: UserRegistrationComponent
    override fun onCreate() {
        super.onCreate()
        component=DaggerUserRegistrationComponent.factory().create(3)
    }
}