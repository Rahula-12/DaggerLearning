package com.example.daggerlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService2: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appComponent=(application as DaggerApplication).appComponent
        val component=DaggerUserRegistrationComponent.factory().create(3,appComponent)
        component.inject(this)
        userRegistrationService.registerUser("xyz@gmail.com","1111")
    }
}