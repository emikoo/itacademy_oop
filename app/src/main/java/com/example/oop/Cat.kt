package com.example.oop

import android.util.Log
import kotlin.math.log

class Cat: Animals() {

    override fun makeSound() {
        Log.d("_______", "mew mew mew")
    }

}