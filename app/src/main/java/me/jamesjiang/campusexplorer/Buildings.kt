package me.jamesjiang.campusexplorer

import java.io.Serializable

//Data Class for holding the different sets of buildings, serializable to pass between activities
//Buildings found at https://maps.studentlife.umich.edu/building
data class BuildingSet(val set: Set<Building>): Serializable

//Data class for an individual building
data class Building(val name: String,
                    val category: Category,
                    val area: Area,
                    var site: String): Serializable {

    //Constructor depends on whether campusinfo.umich.edu/building-search/ or another site is used
    constructor(name: String,
                category: Category,
                area: Area,
                siteNum: Int): this(name, category, area, "") {
        //Can't access resources because not in a context or activity, so hardcoded
        this.site = "https://campusinfo.umich.edu/building-search/building/" + siteNum.toString()
    }

}

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