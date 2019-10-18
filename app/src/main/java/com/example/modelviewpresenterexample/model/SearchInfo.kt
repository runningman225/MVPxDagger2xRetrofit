package com.example.modelviewpresenterexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SearchInfo (

    @SerializedName("textSnippet")
    @Expose
    var textSnippet: String? = null
)
