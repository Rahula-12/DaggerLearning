package com.example.daggerlearning

import javax.inject.Inject
import javax.inject.Named

//Manual Dependency Injection
class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                              @MessageQualifier private val notificationService: NotificationService
) {

    fun registerUser(email:String,password:String) {
        userRepository.saveUser(email,password)
        notificationService.send("abc@gmail.com","User Registered")
    }
}