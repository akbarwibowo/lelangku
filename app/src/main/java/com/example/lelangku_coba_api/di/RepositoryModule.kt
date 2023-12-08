package com.example.lelangku_coba_api.di

import com.example.lelangku_coba_api.Repository
import com.example.lelangku_coba_api.data.remote.RemoteRepository
import org.koin.dsl.module

val repositoryModule= module {
    single { RemoteRepository(get()) }
    single { Repository(get()) }
}