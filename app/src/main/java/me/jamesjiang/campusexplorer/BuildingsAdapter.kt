package me.jamesjiang.campusexplorer

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.buildings_row.view.*

//Adapter for recyclerview of buildings
class BuildingsAdapter(val buildings: Set<String>): RecyclerView.Adapter<CustomViewHolder>() {

    override fun getItemCount(): Int {
        return buildings.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val cellForRow = layoutInflater.inflate(R.layout.buildings_row, p0, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val buildingsList = buildings.toMutableList()
        buildingsList.sort()
        holder.view.textView_building?.text = buildingsList.get(position)
    }

}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {
}