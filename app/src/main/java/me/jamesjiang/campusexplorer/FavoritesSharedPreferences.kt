package me.jamesjiang.campusexplorer

import android.content.Context

//Used to store the set of building names user has saved
class FavoritesSharedPreferences(context: Context) {

    val PREFERENCE_NAME = "Favorites Shared Preferences"
    val PREFERENCE_FAVORITES_SET = "favoriteBuildingsNames"

    val favoritesSharedRef = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE )

    fun getFavoritesSet(): MutableSet<String> {
        return favoritesSharedRef.getStringSet(PREFERENCE_FAVORITES_SET, mutableSetOf<String>())
    }

    fun setFavoritesSet(newFavoritesSet:MutableSet<String>) {
        val editor = favoritesSharedRef.edit()
        editor.putStringSet(PREFERENCE_FAVORITES_SET, newFavoritesSet)
        editor.apply()
    }

}