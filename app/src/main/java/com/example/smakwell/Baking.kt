package com.example.smakwell

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Baking(
    val name: String,
    val img: String,
    val desr: String,
    val img2: String
):Parcelable
