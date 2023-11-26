package com.example.daggerlearning

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email:String,password:String) {
        Log.d("DI","User saved in DB.")
    }
}