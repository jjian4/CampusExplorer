package me.jamesjiang.campusexplorer

import java.io.Serializable

data class BuildingSet(val set: Set<Building>): Serializable
{

    companion object {

        val academicBuildings = BuildingSet(
                setOf(
                        Building("Bob and Betty Beyster", Building.Area.North, "bob+and+betty+beyster+building",
                                "https://campusinfo.umich.edu/building-search/building/525/bob-and-betty-beyster-building"),

                        Building("Chemistry Building", Building.Area.Central, "chemistry+building",
                                "https://campusinfo.umich.edu/building-search/building/34/chemistry-dow-willard-h-laboratory"),

                        Building("East Hall - Mathematics", Building.Area.Central, "department+of+mathematics",
                                "https://campusinfo.umich.edu/building-search/department/928/department-of-mathematics"),

                        Building("East Hall - Psychology", Building.Area.Central, "department+of+psychology",
                                "https://campusinfo.umich.edu/building-search/department/1948/department-of-psychology"),

                        Building("Modern Languages Building", Building.Area.Central, "modern+language+building",
                                "https://campusinfo.umich.edu/building-search/building/111/modern-languages-building")
                )
        )

    }

}