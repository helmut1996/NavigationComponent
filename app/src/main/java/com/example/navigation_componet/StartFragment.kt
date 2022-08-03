package com.example.navigation_componet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_componet.databinding.FragmentGameBinding
import com.example.navigation_componet.databinding.FragmentStartBinding


class StartFragment : Fragment() {

    //private var _binding:Start? = null
   // private val binding get() = _binding!!

    private lateinit var binding:FragmentStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_start, container, false)
        binding = FragmentStartBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGameMode.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_gameModeDialog)
        }


        binding.btnSesion.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_fragmentGame)
        }

    }


}