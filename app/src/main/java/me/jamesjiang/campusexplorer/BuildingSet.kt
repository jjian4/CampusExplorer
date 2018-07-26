package me.jamesjiang.campusexplorer


val academicBuildings = BuildingSet(
        setOf(
                Building("Bob and Betty Beyster (BBB)", Building.Category.Academic, Building.Area.North,
                        "https://campusinfo.umich.edu/building-search/building/525/bob-and-betty-beyster-building"),

                Building("Chemistry Dow Lab", Building.Category.Academic, Building.Area.Central,
                        "https://campusinfo.umich.edu/building-search/building/34/chemistry-dow-willard-h-laboratory"),

                Building("East Hall", Building.Category.Academic, Building.Area.Central,
                        "https://campusinfo.umich.edu/building-search/building/53/east-hall"),

                Building("Modern Languages Building", Building.Category.Academic, Building.Area.Central,
                        "https://campusinfo.umich.edu/building-search/building/111/modern-languages-building")
        )
)

val administrativeBuildings = BuildingSet(
        setOf(
                Building("1027 East Huron Building", Building.Category.Administrative, Building.Area.Central,
                        "https://campusinfo.umich.edu/building-search/building/537/1027-east-huron-building"),

                Building("Madison Building", Building.Category.Administrative, Building.Area.Central,
                        "https://campusinfo.umich.edu/building-search/building/173/madison-building")
        )
)

val housingBuildings = BuildingSet(
        setOf(
                Building("Alice Llyod Hall", Building.Category.Housing, Building.Area.Central,
                        "http://www.housing.umich.edu/undergrad/alice-lloyd-hall"),

                Building("Betsy Barbour House", Building.Category.Housing, Building.Area.Central,
                        "http://www.housing.umich.edu/undergrad/betsy-barbour-house")


        )
)

val librariesMuseumsBuildings = BuildingSet(
        setOf(
                Building("Bentley Historical Library", Building.Category.Library, Building.Area.North,
                        "https://campusinfo.umich.edu/building-search/building/19/bentley-alvin-m-arvella-d-historical-library")

        )
)

val medicalBuildings = BuildingSet(
        setOf(
                Building("300 N Ingalls Building", Building.Category.Medical, Building.Area.Other,
                        "https://campusinfo.umich.edu/building-search/building/570/300-n-ingalls-building"),

                Building("Bradford House", Building.Category.Medical, Building.Area.Other,
                        "https://campusinfo.umich.edu/building-search/building/592/bradford-house")
        )
)

val athleticBuildings = BuildingSet(
        setOf(
                Building("Bahna Wrestling Center", Building.Category.Athletic, Building.Area.Other,
                        "https://campusinfo.umich.edu/building-search/building/575/bahna-wrestling-center"),

                Building("Cliff Keen Arena", Building.Category.Athletic, Building.Area.Other,
                        "https://campusinfo.umich.edu/building-search/building/37/keen-clifford-p-arena"),

                Building("Crisler Center", Building.Category.Athletic, Building.Area.Other,
                        "https://campusinfo.umich.edu/building-search/building/35/crisler-center")
        )
)

val studentLifeBuildings = BuildingSet(
        setOf(
                Building("Alumni Center", Building.Category.Student_Life, Building.Area.Central,
                        "https://campusinfo.umich.edu/building-search/building/10/alumni-center"),

                Building("Argus Building I", Building.Category.Student_Life, Building.Area.Other,
                        "https://campusinfo.umich.edu/building-search/building/14/argus-building-i"),

                Building("Burnham House", Building.Category.Student_Life, Building.Area.Central,
                        "https://campusinfo.umich.edu/building-search/building/13/burnham-house"),

                Building("Campus Farm", Building.Category.Student_Life, Building.Area.Other,
                        "http://sustainability.umich.edu/umsfp/about/campus-farm")
        )
)