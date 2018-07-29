package me.jamesjiang.campusexplorer


val academicBuildings = BuildingSet(
        setOf(
                Building("1100 North University Building", Category.Academic, Area.Central, 28),

                Building("1327 Geddes Avenue", Category.Academic, Area.Central, 543),

                Building("202 S. Thayer (STB)", Category.Academic, Area.Central, 524),

                Building("305 W Liberty", Category.Academic, Area.Central, 586),

                Building("Academic Center(ROSS AC)", Category.Academic, Area.Central, 528),

                Building("Angell Hall", Category.Academic, Area.Central, 12),

                Building("Art & Architecture Building", Category.Academic, Area.North, 16),

                Building("Association for Asian Studies", Category.Academic, Area.Central, 538),

                Building("Bob and Betty Beyster", Category.Academic, Area.North, 525),

                Building("Biological Sciences Building", Category.Academic, Area.Central, 605),

                Building("Bonisteel Interdisciplinary Research Building", Category.Academic, Area.North, 184),

                Building("Burton Memorial Tower", Category.Academic, Area.Central, 25),

                Building("Business Engagement Center", Category.Academic, Area.North, 544),

                Building("Chemistry Dow Lab", Category.Academic, Area.Central, 34),

                Building("Chrysler Center", Category.Academic, Area.Central, 36),

                Building("Cooley Building", Category.Academic, Area.North, 42),

                Building("Dana Building", Category.Academic, Area.Central, 45),

                Building("Dance Building", Category.Academic, Area.Central, 46),

                Building("Dental & W.K. Kellogg Institute", Category.Academic, Area.Central, 49),

                Building("Duderstadt Center (Media Union)", Category.Academic, Area.North, 181),

                Building("East Hall", Category.Academic, Area.Central, 53),

                Building("Electrical Engineering And Computer Science", Category.Academic, Area.North, 56),

                Building("Environmental And Water Resources Engineering", Category.Academic, Area.North, 182),

                Building("Family Assessment Clinic", Category.Academic, Area.Central, 177),

                Building("Francois-Xavier Bagnoud Building", Category.Academic, Area.North, 17),

                Building("GG Brown Laboratory", Category.Academic, Area.North, 21),

                Building("Gerstacker Building", Category.Academic, Area.North, 183),

                Building("Gorguze Family Laboratory", Category.Academic, Area.North, 57),

                Building("Haven Hall", Category.Academic, Area.Central, 542),

                Building("Herbert H. Dow Building", Category.Academic, Area.North, 51),

                Building("Hutchins Hall", Category.Academic, Area.Central, 72),

                Building("Industrial And Operations Engineering", Category.Academic, Area.North, 73),

                Building("Ingalls Mall", Category.Academic, Area.Central, 558),

                Building("Institute For Social Research", Category.Academic, Area.Central, 76),

                Building("Institute Of Continuing Legal Education", Category.Academic, Area.Other, 74),

                Building("Jeff T. Blau Hall", Category.Academic, Area.Central,
                        "https://michiganross.umich.edu/news/university-michigan-s-ross-school-business-celebrates-grand-opening-new-academic-building"),

                Building("Kraus Building", Category.Academic, Area.Central, 55),

                Building("Lane Hall", Category.Academic, Area.Central, 84),

                Building("Lay Automotive Engineering Laboratory", Category.Academic, Area.North, 86),

                Building("Lorch Hall", Category.Academic, Area.Central, 88),

                Building("Mason Hall", Category.Academic, Area.Central, 540),

                Building("Medical Science Unit I", Category.Academic, Area.Other, 104),

                Building("Medical Science Unit II", Category.Academic, Area.Other, 102),

                Building("Michigan Memorial Phoenix Project Laboratory", Category.Academic, Area.North, 60),

                Building("Modern Languages Building", Category.Academic, Area.Central, 111),

                Building("Moore Building", Category.Academic, Area.North, 52),

                Building("Naval Architecture And Marine Engineering", Category.Academic, Area.North, 113),

                Building("North Campus Research Complex", Category.Academic, Area.North,
                        "http://ncrc.umich.edu/about-ncrc"),

                Building("Nuclear Engineering Laboratories", Category.Academic, Area.North, 585),

                Building("Kinesiology Building", Category.Academic, Area.Central, 135),

                Building("College Of Pharmacy", Category.Academic, Area.Central, 130),

                Building("Public Health I (Vaughan)", Category.Academic, Area.Central, 70),

                Building("Public Health II (Francis Jr)", Category.Academic, Area.Central, 178),

                Building("Rackham Graduate School", Category.Academic, Area.Central, 71),

                Building("Randall Laboratory", Category.Academic, Area.Central, 133),

                Building("Ross School Of Business", Category.Academic, Area.Central, 547),

                Building("School of Education", Category.Academic, Area.Central, 136),

                Building("School Of Information North", Category.Academic, Area.North, 41),

                Building("School Of Nursing", Category.Academic, Area.Other, 137),

                Building("School Of Social Work", Category.Academic, Area.Central, 138),

                Building("Space Research Building", Category.Academic, Area.North, 142),

                Building("Tappan Hall", Category.Academic, Area.Central, 148),

                Building("The Law Quad", Category.Academic, Area.Central, 560),

                Building("Tisch Hall", Category.Academic, Area.Central, 541),

                Building("Towsley Center For Continuing Medical Education", Category.Academic, Area.Other, 154),

                Building("Transportation Research Institute", Category.Academic, Area.North, 190),

                Building("Undergraduate Science Building", Category.Academic, Area.Central, 508),

                Building("Weill Hall (Ford School)", Category.Academic, Area.Central, 527),

                Building("Weiser Hall", Category.Academic, Area.Central, 47),

                Building("West Hall", Category.Academic, Area.Central, 163),

                Building("Wilson Center", Category.Academic, Area.North, 587),

                Building("Wyly Hall (Business School)", Category.Academic, Area.Central, 522)
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
                Building("Bentley Historical Library", Category.Library, Area.North, 19),

                Building("Duderstadt Center", Category.Library, Area.North, 181)

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