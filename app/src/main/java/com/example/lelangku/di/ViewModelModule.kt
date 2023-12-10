package com.example.lelangku.di

import com.example.lelangku.ui.home.HomeViewModel
import org.koin.dsl.module

val viewModelModule= module {
    single { HomeViewModel(get()) }
}