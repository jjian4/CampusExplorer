package me.jamesjiang.campusexplorer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

//Displays list of buildings, with filter and search options
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recyclerview of buildings, with default radio button at all
        recylcerview_buildings.layoutManager = LinearLayoutManager(this)
        var buildingsList = Building.buildings.toMutableList()
        buildingsList.sortBy { it.name }
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
