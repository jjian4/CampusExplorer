package me.jamesjiang.campusexplorer

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_buildings.*

//Displays list of buildings, with filter and search options
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
        val buildingSet = intent.getSerializableExtra("Building set") as BuildingSet

        //Convert to a list
        val buildingsList = buildingSet.set.toMutableList().sortedBy { it.name }

        //Recyclerview of buildings, with radio button defaulted at all
        recylcerview_buildings.layoutManager = LinearLayoutManager(this)
        recylcerview_buildings.adapter = BuildingsAdapter(this, buildingsList)


        //List changes depending on which campus (radio button) is selected
        val centralList = buildingsList.filter { building -> building.area == Area.Central }
        val northList = buildingsList.filter { building -> building.area == Area.North }
        val otherList = buildingsList.filter { building -> building.area == Area.Other }

        radioGroup.setOnCheckedChangeListener{_, isChecked ->
            when(isChecked) {
                radioButton_all.id -> recylcerview_buildings.adapter = BuildingsAdapter(this, buildingsList)
                radioButton_central.id -> recylcerview_buildings.adapter = BuildingsAdapter(this, centralList)
                radioButton_north.id -> recylcerview_buildings.adapter = BuildingsAdapter(this, northList)
                radioButton_other.id -> recylcerview_buildings.adapter = BuildingsAdapter(this, otherList)
            }
        }


        //Toggle search vs. radio buttons
        imageButton_toggle_search.setOnClickListener {
            if (editText_search.visibility == View.VISIBLE) {
                imageButton_toggle_search.setImageResource(R.drawable.ic_search_action_maize)
                //Hide keyboard
                val imm = applicationContext.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(view.windowToken, 0)

                editText_search.visibility = View.GONE
                imageButton_search_delete.visibility = View.GONE
                imageButton_backto_radio.visibility = View.GONE
                radioGroup.visibility = View.VISIBLE
                button_backto_categories.visibility = View.VISIBLE
                //Show original list
                recylcerview_buildings.adapter = BuildingsAdapter(this, buildingsList)
                radioButton_all.isChecked = true
            }
            else {
                imageButton_toggle_search.setImageResource(R.drawable.ic_search_action_blue)
                radioGroup.visibility = View.GONE
                button_backto_categories.visibility = View.GONE
                editText_search.visibility = View.VISIBLE
                imageButton_search_delete.visibility = View.VISIBLE
                imageButton_backto_radio.visibility = View.VISIBLE
                //Show keyboard
                editText_search.requestFocus()
                val imm = applicationContext.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.toggleSoftInputFromWindow(view.windowToken, 0, 0)
            }
        }


        //Search and filter the recyclerview when Enter is clicked
        editText_search.setOnKeyListener(View.OnKeyListener {v, keyCode, event ->
            if(keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                //Hide keyboard
                editText_search.clearFocus()
                val imm = applicationContext.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(view.windowToken, 0)

                //Filter recyclerview
                var filteredList = buildingsList.filter {
                    building -> building.name.contains(editText_search.text) ||
                        building.name.toLowerCase().contains(editText_search.text) ||
                        building.name.toUpperCase().contains(editText_search.text) }
                recylcerview_buildings.adapter = BuildingsAdapter(this, filteredList)
                return@OnKeyListener true
            }
            false
        })

        //Delete text in search bar
        imageButton_search_delete.setOnClickListener {
            editText_search.text.clear()
            //Show keyboard
            val imm = applicationContext.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(editText_search, InputMethodManager.SHOW_IMPLICIT)
        }

        //Same effect as clicking toggle_search, go back to radio group view
        imageButton_backto_radio.setOnClickListener {
            imageButton_toggle_search.callOnClick()
        }

    }

}