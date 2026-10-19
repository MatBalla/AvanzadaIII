// Primera forma
class Persona{
    var nombre:String = "mateo"
    var edad:Int = 22
    var estatura:Double = 1.73


}

//Segunda forma -> Se definen los atributos de forma directa
class Vehiculo(var marca: String, var precio:Int, var color:String, var cilindraje:Double){
    //Al crear la instancia de la clase, se crean los getters y setters de forma automatica

    var velocidadActual: Int = 0

    //metodos = funciones

    fun encender(){
        println("El " + marca + " se ha encendido")
    }

    fun apagar(): String{
        return("El " + marca + " se va a apagar")
    }

    fun acelerar(incremento:Int):Int{
       velocidadActual += incremento
       return velocidadActual
    }

    fun frenar(decremento:Int):Int{
        velocidadActual -= decremento
        if(velocidadActual < 0)
        velocidadActual = 0
        return velocidadActual
    }

    fun pitar(veces:Int):String{
        var  sonido = ""
        for(i in 0..veces){
            sonido += "Beeep - "
        }
        return sonido
    }


    fun mostrar(){
        println("La marca del auto es: " + marca + " , el precio del auto es: " + precio
                + " , el color del carro es" + color + " , el cilindraje es: " + cilindraje)
    }



}

fun main(){
    val carro1 = Vehiculo("Mercedes Benz", 50000, "blanco", 2.0)

    println(carro1.marca) //get

    carro1.precio = 50001//set

    carro1.encender()


    //metodo1
    println(carro1.acelerar(80))

    println(carro1.frenar(30))

    println(carro1.pitar(10))

    carro1.mostrar()


}
