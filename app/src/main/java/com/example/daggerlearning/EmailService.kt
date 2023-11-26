package com.example.daggerlearning

import android.util.Log

class EmailService {
    fun sendEmail(to: String, mail: String) {
        Log.d("DI", "Email $mail sent to $to.")
    }
}