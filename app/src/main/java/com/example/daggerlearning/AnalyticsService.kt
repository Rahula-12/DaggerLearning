package com.example.daggerlearning

import android.util.Log
import javax.inject.Singleton

interface AnalyticsService {
    fun trackEvent(eventName:String,eventType:String)
}

@Singleton
class MixPanel():AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("Analytics_MixPanel","EventName is $eventName and EventType is $eventType")
    }

}

@Singleton
class FirebaseAnalytics():AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("Analytics_FirebaseAnalytics","EventName is $eventName and EventType is $eventType")
    }


}