package com.example.lelangku_coba_api.data.remote

import com.example.lelangku_coba_api.data.remote.response.PhotoResponse
import com.example.lelangku_coba_api.utils.Constant.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import java.time.temporal.TemporalQueries

interface ApiInterface {
    @GET("?key=41173386-0ea5ac02e26669fae4688c67b")
    suspend fun getProducts(
        @QueryMap queries: Map<String, String>
    ): Response<PhotoResponse>
}