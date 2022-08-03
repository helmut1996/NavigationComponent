package com.example.navigation_componet.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//@Parcelize
@Parcelize
data class Login(
val modojuego: String,
val usuario:String,
val contr:String
):Parcelable{
    override fun toString(): String {
        return "Modo Juego: $modojuego\n\nUsuario: $usuario\n\ncontrasena: $contr"
    }
}
