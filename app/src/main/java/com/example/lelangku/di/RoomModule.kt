package com.example.lelangku.di

import androidx.room.Room
import com.example.lelangku.data.local.AppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val roomModule = module {
    single {
        Room.databaseBuilder(androidContext(), AppDatabase::class.java, "db")
            .build()
    }
}