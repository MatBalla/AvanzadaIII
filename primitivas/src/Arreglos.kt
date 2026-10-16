import javax.imageio.stream.ImageInputStream

fun main(){
    //Vectores y arreglos


    //Vectores
    val numeros = IntArray(5)
    numeros[0] = 1
    numeros[1] = 2
    numeros[2] = 3
    numeros[3] = 4
    numeros[4] = 5

    val numeros2 = intArrayOf(2, 4, 9)

    for (i in numeros.indices){
        println(numeros[i])
    }

    //Arreglos
    val matriz1 = Array(3){ IntArray(3) } //fils y columnas
    matriz1[0][0] = 1
    matriz1[0][1] = 2
    matriz1[0][2] = 3
    matriz1[0][3] = 4
    matriz1[0][4] = 5
    matriz1[0][5] = 6

    val matriz2 = arrayOf(intArrayOf(1, 2),
                            intArrayOf(3, 4),
                            intArrayOf(5, 6))

    for (i in matriz2.indices){
        println(matriz2[i][0])
    }

}