package com.example.daggerlearning

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

//    @Binds
//    abstract fun getEmailService(emailService: EmailService):NotificationService

    @Provides
    fun getMessageService():NotificationService=MessageService()
}