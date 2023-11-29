package com.example.daggerlearning
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    //fun getAnalyticsService():AnalyticsService
    fun getUserRegistrationComponent():UserRegistrationComponent
}
