/**CLASES-OBJETOS-TIPOS-MÉTODOS
 *
 * CLASES
 * Una clase es como una plantilla que define el aspecto de un objeto y cómo se puede utilizar.
 * En Kotlin, la usamos para crear objetos. Especifica cómo se deben crear los objetos y de qué
 * métodos y propiedades se componen. También define la relación del objeto con otras clases
 * Para definir una clase, usará la palabra clave class y, luego, especificará un nombre.
 * No necesita nada más para una clase vacía. El nombre que especifique debe comenzar con
 * una letra mayúscula y solo debería usar letras para nombrar las clases. Si desea especificar un
 * nombre con varias palabras, inicie cada palabra nueva con mayúscula.
 *
 *
 * OBJETOS
 * Un objeto, por otro lado, es una instancia específica que crea usando una clase. Para crear un
 * objeto utilizando una clase, debe llamar a un constructor, que es el nombre de la clase y un
 * paréntesis. Puede observar que esto es igual que llamar a una función, pero en este caso se
 * devuelve el objeto. Un objeto String no puede cambiar por lo que sus métodos se utilizan para
 * producir una nueva cadena que es una versión modificada de la anterior
 *
 * TIPOS
 * Un tipo define qué objeto puede aceptar la variable. Un tipo representa una categoría de objetos.
 * Un ejemplo de un tipo es Int. Int es un tipo que representa a todos los números enteros.
 * Number es un tipo que representa a todos los números. Tanto los números enteros como los reales
 * son de tipo number. Puede especificar el tipo de variable, y esto lo hace explícito, de modo que
 * esta variable contiene una instancia creada de la clase.
 *
 * RELACIÓN ENTRE CLASES-OBJETOS-TIPOS
 * Exploremos esta relación entre clases, objetos y tipos en mayor detalle usando ejemplos.
 * Hay una clase llamada int que es una plantilla para los números enteros. Un entero como el 42 es
 * un objeto, por lo que es una instancia de la clase int. Veamos ahora cómo se aplica la misma
 * información a un objeto personalizado. Puede utilizar la clase personalizada llamada employee
 * para crear un objeto. También hace un tipo llamado employee que se puede utilizar para especificar
 * que una variable solo contiene objetos creados usando la clase employee.
 *
 * MÉTODOS
 * Son funciones específicas de una determinada clase. Se definen dentro del cuerpo de la clase,
 * entre llaves. Lucen como funciones normales. Primero va la palabra clave fun, luego el nombre
 * del método(), luego las llaves para el cuerpo dopnde imprimo el método. Para llamar al método
 * necesito tener un objeto de esta clase. Una especialidad de los métodos es que tienen acceso
 * directo a todas las propiedades de una clase. Los métodos son funciones y como sucede con las
 * funciones normales, pueden tener parámetros y valores de resultado específico.
 * Otro atributo especial de los métodos es que puede llamar implicitamente a otros métodos de la
 * misma clase
 * Los métodos son bastante útilies porque ayudan a encapsular el comportamiento típico de un
 * objeto
 *
 * RECEPTOR
 * Cuando se llama a un método, el objeto de su clase se pasa a su cuerpo. Se llama receptor. Se
 * puede acceder utilizando la palabra clave this, también conocida como referencia del receptor.
 * Por lo tanto, si desea hacer referencia a un objeto utilizado para llamar a un método dentro de
 * este método, utilice la palabra clave this.
 *
 * EJERCICIO PRÁCTICO
 * Imagine que consiguió un trabajo en una empresa de desarrollo de juegos. Su primera tarea es
 * crear un pequeño fragmento de código que contenga los datos del jugador de uno de sus juegos.
 * Los requisitos de su programa son los siguientes:
 *     Almacenar y mostrar el nombre completo del jugador
 *     Almacenar, manipular y mostrar los datos de puntaje del jugador
 *     Almacenar y mostrar el mejor puntaje personal (los jugadores obtienen un puntaje por cada
 *     nivel jugado)
 *     Mostrar el nombre del jugador ganador y su puntaje total y su mejor puntaje de nivel
 * Una vez completado todo el código, en la consola aparecerá el resultado final que simula el
 * puntaje del final del juego. Tendrá dos líneas cada uno con texto y el puntaje del jugador.
 * (Este es solo un ejemplo del resultado, ingresará los puntajes del nivel más adelante para
 * producir un resultado final).
 * */

