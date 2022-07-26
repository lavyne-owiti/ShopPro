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
    }
    fun clickable(){
        binding.tvSignup.setOnClickListener {
            val intent=Intent(this,SIgnUpActivity::class.java)
            startActivity(intent)
        }

    }
}