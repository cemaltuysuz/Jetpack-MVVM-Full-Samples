package com.thic.livedata

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class myViewModelFactory(private val startingTotal:Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(myViewModel::class.java)){
            return myViewModel(startingTotal) as T
        }
        throw IllegalArgumentException("unknow view model class")
    }
}