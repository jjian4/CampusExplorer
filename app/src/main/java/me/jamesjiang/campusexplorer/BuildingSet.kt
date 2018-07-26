package me.jamesjiang.campusexplorer

import java.io.Serializable

//Class for holding the different sets of buildings, serializable to pass between activities
data class BuildingSet(val set: Set<Building>): Serializable


val academicBuildings = BuildingSet(
        setOf(
                Building("Bob and Betty Beyster (BBB)", Building.Area.North,
                        "https://campusinfo.umich.edu/building-search/building/525/bob-and-betty-beyster-building"),

                Building("Chemistry Dow Lab", Building.Area.Central,
                        "https://campusinfo.umich.edu/building-search/building/34/chemistry-dow-willard-h-laboratory"),

                Building("East Hall", Building.Area.Central,
                        "https://campusinfo.umich.edu/building-search/building/53/east-hall"),

                Building("Modern Languages Building", Building.Area.Central,
                        "https://campusinfo.umich.edu/building-search/building/111/modern-languages-building")
        )
)

val administrativeBuildings = BuildingSet(
        setOf(
                Building("1027 East Huron Building", Building.Area.Central,
                        "https://campusinfo.umich.edu/building-search/building/537/1027-east-huron-building"),

                Building("Madison Building", Building.Area.Central,
                        "https://campusinfo.umich.edu/building-search/building/173/madison-building")
        )
)

val housingBuildings = BuildingSet(
        setOf(
                Building("Alice Llyod Hall", Building.Area.Central,
                        "http://www.housing.umich.edu/undergrad/alice-lloyd-hall"),

                Building("Betsy Barbour House", Building.Area.Central,
                        "http://www.housing.umich.edu/undergrad/betsy-barbour-house")


        )
)

val librariesBuildings = BuildingSet(
        setOf(
                Building("Bentley Historical Library", Building.Area.North,
                        "https://campusinfo.umich.edu/building-search/building/19/bentley-alvin-m-arvella-d-historical-library")

        )
)

