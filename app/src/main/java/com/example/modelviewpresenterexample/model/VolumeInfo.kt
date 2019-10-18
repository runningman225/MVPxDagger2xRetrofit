package com.example.modelviewpresenterexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class VolumeInfo (

    @SerializedName("title")
    @Expose
    var title: String? = null,
    @SerializedName("publisher")
    @Expose
    var publisher: String? = null,
    @SerializedName("industryIdentifiers")
    @Expose
    var industryIdentifiers: List<IndustryIdentifier>? = null,
    @SerializedName("readingModes")
    @Expose
    var readingModes: ReadingModes? = null,
    @SerializedName("printType")
    @Expose
    var printType: String? = null,
    @SerializedName("averageRating")
    @Expose
    var averageRating: Double? = null,
    @SerializedName("ratingsCount")
    @Expose
    var ratingsCount: Int? = null,
    @SerializedName("maturityRating")
    @Expose
    var maturityRating: String? = null,
    @SerializedName("allowAnonLogging")
    @Expose
    var allowAnonLogging: Boolean? = null,
    @SerializedName("contentVersion")
    @Expose
    var contentVersion: String? = null,
    @SerializedName("imageLinks")
    @Expose
    var imageLinks: ImageLinks? = null,
    @SerializedName("language")
    @Expose
    var language: String? = null,
    @SerializedName("previewLink")
    @Expose
    var previewLink: String? = null,
    @SerializedName("infoLink")
    @Expose
    var infoLink: String? = null,
    @SerializedName("canonicalVolumeLink")
    @Expose
    var canonicalVolumeLink: String? = null,
    @SerializedName("authors")
    @Expose
    var authors: List<String>? = null,
    @SerializedName("publishedDate")
    @Expose
    var publishedDate: String? = null,
    @SerializedName("pageCount")
    @Expose
    var pageCount: Int? = null,
    @SerializedName("categories")
    @Expose
    var categories: List<String>? = null

)
