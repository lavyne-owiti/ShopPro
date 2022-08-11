package dev.lavyne.shoppro

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import dev.lavyne.shoppro.databinding.ActivityOnbordingBinding


class OnboardingoneActivity : AppCompatActivity() {
   lateinit var binding: ActivityOnbordingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityOnbordingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        pager()
        var page=viewpagerAdapter(this)
        binding.viewpager.adapter=page
        binding.dotsIndicator.setViewPager(binding.viewpager)
         binding.btngetStarted.setOnClickListener {
             val intent=Intent(this,LoginActivity::class.java)
             startActivity(intent)
         }

    }
    fun pager(){
        binding.viewpager.addOnPageChangeListener(object :ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }
            override fun onPageSelected(position: Int) {
//               Log.i("tag",position.toString())
                if (position==2){
                    binding.btngetStarted.visibility=View.VISIBLE
                }
            }
            override fun onPageScrollStateChanged(state: Int) {
            }
        })
    }
}