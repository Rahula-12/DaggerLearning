package com.example.daggerlearning

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @Named("emailService")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService=emailService

    @ActivityScope // to return singleton object of messageService
    @MessageQualifier
    @Provides
    fun getMessageService():NotificationService=MessageService(3)
}