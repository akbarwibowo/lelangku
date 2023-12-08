package com.example.lelangku_coba_api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.lelangku_coba_api.data.remote.ApiInterface
import com.example.lelangku_coba_api.data.remote.response.MyProductsItem
import com.example.lelangku_coba_api.ui.home.HomeAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)

    }
}