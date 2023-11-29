package com.example.daggerlearning

import dagger.BindsInstance
import dagger.Component

@ActivityScope
@Component(dependencies = [AppComponent::class],modules = [NotificationServiceModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int,appComponent: AppComponent):UserRegistrationComponent
    }

    fun inject(mainActivity: MainActivity)
}