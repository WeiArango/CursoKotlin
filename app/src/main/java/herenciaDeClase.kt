/**HERENCIA DE CLASES
 * Puedo utilizar una característica especial llamada herencia de clases. Debo definir una clase que
 * se extienda de otra clase e introducir algunas modificaciones en el comportamiento. Así es la
 * herencia de clases. Para permitir la herencia de clases, la clase de la que quiero heredar debe
 * permitirlo, así que debe ser abierta. En otras palabras, debe haber un modificador abierto.
 * Tenga en cuenta que heredar de una clase se parece a implementar una interfaz, así que uso dos
 * puntos después de un constructor y, luego, el nombre de la clase, y esta es una llamada de
 * constructor de clase.
 * También debo utilizar el modificador override para decir explícitamente que puedo cambiar el
 * aspecto de esta clase y si cambio la implementación de la clase principal, entonces la aplicación
 * de sus elementos secundarios también cambiará.
 * */

//VEAMOS UN EJEMPLO DE HERENCIA DE CLASES CON EL FUNCIONAMIENTO DE UN DRON PADRE QUE VA A HEREDAR
//A UN DRON HIJO E INTRODUCIR ALGUNAS MODIFICACIONES EN EL COMPORTAMIENTO
open class Drone {
    //Como quiero modificar la propiedad look, esta debe estar abierta (open)
    open val look = "Black and white"

    //Ahora el método setOff debe ser abierta si quiero cambiar la configuración básica del Dron
    open fun setOff() {
        move(0.0, 10.0, 0.0)
    }
    //Ahora quiero que el Dron superhero avice cuando esta en movimiento, para eso debo anular move
    open fun move(front: Double, up: Double, rotate: Double) {
        println("Moving $front $up $rotate")
    }
}

class SuperHeroDrone(): Drone(){
    //Debo utilizar Override para decir explicitamente que puedo cambiar look y setOff de esta clase
    override val look: String = "Superhero look"
    override fun setOff() {
        println("Dron Superhero")
        move(0.0, 15.0, 0.0)
    }

    override fun move(front: Double, up: Double, rotate: Double) {
        println("Súperhero esta en movimiento")
        //El dron superhero avisa que se mueve pero en realidad no esta en movimiento, para cambiar
        //esto debo llamar a la función move original definida en el elemento principal, utilizando
        //la palabra reservada súper que indica que estoy haciendo referencia a la función desde el
        //elemento principal
        super.move(front, up, rotate)
    }
}

fun main() {
    val drone: Drone = SuperHeroDrone()
    println("Configuración look cambiada del dron original por el dron Súperhero: ${drone.look}")
    drone.setOff()
    println("Dron original")
    drone.move(10.0, 0.0, 0.0)
}


