package com.example.lelangku.data.remote

import com.example.lelangku.data.remote.response.PhotoResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiInterface {
    @GET("?key=41173386-0ea5ac02e26669fae4688c67b")
    suspend fun getProducts(
        @QueryMap queries: Map<String, String>
    ): Response<PhotoResponse>
}