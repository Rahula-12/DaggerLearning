package com.example.daggerlearning

import android.util.Log

interface AnalyticsService {
    fun trackEvent(eventName:String,eventType:String)
}

class MixPanel():AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("Analytics_MixPanel","EventName is $eventName and EventType is $eventType")
    }

}

class FirebaseAnalytics():AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("Analytics_FirebaseAnalytics","EventName is $eventName and EventType is $eventType")
    }


}