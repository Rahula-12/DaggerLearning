package com.example.daggerlearning

import dagger.Component

@Component(modules = [NotificationServiceModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)
}