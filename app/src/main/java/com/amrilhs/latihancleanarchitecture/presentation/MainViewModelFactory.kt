package com.amrilhs.latihancleanarchitecture.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.amrilhs.latihancleanarchitecture.di.Injection
import com.amrilhs.latihancleanarchitecture.domain.MessageUseCase

class MainViewModelFactory(
    private var messageUseCase: MessageUseCase
): ViewModelProvider.NewInstanceFactory() {
    companion object{
        @Volatile
        private var instance: MainViewModelFactory?=null

        fun getInstance():MainViewModelFactory= instance?: synchronized(this){
            instance ?: MainViewModelFactory(Injection.provideUseCase())
        }
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when{
            modelClass.isAssignableFrom(MainViewModel::class.java)-> MainViewModel(messageUseCase) as T
            else -> throw IllegalArgumentException("Unknown ViewModel Class: "+ modelClass.name)
        }
    }
}