/**USO DE FUNCIONES EN KOTLIN*/
/**Una Función es un contenedor de operaciones. Por ejemplo si yo creo dos variables tipo Int para
sumar, simplemente me creo una función llamada sumar y hago esa operación allí adentro. Las
funciones son impresindibles, no se puede trabajar sin ellas.
"Una función se inicializa así: fun + nombre de la función(){}"
>>>USO DE VARIABLES
>>>>VARIABLES DE CLASE: son aquellas que se usan fuera de las funciones y que se pueden utilizar
en cualquier función o cualquier parte del código. Es decir que son variables globales
>>>>VARIABLES FUNCIONALES: son aquellas que se usan dentro de una función y que sólo pueden ser
utilizadas dentro de esa función y en ninguna otra parte del código u otra función

FUNCIONES LOCALES
Así como se pueden definir variables locales, también se pueden definir funciones locales. Así es
como se llaman las funciones definidas dentro de otras funciones. Al igual que las variables locales,
solo se pueden usar en el alcance de su definición. Por lo tanto, en la misma función y después de
su definición. Las funciones de nivel superior no tienen esas limitaciones, sino que se pueden usar
en todas partes, incluso en funciones definidas anteriormente en el archivo.

FUNCIONES CON PARÁMETROS
Un parámetro es una variable con nombre que se define como parte de una función
Cómo se usan los parámetros en la codificación? Especifica los parámetros entre paréntesis después
del nombre de la función. Parecen variables normales, pero sin la palabra clave val o var. Como
ejemplo de una función, puede definir el parámetro storeName del tipo string en una función llamada
goToStore. Esta variable se puede utilizar en el cuerpo de la función. Así que cuando declara o escribe
una función y usa un parámetro, cuando quiere llamar a esta función, debe indicar el parámetro.
El valor proporcionado para este parámetro se llama argumento
¿Cuál es la diferencia entre un parámetro y un argumento?
Cuando escribe o declara una función y especifica los parámetros que quiere que su función use,
debe proporcionar esos parámetros cuando llame a la función. Proporcionar el parámetro se conoce
como pasar un argumento.

FUNCIONES CON RETORNO
Las funciones también pueden devolver un valor. Para eso, una función debe declarar el tipo return
usando dos puntos y un tipo después del paréntesis de parámetros. Dentro de un cuerpo, esa función
también debería usar return para devolver el valor.

RECURSIVIDAD
Funciones Recursivas:
Supongamos que debe implementar una función que calcule el factorial de un número. El factorial,
en matemáticas, es el producto de todos los enteros positivos menores que o iguales a un entero
positivo dado. Por ejemplo, el factorial de 4 es 1∗2∗3∗4=241∗2∗3∗4=24
Una forma de implementar dicha función es usar un bucle for. Puede definir una variable llamada
accumulator, con un valor inicial de 1, que se utilizará para acumular todos los números. Luego,
para cada número desde el 1 hasta el número del que calcula el factorial, modificará el valor
multiplicándolo por el siguiente número. Después de eso, todo lo que debe hacer es devolver la
variable accumulator.

ARGUMENTOS PREDETERMINADOS
Una posibilidad muy útil de Kotlin es definir los argumentos predeterminados. Por ejemplo, imagine
que implementa una función para abrir un navegador web. Sin embargo, los navegadores se pueden abrir
en modo normal o de incógnito, por lo que, en la definición de la función, debe tener un parámetro
que especifique qué modo se debe utilizar.

FUNCIONES DE ARGUMENTOS CON NOMBRE
Cuando se llama a una función dentro de un paréntesis, se pueden especificar los argumentos según el
orden de los parámetros asociados. Esa es la forma predeterminada de llamar a una función, pero
también hay otra opción: para cada argumento, puede especificar explícitamente qué parámetro está
asociado. Para ello, introduzca nombres de parámetros y el signo igual delante de un parámetro. Al
hacerlo, no es necesario que los argumentos estén en el orden de los parámetros.
El motivo principal por el cual se deben usar argumentos con nombre es mejorar la legibilidad:
indica explícitamente cuál es el significado de un argumento cuando podría no ser obvio para la
persona que lee su código. El otro motivo por el cual se debe usar es cuando desea especificar
argumentos para parámetros en posiciones más alejadas sin especificar los argumentos de la posición
anterior. Por ejemplo, cuando llama cheer(who = "Learner"), especifica who sin especificar how.

 */


