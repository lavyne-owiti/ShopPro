package dev.lavyne.shoppro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val intent=Intent(this,OnboardingoneActivity::class.java)
        startActivity(intent)
    }
}