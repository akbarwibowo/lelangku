package com.example.lelangku.ui.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import com.example.lelangku.R
import com.example.lelangku.data.local.UserEntity
import com.example.lelangku.databinding.FragmentRegisterBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class RegisterFragment: Fragment() {
    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!
    private val viewModel: RegisterViewModel by inject()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        init()
        observeData()
//        binding.btnRegister.setOnClickListener {
//            findNavController().navigate(R.id.action_fragment_register_to_homeFragment3)
//        }
        return binding.root
    }

    private fun observeData(){
        with(viewModel){
            observeIsRegister().observe(viewLifecycleOwner){
                it.let {data->
                    if(data != null){
                        findNavController().navigate(R.id.action_fragment_register_to_loginFragment)
                    } else{
                        Toast.makeText(requireContext(), "Email sudah terfadtar", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
    private fun init(){
        binding.btnRegister.setOnClickListener {
            val name = binding.fullname.text.toString()
            val email = binding.email.text.toString()
            val password = binding.password.text.toString()
            val user = UserEntity(0, name, email, password)
            CoroutineScope(viewModel.viewModelScope.coroutineContext).launch {
                viewModel.insertUser(user)
            }
        }
    }
}