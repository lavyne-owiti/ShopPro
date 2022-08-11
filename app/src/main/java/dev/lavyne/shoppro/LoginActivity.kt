package dev.lavyne.shoppro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lavyne.shoppro.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        clickable()
        validate()
    }
    fun clickable(){
        binding.tvSignup.setOnClickListener {
            val intent=Intent(this,SIgnUpActivity::class.java)
            startActivity(intent)
        }
        binding.tvForgPassword.setOnClickListener {
            val intent=Intent(this,ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

    }
    fun validate(){
        var error=false
        binding.tilPassword.error=null
        binding.tilEmail.error=null
        var email=binding.etEmail.text.toString()
        var password=binding.etPassword.text.toString()
        if(email.isBlank()){
            binding.tilEmail.error="Email is required"
            error=true
        }
        if(password.isBlank()){
            binding.tilPassword.error="Password is required"
            error=true
        }
        if (!error){

        }

    }
}