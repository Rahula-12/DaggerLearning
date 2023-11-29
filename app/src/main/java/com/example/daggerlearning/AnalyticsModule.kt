package com.example.daggerlearning

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AnalyticsModule {

//    @Named("Firebase")
//    @Provides
//    fun getFirebaseAnalyticsService():AnalyticsService=FirebaseAnalytics()

//    @Named("MixPanel")
    @Provides
    @Singleton
    fun getMixPanelAnalyticsService():AnalyticsService=MixPanel()

}