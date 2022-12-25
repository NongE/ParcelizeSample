package com.android.parcelizesample

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BookData(
    val bookName: String,
    val price: String,
    val publisher: String
): Parcelable
