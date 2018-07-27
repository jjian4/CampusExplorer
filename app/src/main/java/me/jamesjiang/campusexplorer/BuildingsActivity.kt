package me.jamesjiang.campusexplorer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.util.TypedValue
import kotlinx.android.synthetic.main.activity_buildings.*

//Displays list of buildings, with filter and search options
//Default constructor must be defined for activity to be included in manifest (will not be used)
class BuildingsActivity(): AppCompatActivity() {

    //Initialize buttonID, which is passed from BuildingsAdapter to BuildingInfoActivity
    var buttonID = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buildings)

        //Get passed-in ID of button that was pressed, will be used in info back button
        buttonID = intent.getIntExtra("Button ID", 2)

        //Get passed-in category title
        val category = intent.getStringExtra("Category") as String
        textView_category.text = category
        //If category title is large, decrease the font
        if (category.count() > 15) {
            textView_category.textSize = 27.toFloat()
        }


        //Go back to categories if clicked
        button_backto_categories.setOnClickListener {
            val backtoCategoriesIntent = Intent(this, CategoriesActivity::class.java)
            startActivity(backtoCategoriesIntent)
        }


        //Get passed-in serializable set of buildings from CategoriesActivity
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