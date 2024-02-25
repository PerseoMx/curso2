package com.matrix.androidmaster

/**
 * Funciones con parametros de salida
 */
fun main(){

    val mySustraer= sustraer(60.24,15.45)
    println(mySustraer)
    MirarEdad(47)
}

fun sustraer(primerNumero:Double,segundoNumero:Double):Double{
    return primerNumero-segundoNumero
}

// funcion que establece un valor por defecto:

fun MirarEdad (myEdad:Int=8) {
    println("Tengo $myEdad años")
}