package com.example.smakwell

import android.os.Binder
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.smakwell.databinding.FragmetDescriptionBinding

class DescriptionFragment : Fragment(R.layout.fragmet_description) {
    lateinit var binding: FragmetDescriptionBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmetDescriptionBinding.bind(view)

        Glide.with(binding.root)
            .load(R.drawable.logo)
            .centerCrop()
            .into(binding.imglogo)

        val bake = requireArguments().getParcelable<Baking>(BAKE)
        binding.apply {
            tvNameBaking.text = bake?.name
            tvDescription.text = bake?.desr

            Glide.with(binding.root)
                .load(bake?.img2)
                .into(imgBake)

        }
    }

    companion object {
        const val BAKE = "bake"
    }
}
