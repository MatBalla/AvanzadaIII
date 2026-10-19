//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Matriz de 2 filas y 3 columnas(->)
    val matriz2 = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4),
        intArrayOf(5, 6))

        //acceder a un elemento

    //print(matriz2[0][0]) //posiion 0,0
    //print(matriz2[0][2]) //No existe la columna 3

    //Recorrer un arreglo

    for(i in matriz2.indices){
        for(j in matriz2[i].indices){
            print(" " + matriz2[i][j])
        }
        println()
    }

    //




}