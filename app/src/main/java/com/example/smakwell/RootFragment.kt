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
            Baking
                (
                getString(R.string.benderyky),
                getString(R.string.imgBenderuku),
                getString(R.string.bend_descr),
                getString(R.string.imgBenderuku2),
               listOf(
                   Cooking(getString(R.string.benderukuName1),
                       getString(R.string.benderukuCompound1),
                       getString(R.string.benderukuCooking1),
                       getString(R.string.benderukuCinnict1),
                       getString(R.string.benderukuimgtype1)),

                   Cooking(getString(R.string.benderukuName2),
                       getString(R.string.benderukuCompound2),
                       getString(R.string.benderukuCooking2),
                       getString(R.string.benderukuCinnict2),
                       getString(R.string.benderukuimgtype2)),

                   Cooking(getString(R.string.benderukuName3),
                       getString(R.string.bendrukuCompound3),
                       getString(R.string.benderukuCooking3),
                       getString(R.string.benderukuCinnict3),
                       getString(R.string.benderukuimgType3))
                        )
               ),
            Baking(
                getString(R.string.mlunci),
                getString(R.string.imgMlunci),
                getString(R.string.mlunci_descr),
                getString(R.string.imgMlunci2),
                listOf(
                    Cooking(getString(R.string.mlunciName1),
                        getString(R.string.mlunciCompound1),
                        getString(R.string.mlunciCooking),
                        getString(R.string.mlunciCinnict1),
                        getString(R.string.mlunciimgType1)),

                    Cooking(getString(R.string.mlunciName2),
                        getString(R.string.mlunciCompound2),
                        getString(R.string.mlunciCooking),
                        getString(R.string.mlunciCinnict2),
                        getString(R.string.mlunciimgType2)),

                    Cooking(getString(R.string.mlunciName3),
                        getString(R.string.mlunciCompound3),
                        getString(R.string.mlunciCooking),
                        getString(R.string.mlunciCinnict3),
                        getString(R.string.mlunciimgType3))
                )
            ),
            Baking(
                getString(R.string.varenyky),
                getString(R.string.imgVarenyky),
                getString(R.string.varenyky_descr),
                getString(R.string.imgVarenyky2),
                listOf(
                    Cooking(getString(R.string.varenykyName1),
                        getString(R.string.varenykyCompound1),
                        getString(R.string.varenykyCooking),
                        getString(R.string.varenykyCinnict),
                        getString(R.string.varenykyimgType1)),

                    Cooking(getString(R.string.varenykyName2),
                        getString(R.string.varenykyCompound2),
                        getString(R.string.varenykyCooking),
                        getString(R.string.varenykyCinnict),
                        getString(R.string.varenykyimgType2)),

                    Cooking(getString(R.string.varenykyName3),
                        getString(R.string.varenykyCompound3),
                        getString(R.string.varenykyCooking),
                        getString(R.string.varenykyCinnict),
                        getString(R.string.varenykyimgType3)),
                )
            ),
            Baking(
                getString(R.string.khinkali),
                getString(R.string.imgKhinkali),
                getString(R.string.khinkali_descr),
                getString(R.string.imgKhinkali2),
                listOf(
                    Cooking(getString(R.string.khinkaliName1),
                        getString(R.string.khinkaliCompound1),
                        getString(R.string.khinkaliCooking),
                        getString(R.string.khinkaliCinnict),
                        getString(R.string.khinkaliimgType1)),

                    Cooking(getString(R.string.khinkaliName2),
                        getString(R.string.khinkaliCompound2),
                        getString(R.string.khinkaliCooking),
                        getString(R.string.khinkaliCinnict),
                        getString(R.string.khinkaliimgType2))
                )
            ),
            Baking(
                getString(R.string.kotletu),
                getString(R.string.imgKotletu),
                getString(R.string.kotletu_descr),
                getString(R.string.imgKotletu2),
                listOf(
                    Cooking(
                    getString(R.string.kotletuName1),
                    getString(R.string.kotletuCompound1),
                    getString(R.string.kotletuCooking),
                    getString(R.string.kotletuCinnict),
                    getString(R.string.kotletuimgType1)),

                    Cooking(
                        getString(R.string.kotletuName2),
                        getString(R.string.kotletuCompound2),
                        getString(R.string.kotletuCooking),
                        getString(R.string.kotletuCinnict),
                        getString(R.string.kotletuimgType2))
                )
            ),
            Baking(
                getString(R.string.schnitzel),
                getString(R.string.imgSchnitzel),
                getString(R.string.schnitzel_descr),
                getString(R.string.imgSchnitzel2),
                listOf(
                    Cooking(
                        getString(R.string.schnitzelName1),
                        getString(R.string.schnitzelCompound1),
                        getString(R.string.schnitzelCooking),
                        getString(R.string.schnitzelCinnict),
                        getString(R.string.schnitzelimgType1)))
            )
            ,
            Baking(
                getString(R.string.syrniki),
                getString(R.string.imgSyrniki),
                getString(R.string.syrniki_descr),
                getString(R.string.imgSyrniki2),
                listOf(
                    Cooking(
                        getString(R.string.syrnikiName1),
                        getString(R.string.syrnikiCompound),
                        getString(R.string.syrnikiCooking),
                        getString(R.string.syrnikiCinnict),
                        getString(R.string.syrnikiimgType1)),

                    Cooking(
                        getString(R.string.syrnikiName2),
                        getString(R.string.syrnikiCompound),
                        getString(R.string.syrnikiCooking),
                        getString(R.string.syrnikiCinnict),
                        getString(R.string.syrnikiimgType2)),

                    Cooking(
                        getString(R.string.syrnikiName3),
                        getString(R.string.syrnikiCompound),
                        getString(R.string.syrnikiCooking),
                        getString(R.string.syrnikiCinnict),
                        getString(R.string.syrnikiimgType3))
                )
            ),
            Baking(
                getString(R.string.chebureki),
                getString(R.string.imgChebureki),
                getString(R.string.chebureki_descr),
                getString(R.string.imgChebureki2),
                listOf(
                    Cooking(
                    getString(R.string.cheburekiName1),
                    getString(R.string.cheburekiCompound),
                    getString(R.string.cheburekiCooking),
                    getString(R.string.cheburekiCinnict),
                    getString(R.string.cheburekiimgType1)))
            ),
            Baking(
                getString(R.string.cabbage),
                getString(R.string.imgCabbage),
                getString(R.string.cabbage_descr),
                getString(R.string.imgCabbage2),
                listOf(
                    Cooking(
                        getString(R.string.cabbageName1),
                        getString(R.string.cabbageCompound),
                        getString(R.string.cabbageCooking),
                        getString(R.string.cabbageCinnict),
                        getString(R.string.cabbageimgType1)))
                ),
            Baking(
             getString(R.string.dumplings),
             getString(R.string.imgDumplings),
             getString(R.string.dumplings_descr),
             getString(R.string.imgDumplings2),
                listOf(
                    Cooking(
                    getString(R.string.dumplingsName1),
                    getString(R.string.dumplingsCompound1),
                    getString(R.string.dumplingsCooking),
                    getString(R.string.dumplingsCinnict),
                    getString(R.string.dumplingsimgType1)),

                    Cooking(
                        getString(R.string.dumplingsName2),
                        getString(R.string.dumplingsCompound1),
                        getString(R.string.dumplingsCooking),
                        getString(R.string.dumplingsCinnict),
                        getString(R.string.dumplingsimgType2))
                )
            ),
            Baking(
            getString(R.string.lula_cebab),
            getString(R.string.imgLula_cebab),
            getString(R.string.lula_cebab_descr),
            getString(R.string.imgLula_cebab2),
                listOf(
                    Cooking(
                    getString(R.string.lula_cebabName1),
                    getString(R.string.lula_cebabCompound1),
                    getString(R.string.lula_cebabCooking),
                    getString(R.string.lula_cebabCinnict),
                    getString(R.string.lula_cebabimgType1)))
        )
        )


    }
}

