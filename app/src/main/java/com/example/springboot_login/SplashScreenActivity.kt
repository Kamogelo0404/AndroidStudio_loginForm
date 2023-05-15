package com.example.springboot_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {

    private val splashTimeOut: Long = 3000 // Splash screen display time in milliseconds
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        // Delay the start of the next activity using a Handler
        Handler().postDelayed({
            // Start the next activity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish() // Finish the splash activity to prevent going back to it
        }, splashTimeOut)
    }
}