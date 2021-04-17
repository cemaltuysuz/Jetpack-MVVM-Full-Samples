package com.thic.viewmodel2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.thic.viewmodel2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        setValue()
        binding.button.setOnClickListener(View.OnClickListener {
        getValue()
        setValue()
        })

    }
    fun setValue(){
        binding.textView.text = viewModel.getTotal().toString()
    }
    fun getValue(){
        viewModel.setTotal(binding.editTextTextPersonName.text.toString().toInt())
    }
}