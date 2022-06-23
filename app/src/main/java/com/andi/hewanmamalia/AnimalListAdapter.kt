package com.andi.hewanmamalia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalListAdapter(private val listAnimal:ArrayList<Animal>,private val listener:OnListener): RecyclerView.Adapter<AnimalListAdapter.AnimalListViewHolder>() {

    class AnimalListViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tv_item_name)
        val detail: TextView = itemView.findViewById(R.id.tv_item_detail)
        val photo: ImageView = itemView.findViewById(R.id.tv_img_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalListViewHolder {
        val view:View= LayoutInflater.from(parent.context).inflate(R.layout.item_animal,parent,false)
        return AnimalListViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimalListViewHolder, position: Int) {
        val animal=listAnimal[position]
        holder.name.text=animal.name
        holder.detail.text=animal.detail
        holder.photo.setImageResource(animal.photo)
        holder.itemView.setOnClickListener {
            listener.klik(listAnimal[position])
        }
    }

    override fun getItemCount(): Int {
        return listAnimal.size
    }
}

interface OnListener{
    fun klik(listAnimal:Animal)
}