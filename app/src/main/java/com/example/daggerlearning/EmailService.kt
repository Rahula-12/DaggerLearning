package com.example.daggerlearning

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService{
    fun send(to: String, body: String)
}
@Singleton
class EmailService @Inject constructor() : NotificationService{
    override fun send(to: String, body: String) {
        Log.d("DI", "Email $body sent to $to.")
    }
}

class MessageService(private val retryCount:Int):NotificationService{
    override fun send(to: String, body: String) {
        Log.d("DI", "Message $body sent to $to. after $retryCount counts.")
    }

}