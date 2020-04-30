package com.malik.covid.extensions

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.malik.covid.listeners.SingleClickListener
import com.malik.covid.prefences.PrefManager
import com.google.gson.Gson

/**
 * Click Extension function works as listener setter that prevents double click on the view it´s set
 * @return view
 * @author Dawar Malik.
 */
fun View.singleClick(l: (View?) -> Unit) {
    setOnClickListener(SingleClickListener(l))
}

/**
 * Extension function to show toast message
 * @return void
 * @author Dawar Malik.
 */
fun Context.showToastMsg(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}


/**
 * A method to save Object in Preferences.
 * @param dataObject as Object.
 * @param key to Map in Pref.
 * @return void.
 * @author Dawar Malik.
 */
fun Context.saveDataObjectInPref(dataObject: Any?, key: String) {
    val json = Gson().toJson(dataObject)
    PrefManager(this).putStringPref(key, json)
}

/**
 * A method to close keyboard.
 * @return void
 * @author Dawar Malik.
 */
fun View.closeKeyboard() {
    val imm =
        this.context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(this.windowToken, 0)
}
