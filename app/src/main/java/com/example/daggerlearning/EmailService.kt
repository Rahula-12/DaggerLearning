package com.example.daggerlearning

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(to: String, body: String)
}
class EmailService @Inject constructor() : NotificationService{
    override fun send(to: String, body: String) {
        Log.d("DI", "Email $body sent to $to.")
    }
}

class MessageService:NotificationService{
    override fun send(to: String, body: String) {
        Log.d("DI", "Message $body sent to $to.")
    }

}