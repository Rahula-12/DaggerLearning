package com.example.daggerlearning

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [NotificationServiceModule::class,UserRepositoryModule::class,AnalyticsModule::class])
interface UserRegistrationComponent {

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
    }

    fun inject(mainActivity: MainActivity)
}