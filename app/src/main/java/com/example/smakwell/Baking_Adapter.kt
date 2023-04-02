package com.example.smakwell

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.smakwell.databinding.BakingItemBinding
//(val onClick: (name: String, img:Int, descr: String )-> Unit
//)
class Baking_Adapter(
    val onClick: (name: String, descr: String)->Unit
):RecyclerView.Adapter<Baking_Adapter.BakingHolder>() {

    private val List= ArrayList<Baking>()

   inner class BakingHolder(item: View): RecyclerView.ViewHolder(item){
        val binding = BakingItemBinding.bind(item)

        fun bind (bake:Baking) = with(binding){
            tvNameBaking.text=bake.name
            imgBaking.setImageResource(bake.img)

            cvItem.setOnClickListener{
               onClick(bake.name,bake.desr)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BakingHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.baking_item,parent,false)
      return BakingHolder(view)
    }

    override fun getItemCount(): Int {
       return List.size
    }

    override fun onBindViewHolder(holder: BakingHolder, position: Int) {
        holder.bind(List[position])
    }
    fun addBakes(newList:List<Baking>){
        List.clear()
        List.addAll(newList)
        notifyDataSetChanged()
    }
}