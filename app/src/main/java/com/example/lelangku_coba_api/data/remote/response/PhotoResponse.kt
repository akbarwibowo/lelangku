package com.example.lelangku_coba_api.data.remote.response


import com.google.gson.annotations.SerializedName

data class PhotoResponse(
    @SerializedName("hits")
    val hits: List<Hit>,
    @SerializedName("total")
    val total: Int,
    @SerializedName("totalHits")
    val totalHits: Int
)

