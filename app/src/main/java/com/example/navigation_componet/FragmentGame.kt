package com.example.navigation_componet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_componet.databinding.FragmentGameBinding


class FragmentGame : Fragment() {

    private var _binding:FragmentGameBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment use ViewBinding
        _binding = FragmentGameBinding.inflate(inflater,container,false)
        return binding.root
        //return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSalir.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentGame_to_welcomeFragment2)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}