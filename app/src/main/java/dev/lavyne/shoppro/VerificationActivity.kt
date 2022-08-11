package dev.lavyne.shoppro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lavyne.shoppro.databinding.ActivityForgotPasswordBinding
import dev.lavyne.shoppro.databinding.ActivityVerificationBinding

class VerificationActivity : AppCompatActivity() {
    lateinit var binding: ActivityVerificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityVerificationBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        clicks()
    }
    fun clicks(){
        binding.btnVerification.setOnClickListener {
            val intent=Intent(this,ResetPassordActivity::class.java)
            startActivity(intent)
        }
    }
}