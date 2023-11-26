package com.example.daggerlearning

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun sendEmail(to: String, mail: String) {
        Log.d("DI", "Email $mail sent to $to.")
    }
}