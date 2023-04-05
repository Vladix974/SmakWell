package com.example.smakwell

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.smakwell.databinding.FragmentCookingBinding
import com.example.smakwell.databinding.FragmetDescriptionBinding

class CokingFragment: Fragment(R.layout.fragment_cooking) {
    private lateinit var binding: FragmentCookingBinding
    private  val adapter=  Cooking_Adapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCookingBinding.bind(view)

        Glide.with(this)
            .load(R.drawable.logo)
            .into(binding.imglogo)

        val cook = requireArguments().getParcelable<Baking>(NAME)
        binding.tvNameBaking.text=cook?.name

        adapter.addTypeBake(cook?.cookingList)
        binding.apply {
            rcCooking.adapter = adapter
            imgBtnBack.setOnClickListener{
                findNavController().popBackStack()
            }
            btnToMenu.setOnClickListener {   findNavController().popBackStack(R.id.rootFragment,false)}
        }

    }



    companion object{
        const val NAME = "name"
    }
}