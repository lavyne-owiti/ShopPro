package dev.lavyne.shoppro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lavyne.shoppro.databinding.ActivityConfirmPasswordBinding

class ConfirmPasswordActivity : AppCompatActivity() {
    lateinit var binding:ActivityConfirmPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityConfirmPasswordBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}