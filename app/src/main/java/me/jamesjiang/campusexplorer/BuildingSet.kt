package me.jamesjiang.campusexplorer


val academicBuildings = BuildingSet(
        setOf(
                Building("Bob and Betty Beyster (BBB)", Category.Academic, Area.North, 525),

                Building("Chemistry Dow Lab", Category.Academic, Area.Central, 34),

                Building("East Hall", Category.Academic, Area.Central, 53),

                Building("Modern Languages Building", Category.Academic, Area.Central, 111)
        )
)

val administrativeBuildings = BuildingSet(
        setOf(
                Building("1027 East Huron Building", Category.Administrative, Area.Central, 537),

                Building("Madison Building", Category.Administrative, Area.Central, 173)
        )
)

val housingBuildings = BuildingSet(
        setOf(
                Building("Alice Llyod Hall", Category.Housing, Area.Central, 9),

                Building("Betsy Barbour House", Category.Housing, Area.Central, 20)

        )
)

val librariesMuseumsBuildings = BuildingSet(
        setOf(
                Building("Bentley Historical Library", Category.Library, Area.North, 19)

        )
)

val medicalBuildings = BuildingSet(
        setOf(
                Building("300 N Ingalls Building", Category.Medical, Area.Other, 570),

                Building("Bradford House", Category.Medical, Area.Other, 592)
        )
)

val athleticBuildings = BuildingSet(
        setOf(
                Building("Bahna Wrestling Center", Category.Athletic, Area.Other, 575),

                Building("Cliff Keen Arena", Category.Athletic, Area.Other, 37),

                Building("Crisler Center", Category.Athletic, Area.Other, 35)
        )
)

val studentLifeBuildings = BuildingSet(
        setOf(
                Building("Alumni Center", Category.Student_Life, Area.Central, 10),

                Building("Argus Building I", Category.Student_Life, Area.Other, 14),

                Building("Burnham House", Category.Student_Life, Area.Central, 13),

                Building("Campus Farm", Category.Student_Life, Area.Other,
                        "http://sustainability.umich.edu/umsfp/about/campus-farm")
        )
)