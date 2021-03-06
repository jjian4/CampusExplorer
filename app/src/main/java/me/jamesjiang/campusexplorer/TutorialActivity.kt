package me.jamesjiang.campusexplorer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_tutorial.*

//Tutorial mainly for first-time users, contains slideshow with screenshots and descriptions
class TutorialActivity : AppCompatActivity() {

    var imgPath: IntArray = intArrayOf(
            R.drawable.tutorial_intro,
            R.drawable.categories_sample,
            R.drawable.buildings_campus_sample,
            R.drawable.buildings_search_keyboard_sample,
            R.drawable.building_info_sample,
            R.drawable.favorites_demo,
            R.drawable.directions_sample,
            R.drawable.white_background
    )


    var textPath: IntArray = intArrayOf(
            R.string.tutorial_textview_intro,
            R.string.tutorial_textview_categories,
            R.string.tutorial_textview_buildings_campus,
            R.string.tutorial_textview_buildings_search,
            R.string.tutorial_textview_building_info,
            R.string.tutorial_textview_favoriting,
            R.string.tutorial_textview_directions,
            R.string.tutorial_textview_outro
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        var mPager = pager_tutorial as ViewPager
        var adapter: PagerAdapter = TutorialPagerAdapter(this, textPath, imgPath)
        //Tab dots below the view pager
        //https://stackoverflow.com/questions/20586619/android-viewpager-with-bottom-dots/20586667
        tutorial_tab_dots.setupWithViewPager(mPager, true)

        mPager.adapter = adapter
        mPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffSet: Float, positionOffSetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                //Toast.makeText(this@TutorialActivity, path[position], Toast.LENGTH_LONG).show()

            }
        })
    }
}
