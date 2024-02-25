package com.matrix.androidmaster

fun main(){
    /**
     * Variables y ejercicios de calculos aritmeticos conjungando variables de Int y Float
     */
    var age1:Int = 47
    var age2:Float = 25f

    age1= 50

    println("suma:")
    println(age1+age2)

    println("Restar:")
    println(age2-age1)

    println("Multiplicar: ")
    println(age1*age2)

    println("Dividir:")
    println(age1/age2)

    println("Modulo: ")
    println(age1%age2)

    /**
     * Conversion de variables
     */

    val alumno01:Int=25
    val alumno02:Float=36.4f

    val suma = alumno01+ alumno02.toInt()

    println("La conversion de la suma es: ")
    println(suma)

    // convertir float a double
    val flotante = alumno01+ alumno02.toDouble()
    println("la conversion a double es: ")
    println(flotante)

    // convertir una cadena a Entero

    val strinEjemploi01 = "5"
    val stringEjemplo02 = "10"

    println(strinEjemploi01.toInt()+stringEjemplo02.toInt())

    // concatenacion
    var stringConcatenada : String = "Richard"
    stringConcatenada= "Mi nombre es: "

    println("$stringConcatenada $stringEjemplo02")



}