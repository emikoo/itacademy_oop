package com.example.oop

import android.util.Log

class Dog: Animals() {
    override fun makeSound() {
        Log.d("_______", "gav gav gav")
    }
}