package com.example.gridtopics.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val imageNameId: Int,
    val courses: Int,
    @DrawableRes val imageId: Int,
)
