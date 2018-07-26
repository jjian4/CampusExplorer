package me.jamesjiang.campusexplorer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_buildings.*

//Displays list of buildings, with filter and search options
//Default constructor must be defined for activity to be included in manifest (will not be used)
class BuildingsActivity(): AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buildings)

        //Get passed-in category title
        val category = intent.getStringExtra("Category") as String
        textView_category.text = category

        //Get passed-in serialiable set of buildings from CategoriesActivity
        var buildingSet = intent.getSerializableExtra("Building set") as BuildingSet

        //Convert to a list
        val buildingsList = buildingSet.set.toMutableList()
        buildingsList.sortBy { it.name }

        //Recyclerview of buildings, with radio button defaulted at all
        recylcerview_buildings.layoutManager = LinearLayoutManager(this)
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