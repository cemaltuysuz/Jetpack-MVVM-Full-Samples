package com.thic.wiewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    var count = 0

    fun getUpdateCount():Int{
        return count++
    }
    fun getCurrentCount():Int{
        return count
    }
}