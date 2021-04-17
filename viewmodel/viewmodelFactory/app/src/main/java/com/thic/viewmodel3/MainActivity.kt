package com.thic.viewmodel3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.thic.viewmodel3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var myViewModel: myViewModel
    private lateinit var myViewModelFactory: myViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        myViewModelFactory = myViewModelFactory(1)
        myViewModel = ViewModelProvider(this,myViewModelFactory).get(com.thic.viewmodel3.myViewModel::class.java)

        binding.textView.text = myViewModel.getCurrentTotal().toString()
        binding.button.setOnClickListener(View.OnClickListener {
            myViewModel.setTotal(binding.editTextTextPersonName.text.toString().toInt())
            binding.textView.text = myViewModel.getCurrentTotal().toString()
        })
    }
}