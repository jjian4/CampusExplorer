package me.jamesjiang.campusexplorer

import java.io.Serializable

data class Building(val name: String,
                    val area: Area,
                    val mapQuery: String,
                    val site: String): Serializable {

    enum class Area {
        Central,
        North,
        Other
    }

    companion object {

        //Set of all buildings with their name, campus, and urls
        val buildings: Set<Building> = setOf(
                Building("Bob and Betty Beyster", Area.North, "bob+and+betty+beyster+building",
                        "https://campusinfo.umich.edu/building-search/building/525/bob-and-betty-beyster-building"),

                Building("Chemistry Building", Area.Central, "chemistry+building",
                        "https://campusinfo.umich.edu/building-search/building/34/chemistry-dow-willard-h-laboratory"),

                Building("East Hall - Mathematics", Area.Central, "department+of+mathematics",
                        "https://campusinfo.umich.edu/building-search/department/928/department-of-mathematics"),

                Building("East Hall - Psychology", Area.Central, "department+of+psychology",
                        "https://campusinfo.umich.edu/building-search/department/1948/department-of-psychology"),

                Building("Modern Languages Building", Area.Central, "modern+language+building",
                        "https://campusinfo.umich.edu/building-search/building/111/modern-languages-building")
        )
    }
}

