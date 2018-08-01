package me.jamesjiang.campusexplorer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_restore.*

//Restoring the app removes all buildings from favorites and takes user back to tutorial as first-timer
class RestoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restore)

        button_restore_app.setOnClickListener {
            //Remove favorites
            val favoritesSharedPreferences = FavoritesSharedPreferences(this)
            favoritesSharedPreferences.setFavoritesSet(mutableSetOf())

            //Change first-time shared pref
            val firstRunSharedPreferences = FirstRunSharedPreferences(this)
            firstRunSharedPreferences.setFirstRunCheck(true)

            //Go to about/tutorial
            val aboutIntent = Intent(this, AboutActivity::class.java)
            startActivity(aboutIntent)
        }

        button_restore_backto_categories.setOnClickListener {
            val categoriesIntent = Intent(this, CategoriesActivity::class.java)
            startActivity(categoriesIntent)
        }
    }
}
