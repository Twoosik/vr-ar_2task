package com.example.task2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.task2.databinding.Fragment3LayoutBinding

class Fragment3: Fragment() {
    private lateinit var binding: Fragment3LayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment3LayoutBinding.inflate(inflater, container, false)

        binding.button1.setOnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragment1)
        }
        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragment2)
        }
        return binding.root
    }
}