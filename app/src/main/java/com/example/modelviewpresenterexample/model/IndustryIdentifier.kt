package com.example.modelviewpresenterexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class IndustryIdentifier (

    @SerializedName("type")
    @Expose
    var type: String? = null,
    @SerializedName("identifier")
    @Expose
    var identifier: String? = null
)
