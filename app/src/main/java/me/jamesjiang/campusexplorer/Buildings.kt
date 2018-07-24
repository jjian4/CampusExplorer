package me.jamesjiang.campusexplorer

import java.io.Serializable

/*
class Buildings {

    companion object {
        val buildings: Set<String> = setOf(
                "East Hall",
                "Chemistry Building",
                "Modern Languages Building"
        )
    }

}*/



data class Buildings(val name: String,
                     val area: Area,
                     val site: String,
                     val mapSite: String): Serializable {

    enum class Area {
        Central,
        North,
        Other
    }

    companion object {
        val buildings: Set<Buildings> = setOf(
                Buildings("East Hall", Area.Central, "example site", "example map"),
                Buildings("Chemistry Building", Area.Central, "example site 2", "example map 2"),
                Buildings("Modern Languages Building", Area.Central, "site 3", "map 3")
        )
    }
}

