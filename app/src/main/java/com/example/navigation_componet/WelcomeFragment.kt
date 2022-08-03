package com.example.navigation_componet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_componet.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentWelcomeBinding.inflate(layoutInflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnIniciar.setOnClickListener {
            // Este es el segundo metodo y el mejor utilizado para desplazar  en las pantallas
           val action = WelcomeFragmentDirections.actionWelcomeFragment2ToStartFragment()
            findNavController().navigate(action)

        //Este es uno de los metodos para navegar en las diferentes pantallas del proyecto
        // findNavController().navigate(R.id.action_welcomeFragment2_to_startFragment)
        }
    }

}