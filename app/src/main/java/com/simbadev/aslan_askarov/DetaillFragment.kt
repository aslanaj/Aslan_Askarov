package com.simbadev.aslan_askarov

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simbadev.aslan_askarov.databinding.FragmentDetaillBinding

class DetaillFragment : Fragment() {



    private lateinit var binding: FragmentDetaillBinding
    private lateinit var navArgs: DetaillFragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetaillBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

     /*  arguments?.let {
            navArgs = DetaillFragment.fromBundle(it)
        }


        binding.apply {
            tvTitle.text = navArgs.car.carTitle
            tvDesc.text = navArgs.car.carsDetail
            imgFirst.loadImage(navArgs.car.carsImage)
        }*/

    }



}