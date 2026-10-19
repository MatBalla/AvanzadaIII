fun main(){
    //Programa para sumar las dos matrices

    val matriz1 = Array(3){ IntArray(3) } //fils y columnas
    matriz1[0][0] = 1
    matriz1[0][1] = 2
    matriz1[0][2] = 3
    matriz1[1][0] = 3
    matriz1[1][1] = 4
    matriz1[1][2] = 5
    matriz1[2][0] = 5
    matriz1[2][1] = 6
    matriz1[2][2] = 7



    println("---------------------------------------")


    println("Ingrese cada numero")

    val matriz2 = Array(3){ IntArray(3) }

    for(i in matriz2.indices){
        for(j in matriz2[i].indices){
            matriz2[i][j] = readln().toInt()
        }
        println()
    }


    println("Matriz 1")
    for(i in matriz2.indices){
        for(j in matriz2[i].indices){
            print(" " + matriz2[i][j])
        }
        println()
    }
    println("------------------------------------------")

    println("Matriz 2")
    for(i in matriz1.indices){
        for(j in matriz1[i].indices){
            print(" " + matriz1[i][j])
        }
        println()
    }

    println("---------------------------------------")

    //Sumar matrices

    val matriz_Suma = Array(3){ IntArray(3) }

    for(i in matriz_Suma.indices){
        for(j in matriz_Suma[i].indices){
            matriz_Suma[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    println("Suma")
    for(i in matriz_Suma.indices){
        for(j in matriz_Suma[i].indices){
            print(" " + matriz_Suma[i][j])
        }
        println()
    }







}