package com.example.lelangku

import com.example.lelangku.data.local.AppDatabase
import com.example.lelangku.data.local.LocalRepository
import com.example.lelangku.data.local.UserEntity
import com.example.lelangku.data.remote.RemoteRepository

class Repository(private val remoteRepository: RemoteRepository, private val localRepository: LocalRepository) {
    suspend fun getProducts() = remoteRepository.getProducts()
    suspend fun insertUser(userEntity: UserEntity){
        localRepository.insertUser(userEntity)
    }

    suspend fun getUser(email: String, pasword: String): UserEntity{
        return localRepository.getUser(email, pasword)
    }

}