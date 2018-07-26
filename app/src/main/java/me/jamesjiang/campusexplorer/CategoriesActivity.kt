package me.jamesjiang.campusexplorer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_categories.*

//User chooses which category of buildings they would like to view
class CategoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)


        button_academic.setOnClickListener {
            sendToBuildingsActivity(button_academic, academicBuildings)
        }

        button_administrative.setOnClickListener {
            sendToBuildingsActivity(button_administrative, administrativeBuildings)
        }

        button_housing_libraries_museums.setOnClickListener {
            val combinedSet = combineSets(listOf(
                    housingBuildings,
                    librariesMuseumsBuildings))
            sendToBuildingsActivity(button_housing_libraries_museums, combinedSet)
        }

        button_medical.setOnClickListener {
            sendToBuildingsActivity(button_medical, medicalBuildings)
        }

        button_athletic_student_life.setOnClickListener {
            val combinedSet = combineSets(listOf(
                    athleticBuildings,
                    studentLifeBuildings
            ))
            sendToBuildingsActivity(button_athletic_student_life, combinedSet)
        }

        button_favorites.setOnClickListener {
            val allBuildings = combineSets(listOf(
                    academicBuildings,
                    administrativeBuildings,
                    housingBuildings,
                    librariesMuseumsBuildings,
                    medicalBuildings,
                    athleticBuildings,
                    studentLifeBuildings
            ))

            val favoritesSharedPreferences = FavoritesSharedPreferences(this)
            var favoriteBuildingNames = favoritesSharedPreferences.getFavoritesSet()

            //Filter out the buildings that have names that match the names in the favorites set
            var favoriteBuildings = allBuildings.set.filter{
                building ->favoriteBuildingNames.any{it == building.name} }.toSet()

            sendToBuildingsActivity(button_favorites, BuildingSet(favoriteBuildings))
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
            sendToBuildingsActivity(button_all, combinedSet)
        }

    }


    //Pass a specific set of buildings to BuildingsActivity to list them out
    fun sendToBuildingsActivity(button: Button, buildingsSet: BuildingSet) {
        val buildingsIntent = Intent(this, BuildingsActivity::class.java)
        buildingsIntent.putExtra("Category", button.text)
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
