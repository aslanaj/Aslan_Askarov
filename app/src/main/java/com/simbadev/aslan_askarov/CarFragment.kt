package com.simbadev.aslan_askarov

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.simbadev.aslan_askarov.databinding.FragmentCarBinding


class CarFragment : Fragment() {
    private lateinit var binding: CarFragment
    private lateinit var carsList: ArrayList<Model>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        val adapter = Adapter(carsList, this::onClick)
        binding.rvCar.adapter = adapter
    }

    private fun loadData() {
        carsList = ArrayList<Model>()
        carsList.apply {
            add(Model("BMW","M% comp","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg/640px-Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg"))
            add(Model("BMW","M% comp","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg/640px-Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg"))
            add(Model("BMW","M% comp","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg/640px-Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg"))
            add(Model("BMW","M% comp","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg/640px-Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg"))
            add(Model("BMW","M% comp","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg/640px-Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg"))
            add(Model("BMW","M% comp","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg/640px-Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg"))
            add(Model("BMW","M% comp","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg/640px-Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg"))
            add(Model("BMW","M% comp","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg/640px-Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg"))
            add(Model("BMW","M% comp","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg/640px-Kunmadaras_Motorsport_2021._szeptember_19._JM_%28157%29.jpg"))

        }
    }

    private fun onClick(cars: Model) {

        findNavController().navigate(CarFragment.actionFirstFragmentToSecondFragment(cars))

    }

}