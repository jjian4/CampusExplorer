package me.jamesjiang.campusexplorer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_categories.*

//User chooses which category of buildings they would like to view
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

        button_housing_libraries_museums.setOnClickListener {
            val combinedSet = combineSets(listOf(
                    housingBuildings,
                    librariesMuseumsBuildings))
            sendToBuildingsActivity(combinedSet)
        }

        button_medical.setOnClickListener {
            sendToBuildingsActivity(medicalBuildings)
        }

        button_athletic_student_life.setOnClickListener {
            val combinedSet = combineSets(listOf(
                    athleticBuildings,
                    studentLifeBuildings
            ))
            sendToBuildingsActivity(combinedSet)
        }

        button_favorites.setOnClickListener {
            //IMPLEMENT
        }

        button_all.setOnClickListener {
            val combinedSet = combineSets(listOf(
                    academicBuildings,
                    administrativeBuildings,
                    housingBuildings,
                    librariesMuseumsBuildings,
                    medicalBuildings,
                    athleticBuildings,
                    studentLifeBuildings
            ))
            sendToBuildingsActivity(combinedSet)
        }

    }


    //Pass a specific set of buildings to BuildingsActivity to list them out
    fun sendToBuildingsActivity(buildingsSet: BuildingSet) {
        val buildingsIntent = Intent(this, BuildingsActivity::class.java)
        buildingsIntent.putExtra("Category", getText(R.string.academic_button).toString())
        buildingsIntent.putExtra("Building set", buildingsSet)
        startActivity(buildingsIntent)
    }

    //Combine building sets together
    fun combineSets(sets: List<BuildingSet>): BuildingSet {
        var combinedSet = emptySet<Building>()
        for (i in sets) {
            combinedSet = combinedSet.union(i.set)
        }
        return BuildingSet(combinedSet)
    }
}
