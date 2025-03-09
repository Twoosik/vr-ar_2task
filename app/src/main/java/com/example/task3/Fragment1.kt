package com.example.task3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.task3.databinding.Fragment1LayoutBinding

class Fragment1 : Fragment() {
    private lateinit var binding: Fragment1LayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment1LayoutBinding.inflate(inflater, container, false)

        binding.button1.setOnClickListener {
            findNavController().navigate(R.id.action_fragment1_to_fragment2)
        }
        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_fragment1_to_fragment3)
        }

        return binding.root
    }
}