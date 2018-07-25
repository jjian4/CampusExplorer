package me.jamesjiang.campusexplorer

import java.io.Serializable

//Data class for an individual building
data class Building(val name: String,
                    val area: Area,
                    val mapQuery: String,
                    val site: String): Serializable {

    enum class Area {
        Central,
        North,
        Other
    }

}

