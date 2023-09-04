package com.example.lelangku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login2 : AppCompatActivity() {
    lateinit var tvLogin : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        tvLogin = findViewById(R.id.signup)

        tvLogin.setOnClickListener {
            val intent = Intent(this,signup2::class.java)
            startActivity(intent)
        }

    }
}