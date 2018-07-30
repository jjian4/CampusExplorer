package me.jamesjiang.campusexplorer.BuildingSets

import me.jamesjiang.campusexplorer.Area
import me.jamesjiang.campusexplorer.Building
import me.jamesjiang.campusexplorer.BuildingSet
import me.jamesjiang.campusexplorer.Category

val housingBuildings = BuildingSet(
        setOf(
                Building("Alice Llyod Hall (ALH)", Category.Housing, Area.Central, 9),

                Building("Betsy Barbour House", Category.Housing, Area.Central, 20),

                Building("Bursley Hall (BURS)", Category.Housing, Area.North, 24),

                Building("Couzens Hall", Category.Housing, Area.Central, 44),

                Building("East Quadrangle (EQ)", Category.Housing, Area.Central, 54),

                Building("Fletcher Hall", Category.Housing, Area.Central, 59),

                Building("Henderson House", Category.Housing, Area.Central, 96),

                Building("Martha Cook Residence", Category.Housing, Area.Central, 95),

                Building("Mary Markley Hall", Category.Housing, Area.Central, 97),

                Building("Mosher-Jordan Hall (MOJO)", Category.Housing, Area.Central, 112),

                Building("Munger Graduate Residences", Category.Housing, Area.Central, 600),

                Building("Newberry Residence", Category.Housing, Area.Central, 117),

                Building("North Quadrangle (NQ)", Category.Housing, Area.Central, 553),

                Building("Northwood I Apartments", Category.Housing, Area.North, 122,
                        "1647 BEAL AVE"),

                Building("Northwood II Apartments", Category.Housing, Area.North, 123,
                        "1789 BEAL AVE"),

                Building("Northwood III Apartments", Category.Housing, Area.North, 124,
                        "2155 CRAM PL"),

                Building("Northwood IV Apartments", Category.Housing, Area.North, 125,
                        "1112-1116 MCINTYRE DR"),

                Building("Northwood IV Apartments", Category.Housing, Area.North, 566,
                        "2101 Stone Rd"),

                Building("Oxford Housing", Category.Housing, Area.Central,
                        "http://www.housing.umich.edu/undergrad/oxford-housing",
                        "623 Oxford Road"),

                Building("South Quadrangle (SQ)", Category.Housing, Area.Central, 141),

                Building("Stockwell Hall", Category.Housing, Area.Central, 172),

                Building("Vera Baits Housing", Category.Housing, Area.North,
                        "http://www.housing.umich.edu/undergrad/baits"),

                Building("West Quadrangle (WQ)", Category.Housing, Area.Central, 164)
        )
)

val librariesMuseumsBuildings = BuildingSet(
        setOf(
                Building("Bentley Historical Library", Category.Library, Area.North, 19),

                Building("Buhr Building", Category.Library, Area.Central, 23),

                Building("Detroit Observatory", Category.Museum, Area.Central, 189),

                Building("Duderstadt Center", Category.Library, Area.North, 181),

                Building("Gerald Ford Library", Category.Library, Area.North, 62),

                Building("Hatcher Graduate Library", Category.Library, Area.Central, 65),

                Building("Kelsey Museum of Archaeology", Category.Museum, Area.Central,
                        "https://lsa.umich.edu/kelsey"),

                Building("Kresge Library (K-BUS)", Category.Library, Area.Central, 523),

                Building("Law Library", Category.Library, Area.Central, 166,
                        "801 MONROE ST"),

                Building("Musuem of Art (UMMA)", Category.Museum, Area.Central, 11),

                Building("Research Museums Center (RMC)", Category.Museum, Area.Other, 533,
                        "3600 VARSITY DR"),

                Building("Ruthven Museums Building", Category.Museum, Area.Central, 8),

                Building("Shapiro Library (UGLI)", Category.Library, Area.Central, 139),

                Building("Taubman Health Sciences Library (TAUBL)", Category.Library, Area.Other, 149),

                Building("William Clements Library", Category.Library, Area.Central, 165)
        )
)