package com.example.daggerlearning

import dagger.BindsInstance
import dagger.Component

@Component(modules = [NotificationServiceModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
    }

    fun inject(mainActivity: MainActivity)
}