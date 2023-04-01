package com.example.smakwell

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import com.example.smakwell.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapterBake = Baking_Adapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapterBake.addBakes(createBaking())
            binding.apply {
                rcBaking.layoutManager = GridLayoutManager(this@MainActivity,2)
                rcBaking.adapter=adapterBake
        }
    }
    fun createBaking(): List<Baking>{
        return listOf(
            Baking(getString(R.string.benderyky),R.drawable.benderuku),
            Baking(getString(R.string.mlunci),R.drawable.mlunci),
            Baking(getString(R.string.varenyky),R.drawable.varenyky),
            Baking(getString(R.string.khinkali),R.drawable.khinkali),
            Baking(getString(R.string.kotletu),R.drawable.kotletu),
            Baking(getString(R.string.schnitzel),R.drawable.schnitzel),
            Baking(getString(R.string.syrniki),R.drawable.syrniki),
            Baking(getString(R.string.chebureki),R.drawable.chebureki),
            Baking(getString(R.string.cabbage),R.drawable.cabbage),
            Baking(getString(R.string.dumplings),R.drawable.dumplings),
            Baking(getString(R.string.lula_cebab),R.drawable.lula_cebab)
        )
    }
}