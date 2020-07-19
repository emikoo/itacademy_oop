package com.example.oop

import android.content.Context
import android.content.SharedPreferences

object PreferenceUtils {
    private val PREFS_NAME = "MyPrefs"
    private val LOGIN = "login"

    private var preference: SharedPreferences? = null

    fun init(context: Context){
        preference = context.getSharedPreferences("PREFS_NAME", Context.MODE_PRIVATE)
    }

    fun saveLogin(login: String){
        preference?.edit()?.putString(LOGIN, login)?.apply()
    }

    fun getLogin(login: String): String?{
        return preference?.getString(LOGIN, "")
    }
}