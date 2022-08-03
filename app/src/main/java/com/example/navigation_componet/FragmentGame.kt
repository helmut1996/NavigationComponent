package com.example.navigation_componet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigation_componet.databinding.FragmentGameBinding


class FragmentGame : Fragment() {

    private var _binding:FragmentGameBinding? = null
    private val binding get() = _binding!!

    private val args:FragmentGameArgs by navArgs()
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

        binding.tvGame.text = args.login.toString()

        binding.btnSalir.setOnClickListener {
          val action =  FragmentGameDirections.actionFragmentGameToWelcomeFragment2()
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}