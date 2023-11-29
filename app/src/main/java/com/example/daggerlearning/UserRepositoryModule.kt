package com.example.daggerlearning

import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule{

    @Binds
    @ActivityScope
    abstract fun getSQLRepository(sqlRepository: SQLRepository):UserRepository

//    @Provides
//    fun getFirebaseRepository():UserRepository=FirebaseRepository()
}