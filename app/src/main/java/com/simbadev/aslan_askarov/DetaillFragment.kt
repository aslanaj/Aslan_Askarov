package com.simbadev.aslan_askarov

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simbadev.aslan_askarov.databinding.FragmentDetaillBinding

class DetailFragment : Fragment() {



    private lateinit var binding: DetaillFragment
    private lateinit var navArgs: CarFragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetaillBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            navArgs = CarFragment().fromBundle(it)
        }


        binding.apply {
            tvTitle.text = navArgs.cars.carsName
            tvDetail.text = navArgs.cars.carsDetail
            imgFirst.loadImage(navArgs.cars.carsImage)
        }

    }



}