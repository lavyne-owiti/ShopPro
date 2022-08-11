package dev.lavyne.shoppro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.lavyne.shoppro.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupbottomNav()

    }
    fun setupbottomNav(){
        binding.bottomNav.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.homes ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,HomeFragment()).commit()
                    true
                }
                R.id.category ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,CategoryFragment()).commit()
                    true
                }
                R.id.favourite ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,FavouriteFragment()).commit()
                    true
                }
                R.id.cart ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,CartFragment()).commit()
                    true
                }
                R.id.profile ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,ProfileFragment()).commit()
                    true
                }
                else->false
            }

        }
    }
}