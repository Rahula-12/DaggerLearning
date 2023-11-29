package com.example.daggerlearning

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
@ActivityScope
@Subcomponent(modules = [NotificationServiceModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {

//    @Subcomponent.Factory
//    interface Factory{
//        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
//    }

    @Subcomponent.Builder
    interface Builder{
        fun build():UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount:Int):Builder
    }

    fun inject(mainActivity: MainActivity)
}