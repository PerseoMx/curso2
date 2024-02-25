package com.matrix.androidmaster

/** comentarios
 *
 */
fun main(){
    /**VALORES
     *
     */

   // variable Int

    val age:Int = 47
    println("Jaqueline tiene : "+ age)

    // Variable Load
    val Ejemplo:Long=452

    println("Variable Long es igual a:" + Ejemplo)

    //Variable Float

    val EjemploFloat:Float= 245.6785f

    println("Variable Float es: "+EjemploFloat)

    // Variable double

    val EjemDouble:Double = 3.141684

    println("Imprimir un valor Double igual a: "+ EjemDouble)

    /**
     * VALORES ALFANUMERICAS
     */

    //Variable Char (solo soporte un caracter)

    val charEjemplo:Char='a'
    val charEjemplo2 : Char= '2'
    println("Imprimir dos valores Char: "+charEjemplo+charEjemplo2)

    //Variable String

    val nombre:String= "Hola mundo"

    println("imprimir un valor de String: "+ nombre)

    // Variable Boleano
    val BoleanEjemplo : Boolean = true

    println("Imprimir un valor booleano: "+ BoleanEjemplo)

    /**
     * VARAIABLES
     */

    //VARIABLE INT, PUEDE REASIGNARSE EL VALRO
    println("---------------VARIABLES-------------------")
    var age01:Int=34
    age01=47

    println("Tengo en años: "+ age01)

}