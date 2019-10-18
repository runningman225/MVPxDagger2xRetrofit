package com.example.modelviewpresenterexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Pdf (

    @SerializedName("isAvailable")
    @Expose
    var isAvailable: Boolean? = null
)
