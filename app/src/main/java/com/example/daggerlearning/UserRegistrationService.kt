package com.example.daggerlearning

import javax.inject.Inject

//Manual Dependency Injection
class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                              private val emailService: EmailService
) {

    fun registerUser(email:String,password:String) {
        userRepository.saveUser(email,password)
        emailService.sendEmail("abc@gmail.com","User Registered")
    }
}