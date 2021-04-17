package com.thic.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class myViewModel(startingTotal:Int): ViewModel() {

    var total = MutableLiveData<Int>()

    init {
        total.value = startingTotal
    }

    fun getLiveData():MutableLiveData<Int>{
      return total
    }

    fun setData(inp:Int){
        total.value = total.value?.plus(inp)
    }
}