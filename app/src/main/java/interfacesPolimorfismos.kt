/**INTERFACES Y POLIMORFISMOS:
 * Digamos que necesitamos una función para hacer algo con un animal, independientemente del tipo de
 * animal que sea. El tipo de animal debería, por ejemplo, aceptar tanto a perros como a gatos. En
 * este caso, un animal puede ser tanto un perro como un gato, por lo que puede tomar muchas formas.
 * Por eso se llama polimorfismo, que significa muchas formas. Para tener un objeto que puede tomar
 * muchas formas, necesitaría especificar qué puedo hacer con el objeto, y para eso puedo usar las
 * interfaces
 * Animal
 *   / \
 * Dog Cat
 */
//Primero defino una interfáz utilizando la palabra clave interface y luego especifico el nombre de
//la interfáz. Luego especifico las propiedades de la interfáz dentro del cuerpo de la clase usando
//llaves con su respectivo tipo. La propiedad no debería tener un valor ya que son las clases las
//encargadas de especificar el valor de esta propiedad. Luego especifico el método que para este
//ejemplo será acariciar y tampoco debe tener un cuerpo por el mismo motivo que el método. La interfáz
//sólo especifica si una clase es un animal, entonces puede preguntar por su raza o puede acariciarlo
interface Animal {
    val raza: String
    val especie: String
    fun acariciar()
}

// Segundo defino las clases para implementar la interfáz. Para implementar la interfáz tiene que usar
// dos puntos y el nombre de la interfáz. Luego podemos especificar las propiedades, ojo que si es
// una propiedad que ya se definió en la interfáz, en este caso name, debemos utilizar la palabra
// Override, si es una propiedad nueva como name en este caso, la dejamos sin override.
// La palabra clave Override informa al lector de la función que esta propiedad es también
// especificada por una interfáz y por lo tanto no se puede cambiar porque podría provocar que la
// interfáz animal ya no se cumpliera porque requiere raza como propiedad. Luego debo especificar
// la función o el método acariciar y nuevamente debo usar Override. Luego debo especificar lo que
// sucede cuando se cumple el método acariciar, en este caso Maullar
// Vamos a definir una clase cat.
class Gato(
    val name: String,
    override val especie: String,
    override val raza: String
): Animal {
    override fun acariciar() {
        println("Maulla")
    }
}

// Vamos a definir una clase Dog
class Perro(
    val name: String,
    override val especie: String,
    override val raza: String
): Animal {
    override fun acariciar() {
        println("Ladra")
    }
}

// Vamos a definir una clase Tontín
class Tontin: Animal{
    override val especie: String = "Cerdo"
    override val raza: String = "LargeWhite"
    override fun acariciar() {
        println("Se convierte en una chuleta")
    }
}

// Tercero definamos una función para especificar que espero un Animal como argumento. No sabemos si
// el animal es perro o gato u otra clase de animal, pero será un Animal. Ahora dentro de esta función
// debo definir que puedo hacer con ese Animal, es decir puedo acariciar al animal o puedo preguntar
// por su raza
fun pet(animal: Animal){
    print("Si acaricio a un ${animal.especie} de raza ${animal.raza}" + " ")
    animal.acariciar()
}

// Cuarto llamemos a esta función y damos valores. Esta no aceptará nada que sea diferente de Animal
// osea tipo Int(123)
fun main() {
    pet(Gato("Ramón", "Felino", "Criollo"))
    pet(Perro("Chillón", "Canino", "Poodle"))
    pet(Tontin())
}