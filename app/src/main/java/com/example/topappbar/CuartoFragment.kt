package com.example.topappbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.topappbar.databinding.FragmentCuartoBinding
import com.example.topappbar.databinding.FragmentTercerBinding


class CuartoFragment : Fragment() {


    private lateinit var binding: FragmentCuartoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCuartoBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
        //return inflater.inflate(R.layout.fragment_cuarto, container, false)
    }


}