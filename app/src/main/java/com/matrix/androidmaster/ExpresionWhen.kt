package com.matrix.androidmaster

/**
 * EXPRESION WHEN
 */

fun main() {
    getMes(11)
    getTrimestre(9)
    getSemestre(12)
    resultado("richard")
    println(getEdad(14))
    println(getPH(9))
}

fun getMes(mes: Int) {
    when (mes) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> {
            println("Noviembre")
            println("Noviembre")
            println("Noviembre")
        }

        12 -> println("Diciembre")
        else -> println("El valor no es valido")
    }
    //NOTA: Para meter varias lineas en un valor de When como pasa para el # 11 se debe poner entre llaves las lineas que se requiera
}

//EJEMPLO DE AGRUPACION DE VARIAS VARIABLES EN UNA EXPRESION WHEN

fun getTrimestre(mes: Int) {
    when (mes) {
        1, 2, 3 -> println("PRIMER TRIMESTRE")
        4, 5, 6 -> println("SEGUNDO TRIMESTRE")
        7, 8, 9 -> println("TERCER TRIMESTRE")
        10, 11, 12 -> println("CUARTO TRIMESTRE")
        else -> println("EL VALOR ESTA ERRADO")
    }
}

// CON ESTA FUNCION SE PUEDEN DETERMINAR CUMPLIMIENTO DE RANGOS EJ: in 250 .. 1500 ->
fun getSemestre(mes: Int) {
    when (mes) {
        in 1..6 -> println("PRIMER SEMESTRE")
        in 7..12 -> println("SEGUNDO SEMESTRE")
        !in 1..12 -> println("SEMESTRE NO VALIDO")  // esta linea es identica a else, con el signo! se determina negación
    }
}

//  APLICANDO WHEN CON CUALQUIER VALOR SEA Int, String, Bolean, etc

fun resultado(valor: Any) {
    when (valor) {
        is Int -> println(valor + valor)
        is String -> println(valor)
        is Boolean -> if (valor) println("holiwi")
    }
}

// APLICANDO RETURN CON WHEN

fun getEdad(edad: Int): String {
    return when (edad) {
        in 1..10 -> "Niño"
        in 11..15 -> "Pupertad"
        in 15..18 -> "Adolescente"
        !in 1..18 -> "No es una edad"
        else -> "Datos invalidos"
    }

}
// INTEGRANDO WHEN COMO PARTE D EUNA FUNCION
fun getPH(ph: Int)=when(ph){
    in 1..6 -> "ALCALINO"
    in 7..14 -> "acido"
    !in 1..14 -> "No es una edad"
    else -> "Datos invalidos"
}