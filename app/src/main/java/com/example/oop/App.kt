package com.example.oop

import android.app.Application

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        PreferenceUtils.init(applicationContext)
    }
}