fun main() {
    //EJEMPLO EMPLEADO
    println("Ejemplo clásico de como declarar una clase-objeto-tipo")
    val empleado1 = Empleado("Wei", "Veterinario")
    val empleado2 = Empleado("Bedoya", "Desempleado")
    println(empleado1.nombre + " " + empleado1.cargo)
    println(empleado2.nombre + " " + empleado2.cargo)
    //Cambiemos el cargo del empleado2
    empleado2.cargo = "Empleado"
    println(empleado2.nombre + " " + empleado2.cargo)

    //EJEMPLO DEPORTISTA
    println()
    println("Otra forma de especificar las propiedades de un objeto")
    val deportista1 = Deportista("Falcao", "Futbolista")
    val deportista2 = Deportista("Oneal", "Bascketball")
    println(deportista1.nombre1 + " " + deportista1.deporte + " " + deportista1.edad1)
    println(deportista2.nombre1 + " " + deportista2.deporte + " " + deportista2.edad2)

    //EJEMPLO DEL USO DE MÉTODOS CON BARISTA (PARA LLAMAR A LOS MÉTODOS, NECESITO TENER UN OBJETO
    //DE ESA CLASE)
    println()
    println("Ejemplo del uso de Métodos en las Clases")
    val barista = Barista("WeiBedoya")//Este es el objeto
    println(barista.name)//Acceso a la propiedad de la clase
    barista.makeCoffe()//Llamada al método makeCoffe

    //EJEMPLO DEL USO DE MÉTODOS CON ACCESO DIRECTO A LAS PROPIEDADES DE UNA CLASE
    println()
    println("Ejemplo del uso de métodos con acceso a las propiedades de su clase")
    barista.makeCoffe1()

    //EJEMPLO DEL USO DE MÉTODOS QUE PUEDEN TENER PARÁMETROS Y VALORES DE RESULTADO ESPECÍFICOS
    println()
    println("Ejemplo del uso de métodos que pueden tener parámetros y valores de resultado específico")
    val coffe: Coffe = barista.makeCoffe2("Latte", 1)

    //EJEMPLO DEL USO DE MÉTODOS CON LLAMADAS IMPLICITAMENTE A OTROS MÉTODOS DE LA MISMA CLASE
    println()
    println("Ejemplo del uso de métodos con llamadas a otros métodos de la misma clase, en este \n" +
            "ejemplo tenemos dos métodos makeCoffe3 y cheerAndMakeCoffe3. En este último método \n" +
            "llamamos makeCoffe3 implicitamente, luego llamamos en fun main a cheerAndMakeCoffe3")
    barista.cheerAndMakeCoffe3("Latte", 1)

    //EJEMPLO DE COMO PODER TENER UNA VERSIÓN MODIFICADA DE UN OBJETO TIPO STRING
    println()
    println("Un objeto String no puede cambiar por lo que sus métodos se utilizan para\n" +
            "producir una nueva cadena que es una versión modificada de la anterior")
    val text = "Este es un objeto string que no se puede modificar"
    println("Esta es la versión modificada del objeto text: ${text.uppercase()} ${text.lowercase()}\n" +
            "${text.replace("modificar", "cambiar")}")

    //EJEMPLO SOBRE EL USO DE LA PALABRA CLAVE THIS
    println()
    println("Primero veamos un ejemplo sin el uso de this")
    val dog = Dog("Rex")
    feed(dog)

    println()
    println("Ahora veamos un ejemplo con el uso de this")
    val dog1 = Dog1("Rex")
    dog1.feed()

    //SOLUCIÓN EJERCICIO PRÁCTICO VIDEOJUEGO
    println()
    println("Esta es la solución al ejercicio práctico sobre el puntaje recibido por un videojuego")
    // Inicializar objetos del jugador
    val P1 = Player("Nicola", "Tesla")
    val P2 = Player("Thomas", "Edison")
    // Crear variables de trabajo
    val scoring = Scores()  // Instancia de la clase Scores para permitir el acceso a la función checkBest
    var lvlScore = 0 // Variable para simular la puntuación del nivel del jugador

    // Level 1
    lvlScore = 12 // Insertar valores simulados para la puntuación de nivel
    P1.totalScore += lvlScore; //Use el operador combinado (+=) para agregar lvlScore a totalScore
    // Proporcione los parámetros para la función checkBest accediendo a las propiedades del jugador
    P1.personalBestScore = scoring.checkBest(P1.personalBestScore, lvlScore);

    lvlScore = 44
    P2.totalScore += lvlScore;
    P2.personalBestScore = scoring.checkBest(P2.personalBestScore, lvlScore);

    // Level 2
    lvlScore = 56 // Insertar valores simulados para la puntuación de nivel
    P1.totalScore += lvlScore; //Use el operador combinado (+=) para agregar lvlScore a totalScore
    // Proporcione los parámetros para la función checkBest accediendo a las propiedades del jugador
    P1.personalBestScore = scoring.checkBest(P1.personalBestScore, lvlScore);

    lvlScore = 78
    P2.totalScore += lvlScore;
    P2.personalBestScore = scoring.checkBest(P2.personalBestScore, lvlScore);

    // Level 3
    lvlScore = 99 // Insertar valores simulados para la puntuación de nivel
    P1.totalScore += lvlScore; //Use el operador combinado (+=) para agregar lvlScore a totalScore
    // Proporcione los parámetros para la función checkBest accediendo a las propiedades del jugador
    P1.personalBestScore = scoring.checkBest(P1.personalBestScore, lvlScore);

    lvlScore = 100
    P2.totalScore += lvlScore;
    P2.personalBestScore = scoring.checkBest(P2.personalBestScore, lvlScore);

    // Verificación condicional usando una declaración if para determinar el ganador
    if(P1.totalScore > P2.totalScore) {
    // Acceder a las propiedades del jugador para construir la cadena a imprimir
        println("The winner is "+ P1.fullName() +  " with a Score of  "+P1.totalScore);
        println("Personal Best Score is = " +P1.personalBestScore);
    } else {
        println("The winner is "+ P2.fullName() + " with a Score of "+P2.totalScore);
        println("Personal Best Score is = " +P2.personalBestScore);
    }
}

