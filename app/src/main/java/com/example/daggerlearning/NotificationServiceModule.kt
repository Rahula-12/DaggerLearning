package com.example.daggerlearning

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @Named("emailService")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService=emailService

    @MessageQualifier
    @Provides
    fun getMessageService():NotificationService=MessageService()
}