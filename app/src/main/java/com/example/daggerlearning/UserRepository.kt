package com.example.daggerlearning

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

interface UserRepository{
    fun saveUser(email:String,password:String)
}
class SQLRepository @Inject constructor(@Named("Firebase") private val analytics: AnalyticsService):UserRepository {
    override fun saveUser(email:String,password:String) {
        Log.d("DI","User saved in DB.")
        analytics.trackEvent("Save User","CREATE")
    }

}

class FirebaseRepository(@Named("MixPanel") private val analytics: AnalyticsService):UserRepository {
    override fun saveUser(email:String,password:String) {
        Log.d("DI","User saved in FireStore.")
        analytics.trackEvent("Save User","CREATE")
    }

}