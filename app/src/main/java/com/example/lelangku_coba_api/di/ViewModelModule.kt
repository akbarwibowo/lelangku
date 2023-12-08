package com.example.lelangku_coba_api.di

import com.example.lelangku_coba_api.ui.home.HomeViewModel
import org.koin.dsl.module

val viewModelModule= module {
    single { HomeViewModel(get()) }
}