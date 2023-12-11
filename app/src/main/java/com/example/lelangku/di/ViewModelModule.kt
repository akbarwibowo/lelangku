package com.example.lelangku.di

import com.example.lelangku.ui.home.HomeViewModel
import com.example.lelangku.ui.login.LoginViewModel
import com.example.lelangku.ui.register.RegisterViewModel
import org.koin.dsl.module

val viewModelModule= module {
    single { HomeViewModel(get()) }
    single { LoginViewModel(get()) }
    single { RegisterViewModel(get()) }
}