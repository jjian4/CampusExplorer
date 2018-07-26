package me.jamesjiang.campusexplorer

import java.io.Serializable

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
        StudentLife
    }

}

