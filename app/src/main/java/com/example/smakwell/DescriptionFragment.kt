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

        val bake = requireArguments().getParcelable<Baking>(BAKE)
        binding.apply {
            tvNameBaking.text = bake?.name
            tvDescription.text = bake?.desr
        }
    }

    companion object {
        const val BAKE = "bake"
    }
}
