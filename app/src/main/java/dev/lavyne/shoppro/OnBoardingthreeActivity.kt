package dev.lavyne.shoppro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lavyne.shoppro.databinding.ActivityOnBoardBinding

class OnBoardingthreeActivity : AppCompatActivity() {
    lateinit var binding: ActivityOnBoardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityOnBoardBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        clickable()
    }
    fun clickable(){
        binding.btnStart.setOnClickListener {
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}