package com.matrix.androidmaster

fun main() {

    mostrarEdad(currentEdad = 47)
    add(47, 50)
    MostrarNombre("Richard")
}

fun mostrarEdad(currentEdad: Int) {

    println("Yo Jaquelin tengo $currentEdad años")

}

fun add(primerValor: Int, segundoValor: Int) {
    println("Richard tiene $primerValor años y Jaquelin $segundoValor años")
    println(primerValor + segundoValor)
}

fun MostrarNombre(nombre:String){
    println("Me llamo $nombre")
}
