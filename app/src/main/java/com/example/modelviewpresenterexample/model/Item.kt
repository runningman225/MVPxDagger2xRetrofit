package com.example.modelviewpresenterexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Item (
    @SerializedName("kind")
    @Expose
    var kind: String? = null,
    @SerializedName("id")
    @Expose
    var id: String? = null,
    @SerializedName("etag")
    @Expose
    var etag: String? = null,
    @SerializedName("selfLink")
    @Expose
    var selfLink: String? = null,
    @SerializedName("volumeInfo")
    @Expose
    var volumeInfo: VolumeInfo? = null,
    @SerializedName("saleInfo")
    @Expose
    var saleInfo: SaleInfo? = null,
    @SerializedName("accessInfo")
    @Expose
    var accessInfo: AccessInfo? = null,
    @SerializedName("searchInfo")
    @Expose
    var searchInfo: SearchInfo? = null
)