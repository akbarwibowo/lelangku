package com.example.lelangku_coba_api.di

import com.example.lelangku_coba_api.data.remote.ApiInterface
import com.example.lelangku_coba_api.utils.Constant.BASE_URL
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule= module{
    single {
        OkHttpClient.Builder()
            .connectTimeout(60L, TimeUnit.SECONDS)
            .readTimeout(60L, TimeUnit.SECONDS)
            .writeTimeout(60L, TimeUnit.SECONDS)
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single {
        createApiService<ApiInterface>(get())
    }
}

inline fun <reified T>createApiService(retrofit: Retrofit):T = retrofit.create(T::class.java)