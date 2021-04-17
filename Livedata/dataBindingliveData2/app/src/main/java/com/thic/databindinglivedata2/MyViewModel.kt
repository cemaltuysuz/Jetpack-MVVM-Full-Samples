package com.thic.databindinglivedata2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    var data = MutableLiveData<String>()
}