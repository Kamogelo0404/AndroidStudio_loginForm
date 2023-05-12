package com.example.springboot_login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

private lateinit var txtLogin:TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtLogin = findViewById(R.id.txtregister)

        //Intent(this, LoginActivity::class.java) creates an Intent to navigate from
        //the current activity (this) to the LoginActivity class.
        //It specifies the source activity and the destination activity using the class.java syntax.
        txtLogin.setOnClickListener{
            intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}