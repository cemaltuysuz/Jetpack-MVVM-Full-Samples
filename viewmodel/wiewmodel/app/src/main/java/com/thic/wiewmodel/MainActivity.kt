package com.thic.wiewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.thic.wiewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.textView.text = viewModel.getCurrentCount().toString()

        binding.button.setOnClickListener(View.OnClickListener {
            viewModel.getUpdateCount()
            binding.textView.text = viewModel.getCurrentCount().toString()
        })
    }
}