package com.example.daggerlearning

import android.util.Log

class UserRepository {
    fun saveUser(email:String,password:String) {
        Log.d("DI","User saved")
    }
}