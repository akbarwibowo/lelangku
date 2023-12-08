package com.example.lelangku_coba_api

import com.example.lelangku_coba_api.data.remote.RemoteRepository

class Repository(private val remoteRepository: RemoteRepository) {
    suspend fun getProducts() = remoteRepository.getProducts()
}