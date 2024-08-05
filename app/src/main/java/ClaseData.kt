/**CLASES ESPECIALES
 *
 * >>> CLASE DATA
 * Como se demostró en el primer módulo, los valores básicos como String o Int se pueden comparar o
 * imprimir.  Sin embargo, los objetos creados a partir de clases personalizadas se comportan de
 * forma algo diferente. Examinemos lo que sucede cuando se comparan o imprimen estos objetos y,
 * luego, analicemos cómo se puede modificar este comportamiento usando un modificador de clase
 * especial denominado data.
 *
 * fun main() {
 * println("A" == "A") // true
 * println("A" == "B") // false
 * }
 *
 * Digamos que tiene una clase muy simple. Puede compararla consigo misma, pero esta comparación
 * solo devolverá true, si exactamente la misma instancia está en ambos lados de la comparación.
 * Esto significa que, de forma predeterminada, todos los objetos creados con clases personalizadas
 * se consideran únicos; es decir, no son iguales a ningún otro objeto.
 *
 * class Dog(
 * val name: String
 * )
 *
 * fun main() {
 * val pluto1 = Dog("Pluto")
 * val pluto2 = Dog("Pluto")
 *
 * println(pluto1 == pluto2) // false
 * println(pluto1 == pluto1) // true
 * }
 *
 * Imprimir o transformar un objeto en una cadena tampoco es muy útil. El resultado debe ser este
 * nombre de clase, el signo @ y algunos dígitos numéricos. El número no es realmente útil, solo nos
 * ayuda a saber si dos objetos son iguales o no.
 *
 * println(pluto1) // Dog@404b9385
 * println("Dog: $pluto1") // Dog: Dog@404b9385
 *
 * Entonces, ¿qué puede hacer para obtener datos más significativos al imprimir una cadena? Este
 * comportamiento puede modificarse si utiliza el modificador data antes de una clase.
 * Se utiliza antes de las clases que representan un conjunto de datos. Dicha clase es igual a una
 * instancia diferente de la misma clase si sus propiedades del constructor tienen el mismo valor.
 *
 * data class Dog(
 * val name: String
 * )
 *
 * fun main() {
 * val pluto1 = Dog("Pluto")
 * val pluto2 = Dog("Pluto")
 * val rex = Dog("Rex")
 *
 * println(pluto1 == pluto2) // true
 * println(pluto1 == pluto1) // true
 * println(pluto1 == rex) // false
 * }
 *
 * Cuando transforma una clase de datos en una cadena, no solo tiene este nombre de clase, sino
 * también valores para cada propiedad del constructor.
 *
 * println(pluto1) // Dog(name=Pluto)
 * println("Dog: $pluto1") // Dog: Dog(name=Pluto)
 *
 * data class Dog(
 * val name: String,
 * val age: Int
 * )
 *
 * val dog = Dog("Pluto", 7)
 * val (name, age) = dog
 * println(name) // Pluto
 * println(age) // 7
 *
 * Tenga en cuenta que la desestructuración en Kotlin se basa en la posición, no en el nombre, por
 * lo que los nombres del valor deben colocarse en las posiciones correctas. Por ejemplo, si coloca
 * age en la posición del nombre y  name en la posición de age, entonces tendrá la edad en una variable
 * llamada name, y el nombre en la variable llamada age.
 *
 * data class Dog(
 * val name: String,
 * val age: Int
 * )
 *
 * fun main() {
 * val dog = Dog("Pluto", 7)
 * val (age, name) = dog
 * println(age) // Pluto
 * println(name) // 7
 * }
 *
 * Para evitar esto, compruebe siempre si las variables están asignadas a las posiciones correctas
 * de los parámetros del constructor.
 *
 * Por último, las clases de datos tienen un método copy, que permite crear la copia de un objeto.
 * También le permite especificar qué modificaciones desea introducir en un objeto.
 *
 * data class Dog(
 * val name: String,
 * val age: Int
 * )
 *
 * fun main() {
 * println(dog.copy()) // Dog(name=Pluto, age=7)
 * println(dog.copy(age = 8)) // Dog(name=Pluto, age=8)
 * println(dog.copy(name = "Neptune")) // Dog(name=Neptune, age=7)
 * }
 *
 * Utilice modificadores de datos para las clases que se utilizan para representar un conjunto de
 * datos. Esas clases son bastante comunes en la programación.
 *
 * >>> CLASE PAIR Y TRIPLE
 * En algunos casos, debe representar un par de valores. Para eso, una de las clases que puede usar
 * es la clase Pair. Esta es una clase de datos con dos propiedades del constructor, y no es necesario
 * definirla, ya que se distribuye con Kotlin.
 * Otra clase de este tipo se llama Triple, y se utiliza para mantener tres valores en las propiedades
 * first, second y third.
 *  */

