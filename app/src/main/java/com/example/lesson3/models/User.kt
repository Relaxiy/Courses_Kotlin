package com.example.lesson3.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User(val login: String,
           val email: String,
           val password: String
           ): Parcelable