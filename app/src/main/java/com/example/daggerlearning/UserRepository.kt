package com.example.daggerlearning

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email:String,password:String)
}
class SQLRepository @Inject constructor():UserRepository {
    override fun saveUser(email:String,password:String) {
        Log.d("DI","User saved in DB.")
    }

}

class FirebaseRepository:UserRepository {
    override fun saveUser(email:String,password:String) {
        Log.d("DI","User saved in FireStore.")
    }

}