package com.example.lelangku_coba_api.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lelangku_coba_api.Repository
import com.example.lelangku_coba_api.data.remote.response.MyProductsItem
import com.example.lelangku_coba_api.data.remote.response.MyProductsItemItem
import kotlinx.coroutines.launch
import retrofit2.Response

class HomeViewModel(private val repository: Repository): ViewModel() {
    private val getProducts = MutableLiveData<Response<MyProductsItem>>()
    val observeProducts: LiveData<Response<MyProductsItem>> = getProducts

    fun getProducts(){
        viewModelScope.launch {
            try {
                val result = repository.getProducts()
                Log.d("viewModel", "getProducts: $result")
                getProducts.postValue(result)
            } catch (e: Exception){
                e.printStackTrace()
            }
        }
    }
}