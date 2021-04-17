package com.thic.viewmodel2

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private var total = 0

    fun getTotal():Int{
        return total
    }
    fun setTotal(inp:Int){
        this.total = total + inp
    }
}