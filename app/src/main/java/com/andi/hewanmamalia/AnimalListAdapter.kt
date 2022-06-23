package com.andi.hewanmamalia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalListAdapter(val listAnimal:ArrayList<Animal>,val listener:onListener): RecyclerView.Adapter<AnimalListAdapter.AnimalListViewHolder>() {

    class AnimalListViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.tv_item_name)
        val detail = itemView.findViewById<TextView>(R.id.tv_item_detail)
        val photo = itemView.findViewById<ImageView>(R.id.tv_img_item)
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

interface onListener{
    fun klik(listAnimal:Animal)
}