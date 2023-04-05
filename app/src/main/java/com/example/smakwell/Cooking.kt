package com.example.smakwell
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Cooking(
    val nameType: String,
    val compound: String,
    val cooking: String,
    val cinnict: String,
    val img: String
) :Parcelable
