package com.thic.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.thic.navigation.databinding.FragmentFirstBinding

class fragment_first : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_first, container, false)

        binding.button.setOnClickListener(View.OnClickListener {

            if(!binding.editTextTextPersonName.text.toString().trim().isEmpty()){
                val bundle:Bundle = bundleOf("input" to binding.editTextTextPersonName.text.toString())
                it.findNavController().navigate(R.id.action_fragment_first_to_fragment_second,bundle)
            }else{
                Toast.makeText(requireActivity(),"please,input in edittext",Toast.LENGTH_SHORT).show()
            }


        })

        return binding.root
    }
}