package com.example.modelviewpresenterexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ImageLinks (

    @SerializedName("smallThumbnail")
    @Expose
    var smallThumbnail: String? = null,
    @SerializedName("thumbnail")
    @Expose
    var thumbnail: String? = null
)
