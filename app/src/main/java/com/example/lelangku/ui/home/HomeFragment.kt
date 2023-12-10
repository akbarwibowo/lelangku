package com.example.lelangku.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lelangku.data.remote.response.Hit
import com.example.lelangku.databinding.FragmentHomeBinding
import org.koin.android.ext.android.inject


class HomeFragment : Fragment() {
    private lateinit var _binding: FragmentHomeBinding
    private val binding get() = _binding
    private val viewModel: HomeViewModel by inject()
    private var listProducts: List<Hit> = listOf()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentHomeBinding.inflate(inflater, container   , false)
        init()
        observeData()
        return binding.root
    }

    private fun observeData() {
        with(viewModel){
            observeProducts.observe(requireActivity()){
                    it.let { data ->
                        listProducts = data.body() ?.hits?: listOf()
                        with(binding.productList){
                            adapter = HomeAdapter(listProducts)
                            layoutManager = LinearLayoutManager(requireContext())
                    }
                }
            }
        }
    }

    private fun init(){
        viewModel.getProducts()
    }
}