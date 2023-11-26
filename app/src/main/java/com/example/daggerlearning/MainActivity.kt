package com.example.daggerlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emailService=EmailService()
        val userRepository=UserRepository()
        val userRegistrationService=UserRegistrationService(userRepository,emailService)
        userRegistrationService.registerUser("xyz@gmail.com","1111")
    }
}