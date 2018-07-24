package me.jamesjiang.campusexplorer

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.buildings_row.view.*

//Adapter for recyclerview of buildings
class BuildingsAdapter(val mainActivity: MainActivity, val buildingsList: List<Building>)
    : RecyclerView.Adapter<CustomViewHolder>() {

    override fun getItemCount(): Int {
        return buildingsList.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val cellForRow = layoutInflater.inflate(R.layout.buildings_row, p0, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.view.textView_building_name?.text = buildingsList.get(position).name
        holder.view.textview_area.text = buildingsList.get(position).area.toString()

        //Clicking on a building row changes activity
        holder.itemView.setOnClickListener {
            val infoIntent = Intent(mainActivity, BuildingInfoActivity::class.java)
            infoIntent.putExtra("Building", buildingsList.get(position))
            mainActivity.startActivity(infoIntent)
        }
    }

}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {
}