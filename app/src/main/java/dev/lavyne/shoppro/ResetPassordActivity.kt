package dev.lavyne.shoppro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lavyne.shoppro.databinding.ActivityResetPassordBinding

class ResetPassordActivity : AppCompatActivity() {
    lateinit var binding: ActivityResetPassordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResetPassordBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        clicks()
    }
    fun clicks(){
        val intent=Intent(this,ConfirmPasswordActivity::class.java)
        startActivity(intent)
    }
}