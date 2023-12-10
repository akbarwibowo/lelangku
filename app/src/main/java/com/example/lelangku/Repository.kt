package com.example.lelangku

import com.example.lelangku.data.remote.RemoteRepository

class Repository(private val remoteRepository: RemoteRepository) {
    suspend fun getProducts() = remoteRepository.getProducts()
}