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
            var buildingsList = Building.academicBuildings.toMutableList()
            buildingsList.sortBy { it.name }

            sendToBuildingsActivity(buildingsList)
        }
    }

    fun sendToBuildingsActivity(buildingsList: List<Building>) {
        val buildingsActivity = BuildingsActivity(buildingsList)
        val buildingsIntent = Intent(this, buildingsActivity::class.java)
        startActivity(buildingsIntent)
    }
}
