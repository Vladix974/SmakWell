package com.example.smakwell

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.smakwell.databinding.FragmetDescriptionBinding

class DescriptionFragment : Fragment(R.layout.fragmet_description) {
    lateinit var binding: FragmetDescriptionBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      binding = FragmetDescriptionBinding.bind(view)

            binding.apply {
           tvNameBaking.text = requireArguments().getString(NAME_BAKE)
           tvDescription.text = requireArguments().getString(DESCR_BAKE)
        }
    }
    companion object{
        const val NAME_BAKE = "name"
        const val DESCR_BAKE = "descr"
    }
    }
