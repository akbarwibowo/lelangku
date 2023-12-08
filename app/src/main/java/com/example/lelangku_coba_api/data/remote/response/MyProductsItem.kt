package com.example.lelangku_coba_api.data.remote.response

import com.google.gson.annotations.SerializedName

//data class MyProductsItem(
//    val albumId: Int,
//    val id: Int,
//    val thumbnailUrl: String,
//    val title: String,
//    val url: String
//)
data class MyProductsItem(
    @SerializedName("albumId")
    val albumId: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("thumbnailUrl")
    val thumbnailUrl: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String,
    val results: List<MyProductsItem>
)