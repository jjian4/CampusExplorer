package me.jamesjiang.campusexplorer

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_building_info.*

//Displays info about the building including category, area, and webview of building's website
class BuildingInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_building_info)

        //Retrieve the passed-in building
        val building = intent.getSerializableExtra("Building") as Building

        //Set texts
        textView_info_name.text = building.name
        //If building name is large, decrease the font
        if (building.name.count() > 20) {
            textView_info_name.textSize = 24.toFloat()
        }
        else if (building.name.count() > 15) {
            textView_info_name.textSize = 27.toFloat()
        }
        textView_info_area.text = building.area.toString()
        //Replace any underscores with spaces
        textView_info_category.text = building.category.toString().replace("_", " ")


        //Get favorites list (for checking if this building is a favorite)
        val favoritesSharedPreferences = FavoritesSharedPreferences(this)
        var favoriteBuildingNames = favoritesSharedPreferences.getFavoritesSet()
        //Set favorites star
        if (favoriteBuildingNames.any{it == building.name}) {
            imageButton_star.setImageResource(R.drawable.ic_filled_star)
        } else {
            imageButton_star.setImageResource(R.drawable.ic_empty_star)
        }

        //Changes icon and shared pref when clicked
        imageButton_star.setOnClickListener {
            //If building was in favorites, remove it from favorites
            if (favoriteBuildingNames.any{it == building.name}) {
                imageButton_star.setImageResource(R.drawable.ic_empty_star)
                favoriteBuildingNames.remove(building.name)
                favoritesSharedPreferences.setFavoritesSet(favoriteBuildingNames)
                Toast.makeText(this, "Removed from favorites :(", Toast.LENGTH_SHORT).show()
            }
            //If building was not in favorites, add it to favorites
            else {
                imageButton_star.setImageResource(R.drawable.ic_filled_star)
                favoriteBuildingNames.add(building.name)
                favoritesSharedPreferences.setFavoritesSet(favoriteBuildingNames)
                Toast.makeText(this, "Added to favorites!!", Toast.LENGTH_SHORT).show()
            }
        }

        //Used to make sure all url opens in webview and not chrome even when it redirects
        class MyWebviewClient: WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                view?.loadUrl(request?.url.toString())
                return true
            }
        }

        //Sets webview, enable javascript to remove overlapped html
        webview.webViewClient = MyWebviewClient()
        val webSettings = webview!!.settings
        webSettings.javaScriptEnabled = true
        webview.loadUrl(building.site)

        //Back and forward buttons on webview
        button_webview_back.setOnClickListener {
            if(webview.canGoBack()) {
                webview.goBack()
            }
        }
        button_webview_forward.setOnClickListener {
            if(webview.canGoForward()) {
                webview.goForward()
            }
        }


        //Brings user to website on google chrome
        button_info_website.setOnClickListener {
            val uri = Uri.parse(building.site)
            val websiteIntent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(websiteIntent)
        }

        //Brings user to google maps with direction query
        button_info_directions.setOnClickListener {

            var uriString = ""

            //Using url guide from https://developers.google.com/maps/documentation/urls/guide
            //if no address is given, use name of building as search query
            if(building.address == "") {
                uriString = getText(R.string.info_map_uri_beginning).toString() +
                        convertToQuery(building.name) + getText(R.string.info_map_uri_end).toString()
            }
            else {
                uriString = getText(R.string.info_map_uri_beginning).toString() +
                        convertToQuery(building.address) + getText(R.string.info_map_uri_end).toString()
            }

            Log.d("James", uriString)

            val uri = Uri.parse(uriString)

            val directionsIntent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(directionsIntent)
        }

        //Back to list, Use CategoriesActivity to regenerate list with any updates
        button_backto_list.setOnClickListener {
            val buttonID = intent.getIntExtra("Button ID", 3)
            val backToListIntent = Intent(this, CategoriesActivity::class.java)
            backToListIntent.putExtra("Button ID", buttonID)
            startActivity(backToListIntent)
        }

    }

    //Used to replace spaces with "+"s and commas with "%2C"s for generating directions url
    fun convertToQuery(name: String): String {
        var newName = name.replace(" ", "+")
        newName = newName.replace(",", "%2C")

        //Remove anything in parenthesis
        if(newName.contains("(") && newName.contains(")")) {
            newName = newName.removeRange(newName.indexOf("(") - 1, newName.indexOf(")") + 1)
        }

        Log.d("James", newName)

        return newName
    }

}
