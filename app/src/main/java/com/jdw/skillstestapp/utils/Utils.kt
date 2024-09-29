package com.jdw.skillstestapp.utils

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.content.ContextCompat
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.text.SimpleDateFormat
import java.util.Date

//class IngredientListConverter {
//    @TypeConverter
//    fun fromIngredientList(ingredients: List<Ingredient>): String {
//        return Gson().toJson(ingredients)
//    }
//
//    @TypeConverter
//    fun toIngredientList(data: String): List<Ingredient> {
//        val listType = object : TypeToken<List<Ingredient>>() {}.type
//        return Gson().fromJson(data, listType)
//    }
//}

class StringListConverter {
    @TypeConverter
    fun fromStringList(steps: List<String>): String {
        return Gson().toJson(steps)
    }

    @TypeConverter
    fun toStringList(data: String): List<String> {
        val listType = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson(data, listType)
    }
}

fun getTimeStamp(): Long {
    return System.currentTimeMillis()
}

@SuppressLint("SimpleDateFormat")
fun convertTimeStampToDate(timeStamp: Long): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    return sdf.format(Date(timeStamp))
}
