package dev.lavyne.shoppro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lavyne.shoppro.databinding.ActivitySignUp2Binding

class SIgnUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUp2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivitySignUp2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        clicks()
    }
    fun clicks(){
        binding.tvsignin.setOnClickListener {
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

    }
    fun displayError(){

    }
}
