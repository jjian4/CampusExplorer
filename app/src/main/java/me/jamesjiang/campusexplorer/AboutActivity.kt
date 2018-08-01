package me.jamesjiang.campusexplorer

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*

//Introduction view that is seen by first-time users and users who click info button, goes to tutorial
class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val firstRunSharedPreferences = FirstRunSharedPreferences(this)
        //Disable goto_categories button
        if (firstRunSharedPreferences.getFirstRunCheck() == true) {
            button_about_goto_categories.backgroundTintList = this.resources.getColorStateList(R.color.disabled, null)
            button_about_goto_categories.setTextColor(Color.DKGRAY)
        }

        button_goto_tutorial.setOnClickListener {
            //No longer first-time user
            firstRunSharedPreferences.setFirstRunCheck(false)

            val tutorialIntent = Intent(this, TutorialActivity::class.java)
            startActivity(tutorialIntent)
        }

        //Explore the Campus button
        button_about_goto_categories.setOnClickListener {
            //Only works when tutorial has been completed
            if(firstRunSharedPreferences.getFirstRunCheck() == false) {
                val categoriesIntent = Intent(this, CategoriesActivity::class.java)
                startActivity(categoriesIntent)
            }
        }
    }
}
