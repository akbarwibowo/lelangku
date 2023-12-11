package com.example.lelangku.di

import com.example.lelangku.Repository
import com.example.lelangku.data.local.LocalRepository
import com.example.lelangku.data.remote.RemoteRepository
import org.koin.dsl.module

val repositoryModule= module {
    single { RemoteRepository(get()) }
    single { LocalRepository(get()) }
    single { Repository(get(), get()) }
}