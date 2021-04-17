package com.thic.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.thic.livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModelFactory: myViewModelFactory
    private lateinit var viewModel: myViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelFactory = myViewModelFactory(20)
        viewModel = ViewModelProvider(this,viewModelFactory).get(myViewModel::class.java)

        viewModel.getLiveData().observe(this, Observer {
            binding.textView.text = it.toString()
        })

        binding.button.setOnClickListener(View.OnClickListener{
            viewModel.setData(binding.editTextTextPersonName.text.toString().toInt())
        })


    }
}