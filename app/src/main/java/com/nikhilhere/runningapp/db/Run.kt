package com.nikhilhere.runningapp.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter


@Entity(tableName = "running_table")
data class Run(
    var image: Bitmap? = null,
    var timestamp: Long = 0L,
    var avgSpeedInKMH : Float = 0f,
    var distanceInMeters : Int = 0,
    var timeInMillis : Long = 0L,
    var caloreisBurned: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id : Int? = null
}