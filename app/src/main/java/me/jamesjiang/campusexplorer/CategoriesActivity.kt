package me.jamesjiang.campusexplorer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_categories.*

class CategoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)


        button_academic.setOnClickListener {
            sendToBuildingsActivity(academicBuildings)
        }

        button_administrative.setOnClickListener {
            sendToBuildingsActivity(administrativeBuildings)
        }

        //COMPLETE BELOW
        button_housing_libraries.setOnClickListener {
            val combinedSet = BuildingSet(librariesBuildings.set.union(housingBuildings.set))
            sendToBuildingsActivity(combinedSet)
        }

        button_medical.setOnClickListener {

        }

        button_sports_student_life.setOnClickListener {

        }

        button_favorites.setOnClickListener {

        }

        button_all.setOnClickListener {

        }

    }



    fun sendToBuildingsActivity(buildingsSet: BuildingSet) {
        val buildingsIntent = Intent(this, BuildingsActivity::class.java)
        buildingsIntent.putExtra("Category", getText(R.string.academic_button).toString())
        buildingsIntent.putExtra("Building set", buildingsSet)
        startActivity(buildingsIntent)
    }
}
