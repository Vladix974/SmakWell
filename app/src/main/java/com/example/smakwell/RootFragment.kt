package com.example.smakwell

import android.os.Bundle
import android.view.View
import android.widget.Adapter
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.smakwell.databinding.FragmentRootBinding

class RootFragment :Fragment(R.layout.fragment_root){
    private lateinit var binding: FragmentRootBinding
    private lateinit var adapterBake : Baking_Adapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRootBinding.bind(view)
        adapterBake = Baking_Adapter {name, descr->
            findNavController().navigate(R.id.action_rootFragment_to_descriptionFragment,
                bundleOf(DescriptionFragment.NAME_BAKE to name,DescriptionFragment.DESCR_BAKE to descr)
            )
        }
        adapterBake.addBakes(createBaking())
        binding.apply {
            rcBaking.adapter=adapterBake
        }
        binding.apply {

        }
    }

    private fun openDescr(name: String ){

    }

    fun createBaking(): List<Baking>{
        return listOf(
            Baking(getString(R.string.benderyky),R.drawable.benderuku,getString(R.string.bend_descr),R.drawable.benderyky_decription),
            Baking(getString(R.string.mlunci),R.drawable.mlunci,getString(R.string.mlunci_descr),R.drawable.benderyky_decription),
            Baking(getString(R.string.varenyky),R.drawable.varenyky,getString(R.string.bend_descr),R.drawable.benderyky_decription),
            Baking(getString(R.string.khinkali),R.drawable.khinkali,getString(R.string.bend_descr),R.drawable.benderyky_decription),
            Baking(getString(R.string.kotletu),R.drawable.kotletu,getString(R.string.bend_descr),R.drawable.benderyky_decription),
            Baking(getString(R.string.schnitzel),R.drawable.schnitzel,getString(R.string.bend_descr),R.drawable.benderyky_decription),
            Baking(getString(R.string.syrniki),R.drawable.syrniki,getString(R.string.bend_descr),R.drawable.benderyky_decription),
            Baking(getString(R.string.chebureki),R.drawable.chebureki,getString(R.string.bend_descr),R.drawable.benderyky_decription),
            Baking(getString(R.string.cabbage),R.drawable.cabbage,getString(R.string.bend_descr),R.drawable.benderyky_decription),
            Baking(getString(R.string.dumplings),R.drawable.dumplings,getString(R.string.bend_descr),R.drawable.benderyky_decription),
            Baking(getString(R.string.lula_cebab),R.drawable.lula_cebab,getString(R.string.bend_descr),R.drawable.benderyky_decription)
        )

}
}