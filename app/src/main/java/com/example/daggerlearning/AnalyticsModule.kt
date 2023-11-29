package com.example.daggerlearning

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class AnalyticsModule {

    @Named("Firebase")
    @Provides
    fun getFirebaseAnalyticsService():AnalyticsService=FirebaseAnalytics()

    @Named("MixPanel")
    @Provides
    fun getMixPanelAnalyticsService():AnalyticsService=MixPanel()

}