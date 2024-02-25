package com.matrix.androidmaster

/**
 * Condicionantes if, elif, else
 */
fun main() {

    ifBasico()
    ifAnidado()
    ifAnidado01()
    ifBoolean()
    ifMultiples()
}

// if Básico
fun ifBasico() {

    val nombre = "Richard"
    if (nombre == "Richard") {
        println("COORECTO: EL valor es correcto")
    } else {
        println("INCORRECTO: El Nombre esta errado")
    }

}

//if Anidado 01 basico

fun ifAnidado() {

    val animal = "gato"

    if (animal == "perro") {
        println("Es un perro")

    } else {
        println("No en un perro")
    }

    if (animal == "gato") {
        println("Es un gato")
    } else {
        println("No es un gato")
    }
}

// If Anidado else if

fun ifAnidado01() {
    val animal01 = "Richard"

    if (animal01 == "perro") {
        println("En un perro")
    } else if (animal01 == "gato") {
        println("Es un gatos")
    } else if (animal01 == "bird") {
        println("Es un pájaro")
    } else {
        println("No es un animal")
    }
}

//if Boolean

fun ifBoolean(){

    val soyFeliz:Boolean = false

    // sin nada == true
    // con ! al principio == false

    if (!soyFeliz){
        println("Estoy triste :(")
    }
}

// if Comparadores

fun ifMultiples (){

    // el doble simbolo && significa and
    // el signo || sifnifica our
    // el signo == es igual
    // el signo >= es mayor o igual

    var anhos:Int = 18
    var permiso = false
    var dia ="jueves"

    if (anhos>= 18 && dia =="viernes" || permiso){
        println("tiene permiso para salir")
    }else
        println("No tiene permiso para salir")
}

