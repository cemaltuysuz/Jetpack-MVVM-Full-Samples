package com.thic.viewmodel3

import androidx.lifecycle.ViewModel

class myViewModel(startingTotal:Int) : ViewModel() {

    private var total = 0

    init {
        total = startingTotal
    }

    fun getCurrentTotal():Int{
        return total
    }
    fun setTotal(inp:Int){
        total = total+inp
    }

}