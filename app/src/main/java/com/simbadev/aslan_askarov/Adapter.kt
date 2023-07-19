package com.simbadev.aslan_askarov

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.simbadev.aslan_askarov.databinding.ItemLayoutBinding

class Adapter(
    val carsList: ArrayList<Model>,
    val onClick: (cars: Model) -> Unit
) : RecyclerView.Adapter<Adapter.AdapterViewHolder>() {


    inner class AdapterViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val cars = carsList[adapterPosition]
            binding.apply {
                tvDesc.text = cars.carDetail
                tvTitle.text = cars.carName
                imgFirst.loadImage(cars.carImage)
            }
            itemView.setOnClickListener {
                onClick.invoke(cars)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        return AdapterViewHolder(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int = carsList.size

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        holder.bind()
    }
}