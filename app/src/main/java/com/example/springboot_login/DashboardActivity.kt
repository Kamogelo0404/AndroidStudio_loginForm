package com.example.springboot_login

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class DashboardActivity : AppCompatActivity() {
     lateinit var welcomeText:String
     lateinit var tvWelcome: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

         welcomeText = "Welcome " + intent.getStringExtra("Username").toString() + "!"
         tvWelcome =this.findViewById(R.id.tvWelcome)
        tvWelcome.setText(welcomeText);
    }
}