//EJEMPLO DE CLASE SIN "DATA"
class Dog2(
    val name: String
)

//EJEMPLO DE CLASE CON "DATA"
data class Dog3(
    val name: String
)

//EJEMPLO DE CLASE CON "DATA" DESESTRUCTURANDO
data class Dog4(
    val name: String,
    val age: Int
)

//EJEMPLO USO DE COPY
data class Dog5(
    val name: String,
    val age: Int
)




fun main() {
    //EJEMPLO DE CLASE SIN "DATA"
    println("EJEMPLO DE CLASE SIN DATA")
    val pluto1 = Dog2("Pluto")
    val pluto2 = Dog2("Pluto")
    println(pluto1 == pluto2) // false
    println(pluto1 == pluto1) // true
    println(pluto1) //Dog2@6fadae5d
    println("Dog: $pluto1") //Dog: Dog2@6fadae5d
    println()

    //EJEMPLO DE CLASE CON "DATA"
    println("EJEMPLO DE CLASE CON DATA")
    val pluto3 = Dog3("Pluto")
    val pluto4 = Dog3("Pluto")
    val rex = Dog3("Rex")
    println(pluto3 == pluto4) // true
    println(pluto3 == pluto3) // true
    println(pluto3 == rex) // false
    println(pluto3) // Dog3(name=Pluto)
    println("Dog3: $pluto3") // Dog3: Dog3(name=Pluto)
    println()

    //EJEMPLO DE CLASE CON "DATA" DESESTRUCTURANDO
    println("EJEMPLO DE CLASE CON DATA DESESTRUCTURANDO")
    val dog = Dog4("Pluto", 7)
    val (name, age) = dog //DESESTRUCTURANDO
    println(name) // Pluto
    println(age) // 7
    println()

    //EJEMPLO USO DE COPY
    println("EJEMPLO USO DE COPY")
    val dog1 = Dog5("Pluto", 7)
    println(dog1.copy()) // Dog5(name=Pluto, age=7)
    println(dog1.copy(age = 8)) // Dog5(name=Pluto, age=8)
    println(dog1.copy(name = "Neptune")) // Dog5(name=Neptune, age=7)
    println()

    //EJEMPLO CLASE PAIR
    println("EJEMPLO CLASE PAIR: En el ejemplo siguiente, se crea un par con valores de tipo Double \n" +
            "y Char. Puede leer esos valores utilizando las propiedades first y second. También puede \n" +
            "desestructurar esto en variables. ")
    val pair = Pair(1.0, 'A')
    println(pair.first) // 1.0
    println(pair.second) // A
    val (number, letter) = pair // Desestruturando
    println(number) // 1.0
    println(letter) // A
    println()

    println("También hay otra forma de crear un par: colocando la función to entre dos valores. El \n" +
            "resultado es un par de esos dos valores. ")
    val pair2 = 1.0 to 'A'
    println(pair2.first) // 1.0
    println(pair2.second) // A
    val (number2, letter2) = pair2 //Desestructurando
    println(number2) // 1.0
    println(letter2) // A
    println()

    //EJEMPLO CLASE TRIPLE
    println("EJEMPLO CLASE TRIPLE: Otra clase de este tipo se llama Triple, y se utiliza para \n" +
            "mantener tres valores en las propiedades first, second y third. ")
    val pair3 = Triple(1F, "ABC", true)
    println(pair3.first) // 1.0
    println(pair3.second) // ABC
    println(pair3.third) // true
    val (number3, letters, boolean) = pair3 //Desestructurando
    println(number3) // 1.0
    println(letters) // ABC
    println(boolean) // true
}

