package com.thic.livedataviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MViewmodel : ViewModel() {
    private var livedata = MutableLiveData<Int>()

    init {
        livedata.value = 0
    }

    fun getCurrentLiveData():MutableLiveData<Int>{
        return livedata
    }
    fun updateCount (){
        livedata.value = (livedata.value)?.plus(1)
    }

}