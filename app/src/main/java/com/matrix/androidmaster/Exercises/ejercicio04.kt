package com.matrix.androidmaster.Exercises

import java.math.RoundingMode
import java.text.DecimalFormat

fun main (){

    var porcentaje:Boolean=true
    println("el calculo iniciara con porcentaje true our false")
    porcentaje=readLine()!!.toBoolean()
    textura(porcentaje)
}

fun textura(porciento:Boolean){
    if(porciento){
    println("Si es True Se calculara la textura a partir de los porcentajes")

        // INGRESO DE DATOS

        println("Ingreso el valor en % de la Arena: ")
        val arenaPor = readLine()!!.toDouble()
        println("Ingreso el valor en % de la Arcilla: ")
        val arcillaPor = readLine()!!.toDouble()
        println("Ingreso el valor en % de el Limo: ")
        val limoPor = readLine()!!.toDouble()

                //REDEFINIENDO VARIABLES PARA CACULOS

        val arena = arenaPor
        val arcilla = arcillaPor
        val limo = 100-arena-arcilla


//    Suma del total porciento

        val sumaPorciento = (arena + arcilla + limo)

        //Funcion para redondear los numeros
        val df = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.CEILING

        //Redondeo de decimales

        val redArena = df.format(arena)
        val redArcilla = df.format(arcilla)
        val redLimo = df.format(limo)
        val redSuma = df.format(sumaPorciento)


// Imprimir resultado con el redondeo incluido
        println("-------------PORCENTAJES DE LAS PARTICULAS-------------")
        println("Porcentaje de Arena:---> $redArena %")
        println("Porcentaje de Arcilla:-> $redArcilla %")
        println("Porcentaje de Limo:----> $redLimo %")
        println("Suma total Porciento:--> $redSuma %")

        println("-------------TEXTURA DEL SUELO----------")

//CALCULO DE TEXTURA DE SUELO

        if (((limo + 1.5) * arcilla) < 15.0) {
            println("ARENOSA")

        } else if ((((limo + 1.5) * arcilla) >= 15) && (((limo + 2) * arcilla) < 30)) {
            println("ARENO FRANCO")

        } else if ((arcilla >= 7 && arcilla < 20) && (arena > 52) && (((limo + 2) * arcilla) >= 30) || (arcilla < 7 && limo < 50 && (((limo + 2) * arcilla) >= 30))) {
            println("FRANCO ARENOSO")

        } else if ((arcilla >= 7 && arcilla < 27) && (limo >= 28 && limo < 50) && (arena <= 52)) {
            println("FRANCO")

        } else if ((limo >= 50 && (arcilla >= 12 && arcilla < 27)) || ((limo >= 50 && limo < 80) && arcilla < 12)) {
            println("FRANCO LIMOSA")

        } else if ((arcilla >= 20 && arcilla < 35) && (limo < 28) and (arena > 45)) {
            println("FRANCO ARCILLO ARENOSO")

        } else if ((arcilla >= 27 && arcilla < 40) && (arena > 20 && arena <= 45)) {
            println("FRANCO ARCILLOSOA")

        } else if ((arcilla >= 27 && arcilla < 40) && (arena <= 20)) {
            println("FRANCO ARCILLO LIMOSA")

        } else if (arcilla >= 35 && arena > 45) {
            println("ARCILLO ARENOSA")

        } else if (arcilla >= 40 && limo >= 40) {
            println("ARCILLO LIMOSA")

        } else if (arcilla >= 40 && arena <= 45 && limo < 40) {
            println("ARCILLOSA")

        } else {
            println("VALOR FUERA DE RANGO")
        }

        println("------------------------------------------------")




    }else{
        // INGRESO DE DATOS

        println("Ingreso el valor en cm de la Arena: ")
        val arenaCm = readLine()!!.toDouble()
        println("Ingreso el valor en cm de la Arcilla: ")
        val arcillaCm = readLine()!!.toDouble()
        println("Ingreso el valor en cm de el Limo: ")
        val limoCm = readLine()!!.toDouble()

        //CALCULOS

        val sumaTexturaCm = (arenaCm + arcillaCm + limoCm)
        val PorcientoArena = (arenaCm / sumaTexturaCm * 100)
        val PorcientoArcilla = (arcillaCm / sumaTexturaCm * 100)
        val PorcientoLimo = 100 - PorcientoArena - PorcientoArcilla

        //REDEFINIENDO VARIABLES PARA CACULOS

        val arena = PorcientoArena
        val arcilla = PorcientoArcilla
        val limo = PorcientoLimo


//    Suma del total porciento

        val sumaPorciento = (PorcientoArena + PorcientoArcilla + PorcientoLimo)

        //Funcion para redondear los numeros
        val df = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.CEILING

        //Redondeo de decimales

        val redArena = df.format(PorcientoArena)
        val redArcilla = df.format(PorcientoArcilla)
        val redLimo = df.format(PorcientoLimo)
        val redSuma = df.format(sumaPorciento)


// Imprimir resultado con el redondeo incluido
        println("-------------PORCENTAJES DE LAS PARTICULAS-------------")
        println("Porcentaje de Arena:---> $redArena %")
        println("Porcentaje de Arcilla:-> $redArcilla %")
        println("Porcentaje de Limo:----> $redLimo %")
        println("Suma total Porciento:--> $redSuma %")

        println("-------------TEXTURA DEL SUELO----------")

//CALCULO DE TEXTURA DE SUELO

        if (((limo + 1.5) * arcilla) < 15.0) {
            println("ARENOSA")

        } else if ((((limo + 1.5) * arcilla) >= 15) && (((limo + 2) * arcilla) < 30)) {
            println("ARENO FRANCO")

        } else if ((arcilla >= 7 && arcilla < 20) && (arena > 52) && (((limo + 2) * arcilla) >= 30) || (arcilla < 7 && limo < 50 && (((limo + 2) * arcilla) >= 30))) {
            println("FRANCO ARENOSO")

        } else if ((arcilla >= 7 && arcilla < 27) && (limo >= 28 && limo < 50) && (arena <= 52)) {
            println("FRANCO")

        } else if ((limo >= 50 && (arcilla >= 12 && arcilla < 27)) || ((limo >= 50 && limo < 80) && arcilla < 12)) {
            println("FRANCO LIMOSA")

        } else if ((arcilla >= 20 && arcilla < 35) && (limo < 28) and (arena > 45)) {
            println("FRANCO ARCILLO ARENOSO")

        } else if ((arcilla >= 27 && arcilla < 40) && (arena > 20 && arena <= 45)) {
            println("FRANCO ARCILLOSOA")

        } else if ((arcilla >= 27 && arcilla < 40) && (arena <= 20)) {
            println("FRANCO ARCILLO LIMOSA")

        } else if (arcilla >= 35 && arena > 45) {
            println("ARCILLO ARENOSA")

        } else if (arcilla >= 40 && limo >= 40) {
            println("ARCILLO LIMOSA")

        } else if (arcilla >= 40 && arena <= 45 && limo < 40) {
            println("ARCILLOSA")

        } else {
            println("VALOR FUERA DE RANGO")
        }

        println("------------------------------------------------")
    }
}