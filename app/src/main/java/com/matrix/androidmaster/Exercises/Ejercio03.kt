package com.matrix.androidmaster.Exercises

fun main() {
    val arena: Double = 14.5
    val limo: Double = 10.00
    textura(arena,limo)

}

fun textura (porcentajeArena:Double, porcentajeLimo:Double){

    if (porcentajeArena<15 && porcentajeLimo==10.0 ){
        println("Textura Franco Limosa")
    }else{
        println("el valor esta errado")
    }
}