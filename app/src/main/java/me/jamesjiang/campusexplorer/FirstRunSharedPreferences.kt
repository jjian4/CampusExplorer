package me.jamesjiang.campusexplorer

import android.content.Context

//Used to check if the user if running the app for the first time
class FirstRunSharedPreferences(context: Context) {

    val PREFERENCE_NAME = "First Run Shared Preferences"
    val PREFERENCE_IS_FIRST_RUN_BOOL = "isFirstRun"

    val firstRunSharedRef = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE )

    fun getFirstRunCheck(): Boolean {
        return firstRunSharedRef.getBoolean(PREFERENCE_IS_FIRST_RUN_BOOL, true)
    }

    fun setFirstRunCheck(newFirstRunCheck: Boolean) {
        val editor = firstRunSharedRef.edit()
        editor.putBoolean(PREFERENCE_IS_FIRST_RUN_BOOL, newFirstRunCheck)
        editor.apply()
    }
}