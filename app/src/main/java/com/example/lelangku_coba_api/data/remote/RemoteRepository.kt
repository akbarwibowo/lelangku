package com.example.lelangku_coba_api.data.remote

class RemoteRepository(private val apiService: ApiInterface) {
    suspend fun getProducts() = apiService.getProducts()
}