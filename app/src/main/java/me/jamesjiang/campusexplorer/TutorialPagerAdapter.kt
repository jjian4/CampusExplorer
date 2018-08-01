package me.jamesjiang.campusexplorer

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v4.view.PagerAdapter
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class TutorialPagerAdapter(var con: Context, var textPath: IntArray, var imgPath: IntArray): PagerAdapter() {


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
         return view == `object` as ConstraintLayout
    }

    override fun getCount(): Int {
        return imgPath.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflator = con.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rv: View = inflator.inflate(R.layout.fragment_tutorial,container, false)

        val description = rv.findViewById<TextView>(R.id.textView_tutorial_slide_description)
        val img = rv.findViewById<ImageView>(R.id.imageView_tutorial)

        //Set the description
        Log.d("James", rv.resources.getString(textPath[position]))
        description.text = rv.resources.getString(textPath[position])


        //Set the image
        img.setImageResource(imgPath[position])
        container.addView(rv)
        img.setOnClickListener {
            Toast.makeText(con, "You clicked image: "+ (position+1), Toast.LENGTH_LONG).show()
        }

        return rv
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ConstraintLayout)
    }
}