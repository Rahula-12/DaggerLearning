package com.example.daggerlearning

//Manual Dependency Injection
class UserRegistrationService(private val userRepository: UserRepository,
                              private val emailService: EmailService
) {

    fun registerUser(email:String,password:String) {
        userRepository.saveUser(email,password)
        emailService.sendEmail("abc@gmail.com","User Registered")
    }
}