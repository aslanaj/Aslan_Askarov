package com.simbadev.aslan_askarov

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.simbadev.aslan_askarov.databinding.FragmentCarBinding


class CarFragment : Fragment() {
    private lateinit var binding: FragmentCarBinding
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
            add(



                Model(
                    "BMW",
                    "2020",
                    "https://cars.bmw-rolf.ru/upload/resize_cache/iblock/090/700_600_1/090c54708be03780c7962c085f80a305.png"
                )
            )
            add(
                Model(
                    "BMW",
                    "2020",
                    "https://s1.avilon.ru/upload/resize_cache/iblock/e15/531_0_1/e1595c450af48c4ff61bcbe38b0c6bb9.png"
                )
            )
            add(
                Model(
                    "BMW",
                    "2020",
                    "https://cars.bmw-rolf.ru/upload/resize_cache/iblock/090/700_600_1/090c54708be03780c7962c085f80a305.png"
                )
            )
            add(
                Model(
                    "BMW",
                    "2020",
                    "https://s1.avilon.ru/upload/resize_cache/iblock/e15/531_0_1/e1595c450af48c4ff61bcbe38b0c6bb9.png"
                )
            )
            add(
                Model(
                    "BMW",
                    "2020",
                    "https://cars.bmw-rolf.ru/upload/resize_cache/iblock/090/700_600_1/090c54708be03780c7962c085f80a305.png"
                )
            )
            add(
                Model(
                    "BMW",
                    "2020",
                    "https://cars.bmw-rolf.ru/upload/resize_cache/iblock/090/700_600_1/090c54708be03780c7962c085f80a305.png"
                )
            )
            add(
                Model(
                    "BMW",
                    "2020",
                    "https://cars.bmw-rolf.ru/upload/resize_cache/iblock/090/700_600_1/090c54708be03780c7962c085f80a305.png"
                )
            )
            add(
                Model(
                    "BMW",
                    "2020",
                    "https://cars.bmw-rolf.ru/upload/resize_cache/iblock/090/700_600_1/090c54708be03780c7962c085f80a305.png"
                )
            )
            add (
                    Model(
                        "BMW",
                        "2020",
                        "https://cars.bmw-rolf.ru/upload/resize_cache/iblock/090/700_600_1/090c54708be03780c7962c085f80a305.png"
                    )
                    )
            add (
                    Model(
                        "BMW",
                        "2020",
                        "https://cars.bmw-rolf.ru/upload/resize_cache/iblock/090/700_600_1/090c54708be03780c7962c085f80a305.png"
                    )
                    )
            add (
                    Model(
                        "BMW",
                        "2020",
                        "https://cars.bmw-rolf.ru/upload/resize_cache/iblock/090/700_600_1/090c54708be03780c7962c085f80a305.png"
                    )
                    )
            add (
                    Model(
                        "BMW",
                        "2020",
                        "https://cars.bmw-rolf.ru/upload/resize_cache/iblock/090/700_600_1/090c54708be03780c7962c085f80a305.png"
                    )
                    )


        }
    }

    private fun onClick(cars: Model) {

   //     findNavController().navigateUp()

    }

}