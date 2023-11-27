package com.example.daggerlearning

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule {

    @Named("emailService")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService=emailService

    @Singleton // to return singleton object of messageService
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount:Int):NotificationService=MessageService(retryCount)
}