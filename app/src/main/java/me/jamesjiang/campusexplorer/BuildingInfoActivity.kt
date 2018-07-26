package me.jamesjiang.campusexplorer

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_building_info.*

class BuildingInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_building_info)

        val building = intent.getSerializableExtra("Building") as Building


        textView_info_name.text = building.name
        textView_info_area.text = building.area.toString()
        webview.loadUrl(building.site)

        //Brings user to website on google chrome
        button_info_website.setOnClickListener {
            val uri = Uri.parse(building.site)
            val websiteIntent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(websiteIntent)
        }

        //Brings user to google maps with direction query
        button_info_directions.setOnClickListener {

            //Using url guide from https://developers.google.com/maps/documentation/urls/guide
            val uriString = getText(R.string.info_map_uri_beginning).toString() +
                    convertToQuery(building.name) + getText(R.string.info_map_uri_end).toString()
            val uri = Uri.parse(uriString)

            val directionsIntent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(directionsIntent)
        }

    }

    //Used to replace spaces with "+"s and commas with "%2C"s for generating directions url
    fun convertToQuery(name: String): String {
        var newName = name.replace(" ", "+")
        newName = newName.replace(",", "%2C")

        return newName
    }
}
