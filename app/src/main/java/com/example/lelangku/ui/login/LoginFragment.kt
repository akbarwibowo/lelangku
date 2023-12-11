package com.example.lelangku.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lelangku.R
import com.example.lelangku.databinding.FragmentLoginBinding
import org.koin.android.ext.android.inject

class LoginFragment: Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private val viewModel: LoginViewModel by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        init()
        observeData()
//        binding.btnLogin.setOnClickListener {
//            findNavController().navigate(R.id.action_loginFragment_to_homeFragment3)
//        }
        return binding.root
    }

    private fun observeData() {
        with(viewModel){
            observeIsLogin().observe(requireActivity()){
                it.let{data ->
                    if(data != null){
                        findNavController().navigate(R.id.action_loginFragment_to_homeFragment3)
                    }
                }
            }
        }
    }

    private fun init() {
        with(binding){
            btnLogin.setOnClickListener {
                if (email.text.isNullOrBlank()){
                    email.error = "Email masih kosong"
                }
                if(password.text.isNullOrBlank()){
                    password.error = "passowrd masih kosong"
                }
                if (email.text.isNullOrBlank() && password.text.isNullOrBlank()){
                    viewModel.getDataLogin(email.text.toString(), password.text.toString())
                }
            }

            toRegister.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_fragment_register)
            }
        }
    }
}