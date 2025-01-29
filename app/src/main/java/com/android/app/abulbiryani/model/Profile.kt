package com.android.app.abulbiryani.model

import android.media.Image

data class Profile(
    val name: String,
    val email: String,
    val phoneNumber: String,
    val address: String,
    val profilePicture: Image
)