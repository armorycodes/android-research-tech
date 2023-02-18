package com.frogobox.research.common.delegate


/**
 * Created by Faisal Amir on 18/02/23
 * https://github.com/amirisback
 */


interface PreferenceDelegates {

    fun savePrefFloat(key: String, value: Float)

    fun savePrefInt(key: String, value: Int)

    fun savePrefString(key: String, value: String)

    fun savePrefBoolean(key: String, value: Boolean)

    fun savePrefLong(key: String, value: Long)

    fun deletePref(key: String)

    fun nukePref()

    fun loadPrefFloat(key: String): Float

    fun loadPrefFloat(key: String, defaultValue: Float): Float

    fun loadPrefString(key: String): String

    fun loadPrefString(key: String, defaultValue: String): String

    fun loadPrefInt(key: String): Int

    fun loadPrefInt(key: String, defaultValue: Int): Int

    fun loadPrefLong(key: String): Long

    fun loadPrefLong(key: String, defaultValue: Long): Long

    fun loadPrefBoolean(key: String): Boolean

    fun loadPrefBoolean(key: String, defaultValue: Boolean): Boolean

}