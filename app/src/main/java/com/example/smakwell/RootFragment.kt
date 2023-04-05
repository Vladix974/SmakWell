package com.example.smakwell

import android.os.Bundle
import android.view.View
import android.widget.Adapter
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.example.smakwell.databinding.FragmentRootBinding

class RootFragment : Fragment(R.layout.fragment_root) {
    private lateinit var binding: FragmentRootBinding
    private lateinit var adapterBake: Baking_Adapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRootBinding.bind(view)

        Glide.with(this)
            .load(R.drawable.logo)
            .centerCrop()
            .into(binding.imglogo)

        adapterBake = Baking_Adapter {
            findNavController().navigate(
                R.id.action_rootFragment_to_descriptionFragment,
                bundleOf(DescriptionFragment.BAKE to it)
            )
        }
        adapterBake.addBakes(createBaking())
        binding.apply {
            rcBaking.adapter = adapterBake
        }

    }

    fun createBaking(): List<Baking> {
        return listOf(
            Baking(
                getString(R.string.benderyky),
                getString(R.string.imgBenderuku),
                getString(R.string.bend_descr),
                getString(R.string.imgBenderuku2),
               listOf(
                   Cooking(getString(R.string.benderukuName1),getString(R.string.benderukuCompound1),getString(R.string.benderukuCooking1),getString(R.string.benderukuimgtype1))
               )
            )
//            Baking(
//                getString(R.string.mlunci),
//                getString(R.string.imgMlunci),
//                getString(R.string.mlunci_descr),
//                getString(R.string.imgMlunci2),
//                listOf(
//                    Cooking("Вареники 974","Тісто з Vlada","Замішать Vlada"),
//                    Cooking("Вареники 35","Тісто з Romana","Замішать Romana")
//                )
//            )
        )
//           ,
//            Baking(
//                getString(R.string.varenyky),
//                getString(R.string.imgVarenyky),
//                getString(R.string.varenyky_descr),
//                getString(R.string.imgVarenyky2)
//            ),
//            Baking(
//                getString(R.string.khinkali),
//                getString(R.string.imgKhinkali),
//                getString(R.string.khinkali_descr),
//                getString(R.string.imgKhinkali2)
//            ),
//            Baking(
//                getString(R.string.kotletu),
//                getString(R.string.imgKotletu),
//                getString(R.string.kotletu_descr),
//                getString(R.string.imgKotletu2)
//            ),
//            Baking(
//                getString(R.string.schnitzel),
//                getString(R.string.imgSchnitzel),
//                getString(R.string.schnitzel_descr),
//                getString(R.string.imgSchnitzel2)
//            ),
//            Baking(
//                getString(R.string.syrniki),
//                getString(R.string.imgSyrniki),
//                getString(R.string.syrniki_descr),
//                getString(R.string.imgSyrniki2)
//            ),
//            Baking(
//                getString(R.string.chebureki),
//                getString(R.string.imgChebureki),
//                getString(R.string.chebureki_descr),
//                getString(R.string.imgChebureki2)
//            ),
//            Baking(
//                getString(R.string.cabbage),
//                getString(R.string.imgCabbage),
//                getString(R.string.cabbage_descr),
//                getString(R.string.imgCabbage2)
//            ),
//            Baking(
//                getString(R.string.dumplings),
//                getString(R.string.imgDumplings),
//                getString(R.string.dumplings_descr),
//                getString(R.string.imgDumplings2)
//            ),
//            Baking(
//                getString(R.string.lula_cebab),
//                getString(R.string.imgLula_cebab),
//                getString(R.string.lula_cebab_descr),
//                getString(R.string.imgLula_cebab2)
//            )
//        )

    }
}