fun main() {
    sumaClase()
    restaClase()
    multiplicacionClase()
    divisionClase()
    sumaFuncional()
    restaFuncional()
    multiplicacionFuncional()
    divisionFuncional()

    //USO DE PARÁMETROS DE ENTRADA EN LAS FUNCIONES
    edadConParametros()//Se llama el parámetro ubicado en la función edad, pero si no ponemos el valor, trae el valor por defecto
    sumaConParametrosEntrada(20, 30)
    nameConParametrosEntrada("Ubeimar", " Bedoya")

    //USO DE PARÁMETROS DE SALIDA EN LAS FUNCIONES (SE DEBE USAR RETURN)
    println()
    println("MIREMOS COMO PODEMOS USAR FUNCIONES PASANDO PARÁMETROS DE SALIDA")
    val resultado = sumaParametrosSalida(10, 5)
    println(
        "Ejemplo del llamado de parámetros de salida con la función return: ${resultado}")
    val resultadoCool = sumaParametrosSalidaCool(20, 5)
    println(
        "Ejemplo del llamado de parámetros de salida con la función return, pero quitando las llaves" +
                " y el return: ${resultadoCool}")
    println()
    println("USO DE PARÁMETROS PARA FORMAR UNA ESTRELA")
    val height = 5
    for (i in 1..height) {
        printStars(i)
    }
    println()
    println("Ahora, puede extraer una función para dibujar todo el triángulo ascendente.")
    ascendingTriangle(5)
    println()
    println("Podría hacer lo mismo para definir el triángulo descendente. Además, al conectar ambas \n" +
            "funciones, puede imprimir un triángulo isósceles.")
    println("Ascending triangle:")
    ascendingTriangle2(5)
    println("Descending triangle:")
    descendingTriangle2(5)
    println("Isosceles triangle:")
    isoscelesTriangle(5)

    //FUNCIONES CON RETORNO
    println()
    println("FUNCIONES CON RETORNO")
    val area: Double = triangleArea(1.0, 2.0)
    println(area) // 1.0
    println(triangleArea(2.0, 2.0)) // 2.0
    println(triangleArea(5.0, 5.0)) // 12.5
    println(triangleArea(10.0, 20.0)) // 100.0
    println()
    println("Retornando el valor mas grande de dos argumentos")
    println(biggerOf(3, 1)) // 3
    println(biggerOf(10, 20)) // 20

    //EJERCICIO PRÁCTICO DE FUNCIONES PASANDO PARÁMETROS:
    var score = 0
    println()
    println("Solución ejercicio de funciones pasando dos parámetros y retornando un valor")
    println(score)
    score += getPoint(10, 1)
    println(score)
    score += getPoint(20, 2)
    println(score)
    score += getPoint(-10, 1)
    println(score)
    score += getPoint(5, 3)
    println(score)
    score += getPoint(-15, 2)
    println(score)

    //EJERCICIO RECURSIVIDAD (FACTORIAL DE UN NÚMERO X)
    println()
    println("Solución ejercicio recursividad. Ejemplo factorial de un número \n" +
            "${factorial(5)} \n" +
            "${factorial(6)} \n" +
            "${factorial(10)}")

    //EJEMPLO ARGUMENTOS PREDETERMINADOS
    println()
    println("Solución ejemplo funciones con argumentos predeterminado para una página web que se \n" +
            "abre en modo incógnito")
    openBrowser("website1.com")
    openBrowser("website2.com")
    openBrowser("website3.com", true)

    //EJEMPLO PARÁMETROS CON NOMBRE
    println()
    println("Solución ejemplo funciones con parámetros con nombre")
    cheer(how = "Hi ") // Hi World
    cheer(who = "Learner") // Hello, Learner
    cheer(how = "Hi ", who = "Learner") // Hi Learner
    cheer(who = "Learner", how = "Hi ") // Hi Learner



}

