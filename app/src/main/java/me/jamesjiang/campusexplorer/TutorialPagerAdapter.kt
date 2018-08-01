package me.jamesjiang.campusexplorer

import android.content.Context
import android.content.Intent
import android.support.constraint.ConstraintLayout
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

//Adapter for the viewpager fragment that contains the tutorial images and descriptions
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
        val img = rv.findViewById<ImageView>(R.id.imageView_tutorial_screenshots)

        //Set the description
        description.text = rv.resources.getString(textPath[position])


        //Set the image
        img.setImageResource(imgPath[position])
        container.addView(rv)
        img.setOnClickListener {
            Toast.makeText(con, "Tutorial image "+ (position+1), Toast.LENGTH_SHORT).show()
        }

        //Show app name and goto_categories button in last slide
        val title = rv.findViewById<TextView>(R.id.textView_tutorial_appname)
        val categoriesButton = rv.findViewById<Button>(R.id.button_tutorial_goto_categories)
        val searchImage = rv.findViewById<ImageView>(R.id.imageView_tutorial_search)
        if (position == imgPath.size - 1) {
            title.visibility = View.VISIBLE
            categoriesButton.visibility = View.VISIBLE
            searchImage.visibility = View.VISIBLE

            categoriesButton.setOnClickListener {
                val categoriesIntent = Intent(con, CategoriesActivity::class.java)
                con.startActivity(categoriesIntent)
            }

        }


        return rv
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ConstraintLayout)
    }
}