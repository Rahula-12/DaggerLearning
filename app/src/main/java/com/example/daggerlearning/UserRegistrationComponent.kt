package com.example.daggerlearning

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService():UserRegistrationService
}