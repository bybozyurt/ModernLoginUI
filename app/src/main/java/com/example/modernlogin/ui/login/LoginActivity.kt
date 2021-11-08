package com.example.modernlogin.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.modernlogin.R
import com.example.modernlogin.ui.home.HomeActivity

class LoginActivity : AppCompatActivity() {

    private var textView2 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        textView2 = findViewById(R.id.textView2)

        textView2?.setOnClickListener {
            Toast.makeText(this, "hee", Toast.LENGTH_SHORT).show()
        }



    }
}