//EJEMPLO DE VARIABLES DE CLASE
val variableClase1 = 10
val variableClase2 = 20

fun sumaClase() {
    val sumaClase = variableClase1 + variableClase2
    println()
    println("MIREMOS USO DE VARIABLES DE CLASE")
    println("Resultado de una operación suma con dos variables de clase: ${sumaClase}")
}

fun restaClase() {
    val restaClase = variableClase1 - variableClase2
    println("Resultado de una operación resta con dos variables de clase: ${restaClase}")
}

fun multiplicacionClase() {
    val multiplicacionClase = variableClase1 * variableClase2
    println("Resultado de una operación multiplicacion con dos variables de clase: ${multiplicacionClase}")
}

fun divisionClase() {
    val divisionClase = variableClase2 / variableClase1
    println("Resultado de una operación division con dos variables de clase: ${divisionClase}")
}

//EJEMPLO DE VARIABLES FUNCIONALES
fun sumaFuncional() {
    val variableFuncional1 = 5.21F
    val variableFuncional2 = 2.34F
    val sumaFuncional = variableFuncional1 + variableFuncional2
    println()
    println("MIREMOS USO DE VARIABLES FUNCIONALES")
    println("Resultado de una operación suma con dos variables de función: ${sumaFuncional}")
}

fun restaFuncional() {
    val variableFuncional1 = 5.21F
    val variableFuncional2 = 2.34F
    val restaFuncional = variableFuncional1 - variableFuncional2
    println("Resultado de una operación resta con dos variables de función: ${restaFuncional}")
}

fun multiplicacionFuncional() {
    val variableFuncional1 = 5.21F
    val variableFuncional2 = 2.34F
    val multiplicacionFuncional = variableFuncional1 * variableFuncional2
    println("Resultado de una operación multiplicaion con dos variables de función: ${multiplicacionFuncional}")
}

fun divisionFuncional() {
    val variableFuncional1 = 5.21F
    val variableFuncional2 = 2.34F
    val divisionFuncional = variableFuncional1 / variableFuncional2
    println("Resultado de una operación division con dos variables de función: ${divisionFuncional}")
}

//EJEMPLO DE FUNCIONES PASANDO PARÁMETROS DE ENTRADA
//Podemos enviar un valor por defecto en la variable por si se nos pasa dar el valor en el main: pongamos 40
fun edadConParametros(currentEdad: Int = 40) {
    println()
    println("MIREMOS COMO PODEMOS USAR FUNCIONES PASANDO PARÁMETROS DE ENTRADA")
    println(
        "Ejemplo del llamado de parámetros de entrada desde el main, con una función llamada" +
                " edad: Hola tengo ${currentEdad} años"
    )
}

fun sumaConParametrosEntrada(primerNumero: Int, segundoNumero: Int) {
    println(
        "Ejemplo del llamado de parámetros de entrada desde el main, con una función llamada" +
                " sumaConParametrosEntrada: ${primerNumero + segundoNumero}"
    )
}

fun nameConParametrosEntrada(primerNombre: String, primerApellido: String) {
    println(
        "Ejemplo del llamado de parámetros de entrada desde el main, con una función llamada" +
                " nameConParametrosEntrada: ${primerNombre + primerApellido}"
    )
}

//EJEMPLO DE FUNCIONES PASANDO PARÁMETROS DE SALIDA
fun sumaParametrosSalida(primerNumero: Int, segundoNumero: Int):Int{
    return primerNumero - segundoNumero
    //Después de un return, no se debe usar un print porque no se va a leer
}

/*Podemos quitar las llaves y el return, se adiciona un = y aún así funcionaría la función de parámetros de salida, se utiliza
en funciones pequeñitas sin tanto código*/
fun sumaParametrosSalidaCool(primerNumero: Int, segundoNumero: Int):Int = primerNumero - segundoNumero
    //Después de un return, no se debe usar un print porque no se va a leer

//FUNCIONES CON PARÁMETROS
//Uso de funciones y parámeTros para imprimir una estrella
fun printStars(num: Int) {
    for (j in 1..num) {
        print("*")
    }
    println()
}

