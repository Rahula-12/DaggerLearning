package com.example.daggerlearning

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule{

    @Binds
    @Singleton
    abstract fun getSQLRepository(sqlRepository: SQLRepository):UserRepository

//    @Provides
//    fun getFirebaseRepository():UserRepository=FirebaseRepository()
}