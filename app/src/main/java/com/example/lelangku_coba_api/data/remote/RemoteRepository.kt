package com.example.lelangku_coba_api.data.remote

class RemoteRepository(private val apiService: ApiInterface) {
    private val queryMap = mapOf(
        "q" to "ecommerce",
        "category" to "computer",
        "per_page" to "200"
    )
    suspend fun getProducts() = apiService.getProducts(queryMap)
}