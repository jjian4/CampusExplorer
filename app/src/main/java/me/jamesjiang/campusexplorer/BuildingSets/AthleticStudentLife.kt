package me.jamesjiang.campusexplorer.BuildingSets

import me.jamesjiang.campusexplorer.Area
import me.jamesjiang.campusexplorer.Building
import me.jamesjiang.campusexplorer.BuildingSet
import me.jamesjiang.campusexplorer.Category

val athleticBuildings = BuildingSet(
        setOf(
                Building("Bahna Wrestling Center", Category.Athletic, Area.Other, 575),

                Building("Cliff Keen Arena", Category.Athletic, Area.Central, 37),

                Building("Crisler Center", Category.Athletic, Area.Other, 35),

                Building("Elbel Field Locker Building", Category.Athletic, Area.Central, 525),

                Building("Golf Clubhouse", Category.Athletic, Area.Other, 64),

                Building("Indoor Training Center", Category.Athletic, Area.Other, 155),

                Building("Junge Champions Center", Category.Athletic, Area.Other, 559),

                Building("Michigan Stadium", Category.Athletic, Area.Other, 503),

                Building("Natatorium", Category.Athletic, Area.Central, 50),

                Building("Ray Fisher Baseball Stadium", Category.Athletic, Area.Other, 134),

                Building("Revelli Hall", Category.Athletic, Area.Central, 167),

                Building("Schembechler Hall", Category.Athletic, Area.Other, 63),

                Building("Varsity Tennis Building", Category.Athletic, Area.Other, 159),

                Building("Weidenbach Hall", Category.Athletic, Area.Central, 79),

                Building("Yost Ice Arena", Category.Athletic, Area.Other, 170)
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