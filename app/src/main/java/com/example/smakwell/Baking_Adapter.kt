package com.example.smakwell

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.smakwell.databinding.BakingItemBinding

class Baking_Adapter(
    val onClick: (bake: Baking)->Unit
):RecyclerView.Adapter<Baking_Adapter.BakingHolder>() {

    private val list= ArrayList<Baking>()

   inner class BakingHolder(item: View): RecyclerView.ViewHolder(item){
        val binding = BakingItemBinding.bind(item)

        fun bind (bake:Baking) = with(binding){
            tvNameBaking.text=bake.name
            val url = bake.img
            Glide.with(binding.root)
                .load(url)
                .centerCrop()
                .into(imgBaking)

            cvItem.setOnClickListener{
               onClick(list[adapterPosition])
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BakingHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.baking_item,parent,false)
      return BakingHolder(view)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: BakingHolder, position: Int) {
        holder.bind(list[position])
    }
    fun addBakes(newList:List<Baking>){
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }
}