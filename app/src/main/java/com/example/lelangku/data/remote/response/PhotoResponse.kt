package com.example.lelangku.data.remote.response


import com.google.gson.annotations.SerializedName

data class PhotoResponse(
    @SerializedName("hits")
    val hits: List<Hit>,
    @SerializedName("total")
    val total: Int,
    @SerializedName("totalHits")
    val totalHits: Int
)

