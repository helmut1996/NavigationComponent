package com.example.navigation_componet

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController

class GameModeDialog:DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val  gameOptions = arrayOf("modo 1","modo 2","modo 3", "modo 4")
        var optionSelected = gameOptions[0]

        return activity?.let {
            val builder = AlertDialog.Builder(it)

            builder .setTitle("Dialog Fragment")
                .setSingleChoiceItems(gameOptions, 0){ dialog, position->
                    optionSelected = gameOptions[position]
                }
                .setPositiveButton("ACEPTAR"){
                    dialog, id->
                    findNavController().previousBackStackEntry?.savedStateHandle?.set("gameModeKey",optionSelected)
                    dialog.dismiss()
                }
                .setNegativeButton("CANCELAR"){
                    dialog, id-> dialog.dismiss()
                }
            builder.create()

        }?: throw IllegalStateException("Activity cannot be null Error")
    }
}