//Ahora, puede extraer una función para dibujar todo el triángulo ascendente.
fun printStars1(num: Int) {
    for (j in 1..num) {
        print("*")
    }
    println()
}

fun ascendingTriangle(height: Int) {
    for (i in 1..height) {
        printStars1(i)
    }
    println()
}

fun printStars2(num: Int) {
    for (j in 1..num) {
        print("*")
    }
    println()
}

fun ascendingTriangle2(height: Int) {
    for (stars in 1..height) {
        printStars2(stars)
    }
}

fun descendingTriangle2(height: Int) {
    for (stars in height downTo 1) {
        printStars2(stars)
    }
}

fun isoscelesTriangle(width: Int) {
    ascendingTriangle2(width - 1)
    descendingTriangle2(width)
}

//FUNCIONES CON RETORNO
/**Aquí hay una definición de triangleArea. Es una función que calcula el área de un triángulo con
 * un cierto ancho y alto. Su resultado es de tipo Double, por lo que puede colocar la llamada a una
 * función a la derecha de la asignación de valor. Una vez que esta función devuelve un valor, se
 * asigna a la variable y puede usarla más adelante.*/
fun triangleArea(width: Double, height: Double): Double {
    return width * height / 2
}

/**Implementemos ahora la función biggerOf para que de dos argumentos, devuelva el más grande.
 * Puede implementarlo usando una instrucción if-else con return en cada rama. Tenga en cuenta que
 * en este caso, especifica return dos veces: una para cada posible rama de condición.*/
fun biggerOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

//FUNCIONES DE UNA SÓLA EXPRESIÓN
/**NOTA: la expresión anterior también se puede reducir de las siguientes maneras
 * >>> fun biggerOf(a: Int, b: int): Int {
 *      if (a > b) {
 *          return a
 *      }
 *      return b
 *
 * >>> fun biggerOf(a: Int, b: int): Int {
 *          return if (a > b) a else b ESTO ES LO QUE LLAMARÍAMOS FUNCIONES DE UNA SÓLA EXPRESIÓN
 *      }
 *
 * >>> En Kotlin, hay una sintaxis especial para funciones de una sola expresión. En lugar de llaves
 * con el cuerpo, se utiliza el signo de igualdad, que especifica lo que se debe devolver.
 *      fun biggerOf(a: Int, b: int): Int = if (a > b) a else b
 *
 * Esa notación es más corta, pero realmente no la encontrará en el curso porque puede ser demasiado
 * complicada. Pero debe tener en cuenta que existen las funciones de una sola expresión porque son
 * populares en proyectos profesionales. Las funciones de una sola expresión no son para nada nuevas,
 * son solo una notación más simple para las funciones.
 * }*/

//EJERCICIO PRÁCTICO DE FUNCIONES PASANDO PARÁMETROS:
/**Los parámetros de la función y los valores devueltos son partes importantes de la programación.
 * Digamos que está desarrollando un juego y debe hacer un seguimiento del puntaje. A medida que
 * alguien juega, debe agregar puntos a su puntaje. El puntaje podría aumentar si el jugador recogiera
 * un objeto especial. En este ejercicio, creará una función simple que calcule el total de puntos
 * que se agregarán al puntaje. La función tendrá dos parámetros, uno para el número base de puntos
 * y otro para el valor de aumento. El valor de aumento se multiplicará por la cantidad base.*/
fun getPoint (basePoints: Int, boost: Int): Int {
    return basePoints * boost
}

//EJEMPLO RECURSIVIDAD
fun factorial(number: Int): Int {
    var accumulator = 1
    for (i in 1..number) {
        accumulator = accumulator * i
    }
    return accumulator
}

//EJEMPLO ARGUMENTOS PREDETERMINADOS
fun openBrowser (url: String, incognitoMode: Boolean = false) {
    println("Opening $url" + if (incognitoMode) " in incognito mode" else "")
}

//EJEMPLO PARÁMETROS CON NOMBRE
fun cheer(how: String = "Hello, ", who: String = "World") {
    println("$how $who")
}







