package me.jamesjiang.campusexplorer

import java.io.Serializable

//Data Class for holding the different sets of buildings, serializable to pass between activities
//Buildings found at https://maps.studentlife.umich.edu/building
data class BuildingSet(val set: Set<Building>): Serializable

//Data class for an individual building
data class Building(val name: String,
                    val category: Category,
                    val area: Area,
                    val site: String): Serializable {

    enum class Area {
        Central,
        North,
        Other
    }

    enum class Category {
        Academic,
        Administrative,
        Athletic,
        Housing,
        Library,
        Museum,
        Medical,
        Student_Life
    }

}


