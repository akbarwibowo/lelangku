package com.example.lelangku

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.lelangku.R.*

class signup2 : AppCompatActivity() {
    lateinit var tvSignup : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup2)

        tvSignup = findViewById(R.id.tv_signIn)

        tvSignup.setOnClickListener {
            val intent = Intent(this,login2::class.java)
            startActivity(intent)
        }
    }
}