package me.jamesjiang.campusexplorer.BuildingSets

import me.jamesjiang.campusexplorer.Area
import me.jamesjiang.campusexplorer.Building
import me.jamesjiang.campusexplorer.BuildingSet
import me.jamesjiang.campusexplorer.Category

val medicalBuildings = BuildingSet(
        setOf(
                Building("300 N Ingalls Building (NIB)", Category.Medical, Area.Other, 570),

                Building("Bradford House", Category.Medical, Area.Other, 592),

                Building("Brehm Tower", Category.Medical, Area.Other, 550),

                Building("Buhl Research Center for Human Genetics", Category.Medical, Area.Other, 22),

                Building("Cancer Center", Category.Medical, Area.Other, 31,
                        "1500 MEDICAL CENTER DR"),

                Building("Frankel Cardiovascular Center (CVC)", Category.Medical, Area.Other,
                        "1425 ANN ST"),

                Building("Health Management Research Center", Category.Medical, Area.Other, 539),

                Building("Health Service (UHS)", Category.Medical, Area.Central, 68,
                        "207 FLETCHER ST"),

                Building("Kellogg Eye Center (KEC)", Category.Medical, Area.Other, 510),

                Building("Kresge Hearing Research (KHRI)", Category.Medical, Area.Other,
                        "https://medicine.umich.edu/dept/kresge-hearing-research-institute",
                        "4605 Medical Science"),

                Building("Kresge Medical Research I", Category.Medical, Area.Other,
                        "https://medicine.umich.edu/medschool/about/facts-figures/facilities",
                        "200 Zina Pitcher Pl"),

                Building("Kresge Medical Research II", Category.Medical, Area.Other,
                        "https://medicine.umich.edu/medschool/about/facts-figures/facilities",
                        "1299 Ann St"),

                Building("Kresge Medical Research III", Category.Medical, Area.Other,
                        "https://medicine.umich.edu/medschool/about/facts-figures/facilities",
                        "200 Zina Pitcher Pl"),

                Building("Life Sciences Institute (LSI)", Category.Medical, Area.Central, 187),

                Building("Maternal Child Health Care", Category.Medical, Area.Other,
                        "https://www.uofmhealth.org/our-locations/uh-south",
                        "200 HOSPITAL DR"),

                Building("Medical Inn", Category.Medical, Area.Other, 105),

                Building("Medical Sciences Research Building I (MSC1)", Category.Medical, Area.Other, 100,
                        "1150 W Medical Center Dr"),

                Building("Medical Sciences Research Building II (MSC2)", Category.Medical, Area.Other, 103),

                Building("Medical Sciences Research Building III (MSRB3)", Category.Medical, Area.Other, 101,
                        "1150 MEDICAL CENTER DR"),

                Building("Molecular & Behavioral Neuroscience Institute", Category.Medical, Area.Other, 106),

                Building("Mott Children's Hospital", Category.Medical, Area.Other, 29),

                Building("Rachel Upjohn Building", Category.Medical, Area.Other, 529),

                Building("Taubman Biomedical Science Research Building (BSRB)", Category.Medical, Area.Other,509,
                        "Biomedical Science Research Building"),

                Building("University Hospitals", Category.Medical, Area.Other, 158,
                        "1500 MEDICAL CENTER DR"),

                Building("Women's Hospitals", Category.Medical, Area.Other, 29,
                        "1505 SIMPSON RD")
        )
)
