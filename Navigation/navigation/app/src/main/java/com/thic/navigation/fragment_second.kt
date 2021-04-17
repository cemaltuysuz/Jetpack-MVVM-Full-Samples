package com.thic.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.thic.navigation.databinding.FragmentSecondBinding

class fragment_second : Fragment() {

    private lateinit var binding:FragmentSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false)
        var bundle:String? = requireArguments().getString("input")
        binding.textView.text = bundle
        return binding.root
    }
}