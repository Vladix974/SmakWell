package com.example.smakwell

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.smakwell.databinding.FragmentRootBinding

class RootFragment :Fragment(R.layout.fragment_root){
    private lateinit var binding: FragmentRootBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRootBinding.bind(view)
    }

}