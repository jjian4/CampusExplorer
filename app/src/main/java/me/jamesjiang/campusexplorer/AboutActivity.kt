package me.jamesjiang.campusexplorer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_buildings.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //Explore the Campus button
        button_backto_categories.setOnClickListener {
            val categoriesIntent = Intent(this, CategoriesActivity::class.java)
            startActivity(categoriesIntent)
        }
    }
}
