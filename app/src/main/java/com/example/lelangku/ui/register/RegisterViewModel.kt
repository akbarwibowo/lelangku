package com.example.lelangku.ui.register

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lelangku.Repository
import com.example.lelangku.data.local.AppDatabase
import com.example.lelangku.data.local.UserEntity
import kotlinx.coroutines.launch

class RegisterViewModel(private val repository: Repository): ViewModel() {
    private val isRegister = MutableLiveData<Boolean>()
    fun observeIsRegister(): LiveData<Boolean> = isRegister
    suspend fun insertUser(userEntity: UserEntity){
        viewModelScope.launch {
            try {
                repository.insertUser(userEntity)
                isRegister.postValue(true)
            } catch (e: Throwable){
                e.printStackTrace()
            }
        }
    }
}