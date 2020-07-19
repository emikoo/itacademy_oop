package com.example.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCat = findViewById<Button>(R.id.cat)
        val btnDog = findViewById<Button>(R.id.dog)

        val login = findViewById<EditText>(R.id.login)
        val password = findViewById<EditText>(R.id.password)

        val cat = Cat()
        val dog = Dog()

        btnCat.setOnClickListener {
            cat.makeSound()
            val textLogin = login.text.toString()
            PreferenceUtils.saveLogin(textLogin)
        }

        btnDog.setOnClickListener {
            password.setText( PreferenceUtils.getLogin(login.toString()) )
            dog.makeSound()
        }
    }
}