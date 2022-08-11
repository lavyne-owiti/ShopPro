package dev.lavyne.shoppro

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter

class viewpagerAdapter(val context:Context):PagerAdapter() {
    var layoutInflater:LayoutInflater?=null
//    arrays of images,head,description
    val imgArray= arrayOf(
    R.drawable.hood,
    R.drawable.banner,
    R.drawable.wall
    )
    val headarray= arrayOf(
        "HOODIES",
        "BANNERS",
        "WALL BRANDING"
    )
    val descriptarray= arrayOf(
        "Hoodies are customized to your own liking",
        " Custom printed banners with the highest quality.",
        "Every stroke has a story to tell"
    )
    val discountarray= arrayOf(
        "DISCOUNT 3%",
        "DISCOUNT 2%",
        "DISCOUNT 2%"
    )
    override fun getCount(): Int {
        return headarray.size

    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return  view ==`object` as ConstraintLayout

    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
        val view=layoutInflater!!.inflate(R.layout.slider,container,false)

        val img =view.findViewById<ImageView>(R.id.imgprofileimage)
        val heading=view.findViewById<TextView>(R.id.tvHead)
        val statement=view.findViewById<TextView>(R.id.tvStatement)
        val discount=view.findViewById<TextView>(R.id.tvDis)
        img.setImageResource(imgArray[position])
        heading.text=headarray[position]
        statement.text=descriptarray[position]
        discount.text=discountarray[position]
        container.addView(view)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ConstraintLayout)
    }
}