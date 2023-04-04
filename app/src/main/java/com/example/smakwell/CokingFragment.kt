package com.example.smakwell

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.smakwell.databinding.FragmentCookingBinding
import com.example.smakwell.databinding.FragmetDescriptionBinding

class CokingFragment: Fragment(R.layout.fragment_cooking) {
    private lateinit var binding: FragmentCookingBinding
    private lateinit var adapterCooking: Cooking_Adapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCookingBinding.bind(view)

        binding.rcCooking.adapter = adapterCooking

    }
    fun createCooking():List<Cooking>{
        return listOf(
            Cooking(getString(R.string.varenyky),getString(R.string.varenyky),getString(R.string.varenyky),getString(R.string.varenyky))
        )
    }
}