package dev.lavyne.shoppro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lavyne.shoppro.databinding.ActivityOnBoardingBinding

class OnBoardingtwoActivity : AppCompatActivity() {
    lateinit var binding: ActivityOnBoardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityOnBoardingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val intent=Intent(this,OnBoardingthreeActivity::class.java)
        startActivity(intent)
    }

}