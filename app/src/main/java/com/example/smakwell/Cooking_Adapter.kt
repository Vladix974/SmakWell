package com.example.smakwell

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.smakwell.databinding.CookingItemBinding

class Cooking_Adapter: RecyclerView.Adapter<Cooking_Adapter.CookingHolder>() {
    private val list= ArrayList<Cooking>()

    inner class CookingHolder(item: View): RecyclerView.ViewHolder(item){
        val binding = CookingItemBinding.bind(item)

        fun bind (cook: Cooking) = with(binding){
            tvNameTypeBake.text = cook.name
            tvCompound.text=cook.compound
            tvCooking.text=cook.cooking
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CookingHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.cooking_item,parent,false)
        return CookingHolder(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CookingHolder, position: Int) {
       holder.bind(list[position])
    }

    fun addTypeBake(newList: List<Cooking>){
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }
}