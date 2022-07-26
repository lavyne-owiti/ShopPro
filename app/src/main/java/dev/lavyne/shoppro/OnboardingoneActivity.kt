package dev.lavyne.shoppro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lavyne.shoppro.databinding.ActivityOnbordingBinding

class OnboardingoneActivity : AppCompatActivity() {
   lateinit var binding: ActivityOnbordingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityOnbordingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val intent=Intent(this,OnBoardingtwoActivity::class.java)
        startActivity(intent)
    }
}