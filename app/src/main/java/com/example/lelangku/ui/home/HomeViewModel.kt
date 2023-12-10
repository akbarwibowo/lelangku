package com.example.lelangku.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lelangku.Repository
import com.example.lelangku.data.remote.response.PhotoResponse
import kotlinx.coroutines.launch
import retrofit2.Response

class HomeViewModel(private val repository: Repository): ViewModel() {
    private val getProducts = MutableLiveData<Response<PhotoResponse>>()
    val observeProducts: LiveData<Response<PhotoResponse>> = getProducts

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