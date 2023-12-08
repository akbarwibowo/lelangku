package com.example.lelangku_coba_api.data.remote.response


import com.google.gson.annotations.SerializedName

data class MyProductsItemItem(
    @SerializedName("albumId")
    val albumId: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("thumbnailUrl")
    val thumbnailUrl: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String
)