package me.jamesjiang.campusexplorer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_tutorial.*

class TutorialActivity : AppCompatActivity() {

    var imgPath: IntArray = intArrayOf(
            R.drawable.ic_back_button,
            R.drawable.ic_empty_star,
            R.drawable.ic_filled_star,
            R.drawable.ic_info)


    var textPath: IntArray = intArrayOf(
            R.string.tutorial_textview_0,
            R.string.tutorial_textview_2,
            R.string.tutorial_textview_1,
            R.string.tutorial_textview_2)

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
