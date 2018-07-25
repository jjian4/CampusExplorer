package me.jamesjiang.campusexplorer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_buildings.*

//Displays list of buildings, with filter and search options
//Default constructor must be defined for activity to be included in manifest (will not be used)
class BuildingsActivity(): AppCompatActivity() {

    var buildingsList: List<Building> = listOf(Building("Test", Building.Area.North, "texting", "testinggg"))

    //Constructor that is used when choosing building category
    constructor(passedBuildingsList: List<Building>): this() {
        this.buildingsList = passedBuildingsList

        Log.d("James", this.buildingsList.toString())
        Log.d("James", buildingsList.toString())
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buildings)

        Log.d("James", buildingsList.toString())

        //Recyclerview of buildings, with default radio button at all
        recylcerview_buildings.layoutManager = LinearLayoutManager(this)
        /*var buildingsList = Building.academicBuildings.toMutableList()
        buildingsList.sortBy { it.name }*/
        recylcerview_buildings.adapter = BuildingsAdapter(this, buildingsList)


        //List changes depending on which campus (radio button) is selected
        val centralList = buildingsList.filter { building -> building.area == Building.Area.Central }
        val northList = buildingsList.filter { building -> building.area == Building.Area.North }
        val otherList = buildingsList.filter { building -> building.area == Building.Area.Other }

        radioGroup.setOnCheckedChangeListener{_, isChecked ->
            when(isChecked) {
                radioButton_all.id -> recylcerview_buildings.adapter = BuildingsAdapter(this, buildingsList)
                radioButton_central.id -> recylcerview_buildings.adapter = BuildingsAdapter(this, centralList)
                radioButton_north.id -> recylcerview_buildings.adapter = BuildingsAdapter(this, northList)
                radioButton_other.id -> recylcerview_buildings.adapter = BuildingsAdapter(this, otherList)
            }
        }

    }

}