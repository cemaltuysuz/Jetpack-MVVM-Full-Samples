package com.thic.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.thic.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this ,R.layout.activity_main)


        binding.button.setOnClickListener(View.OnClickListener {

            setText()
        })

        binding.button2.setOnClickListener(View.OnClickListener {
            progressVisibility()
        })
    }

    private fun setText(){

        binding.textView.text = "Hello Databinding !"
    }
    // binding.VIEW_ID    or    binding.apply { your code / View_ID } (In this use, not need 'binding')
    private fun progressVisibility(){
        binding.apply {
            if (progressBar.visibility==View.VISIBLE){
                progressBar.visibility = View.GONE
            }else progressBar.visibility = View.VISIBLE
        }
    }
}