/**Una clase se declara como parte de la definición de un constructor (un constructor es una función
que se utiliza para crear un objeto): class + nombre de la clase + (variable + nombre: tipo de
objeto) >>> este sería el objeto*/
class Empleado(
    val nombre: String,
    var cargo: String
)

/**Una segunda forma de especificar las propiedades de un objeto es hacerlo dentro del cuerpo de una
clase. Primero especifico un cuerpo con llaves y dentro de ellas puedo especificar la propiedad, pero
esa propiedad debe tener un valor especificado, no se puede tener una propiedad sin un valor*/
class Deportista(
    val nombre1: String,
    var deporte: String
) {
    var edad1: Int = 32   //Esta es otra forma de especificar las propiedades de una clase
    var edad2: Int = 45   //En este  caso siempre se debe inicializar la propiedad con un valor
}

//EJEMPLO DEL USO DE MÉTODOS
class Barista(//Esta es la clase
    val name: String//Esta es propiedad de la clase Barista
) {
    fun makeCoffe() {//Este es el método
        println("Making coffe")
    }

    //EJEMPLO DEL USO DE MÉTODOS CON ACCESO DIRECTO A LAS PROPIEDADES DE UNA CLASE
    fun makeCoffe1() {
        println("$name makes coffe")//Acceso a la propiedad name
    }

    //EJEMPLO DEL USO DE MÉTODOS QUE PUEDEN TENER PARÁMETROS Y VALORES DE RESULTADO ESPECÍFICOS
    fun makeCoffe2(type: String, size: Int): Coffe {//Método con parámetros y valores
        println("$name makes coffe $type and size $size")
        return Coffe(type, size)//Retornamos los parámetros y valores dentro del Método
    }//Ahora creamos otra clase llamada Coffe con type y size para representar a Coffe


    //EJEMPLO DEL USO DE MÉTODOS CON LLAMADAS IMPLICITAMENTE A OTROS MÉTODOS DE LA MISMA CLASE
    fun makeCoffe3(type: String, size: Int): Coffe {
        println("$name makes coffe $type and size $size")
        return Coffe(type, size)
    }
    fun cheerAndMakeCoffe3(type: String, size: Int) {
        print("Hello" + " ")
        makeCoffe3(type, size)//Llamado implicito de otro método de la misma clase
    }
}

class Coffe(
    val type: String,
    val size: Int
)

//EJEMPLO SOBRE EL USO DE LA PALABRA CLAVE THIS
class Dog(val name: String) {
    var hunger = 62
}
fun feed(dog: Dog) {
    println("Feeding ${dog.name}")
    dog.hunger = 0
}
//Ahora con el uso de this
class Dog1(val name: String) {
    var hunger = 62
    fun feed() {
        println("Feeding ${this.name}")
        this.hunger = 0
    }
}

//EJERCICIO PRÁCTICO
//Almacenar y mostrar el nombre completo del jugador
class Player(
    var name: String,
    var surName: String
) {
    var totalScore = 0 //Se agregan propiedades a la clase Player
    var personalBestScore = 0
    fun fullName(): String {//Se agrega el método a la clase Player
        return name +" "+surName;
    }
}

// Clase de puntuaciones y método checkBest
class Scores()//Se crea la clase Score y crear una función para verificar si el puntaje del nivel
// recién completado es mejor que el mejor puntaje personal existente.
{
    fun checkBest(bestScore:Int, currentScore:Int): Int//Se agrega el método para la clase Score
    {
        if(bestScore < currentScore)
        {
            return currentScore;
        }
        return bestScore;
    }

}






