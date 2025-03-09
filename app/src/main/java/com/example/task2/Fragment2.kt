package com.example.task2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.task2.databinding.Fragment2LayoutBinding

class Fragment2: Fragment() {
    private lateinit var binding: Fragment2LayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment2LayoutBinding.inflate(inflater, container, false)

        binding.button1.setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment1)
        }
        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment3)
        }
        return binding.root
    }
}