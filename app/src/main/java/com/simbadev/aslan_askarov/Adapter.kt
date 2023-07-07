package com.simbadev.aslan_askarov

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.simbadev.aslan_askarov.databinding.ItemLayoutBinding

class Adapter(val heroesList: ArrayList<Model>,
              val onClick: (cars: Model)->Unit): RecyclerView.Adapter <Adapter.AdapterViewHolder>(){


   inner class AdapterViewHolder(private val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root){
       fun bind() {
           val cars = carsList[adapterPosition]
           binding.apply {
               tvDesc.text = cars.heroesStatus
               tvTitle.text = cars.heroesName
               imgFirst.loadImage(cars.heroesImage)
           }
           itemView.setOnClickListener {
               onClick.invoke(cars)
           }
       }

   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        return AdapterViewHolder(ItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun getItemCount(): Int = carsList.size

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        holder.bind()
    }
}