package com.roja.heroesapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import com.roja.heroesapp.models.User
import com.roja.heroesapp.ui.HomeActivity

class MainActivity : AppCompatActivity() {
    lateinit var loginBTN: Button
    lateinit var emailET: EditText
    lateinit var passwordET: EditText
    val userList = User.staticUsers

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        val isLogged = sharedPreferences.getBoolean("isLogged", false)
        val intent = Intent(this@MainActivity, HomeActivity::class.java)

        if (isLogged) {
            startActivity(intent)
            finish()
        }

        loginBTN = findViewById(R.id.loginBTN)
        emailET = findViewById(R.id.emailET)
        passwordET = findViewById(R.id.passwordET)

        loginBTN.setOnClickListener {
            val email = emailET.text.toString()
            val password = passwordET.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                return@setOnClickListener
            }

            val user = User.staticUsers.find { it.email == email && it.password == password }
            if (user == null) {
                return@setOnClickListener
            }

            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", true)
            editor.putString("userName", user.name)
            editor.apply()

            val intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}
