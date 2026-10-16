fun main(){
    //ciclo for para solicitar 10 numeros
    println("Ingrese 10 numeros")
    val k = 0
    var acumularPositivo = 0
    var acumularNegativo = 0
    var acumularCero = 0
    for(i in 1..10){
        println("Ingrese el numero $i")
        val k = readln().toInt()
        if(k != 0){
            if(k>0){
                println("El numero es positivo")
                acumularPositivo++
            }else{
                println("El numero es negativo")
                acumularNegativo++
            }
        }else{
            println("El numero es 0")
            acumularCero++
        }

    }


    println("Que desea consultar:")
    println("Cantidad de numeros positivos - 1 ")
    println("Cantidad de numeros negativos - 2")
    println("Cantidad de numeros ceros - 3")
    println("Salir - 0")

    val opcion = readln().toInt()
    when(opcion){
        1 ->  println("Los numeros positivos son $acumularPositivo")
        2 -> println("Los numeros negativos son $acumularNegativo")
        3 -> println("Los numeros cero son $acumularCero")
        0 -> println("Salir")
        else -> println("No ingresaste  una opcion")
    }


}