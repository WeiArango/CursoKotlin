/**EXCEPCIONES
 * Una excepción es un acontecimiento no deseado que interrumpe el flujo estándar de su programa.
 * Las excepciones se producen cuando intenta realizar una operación ilegal. Exploremos algunos
 * ejemplos. No es posible dividir un número por cero. Si lo hace, el programa se detendrá con una
 * excepción aritmética. En el informe de esta excepción, aparecerán el nombre de esta excepción
 * que es ArithmeticException, y también un mensaje que le informa lo que ha salido mal.
 * También afirma que intentó dividir un número por cero. En otra línea aparece dónde se produjo la
 * excepción para que pueda ver que esta excepción tuvo lugar en esta función en la línea.
 * En todos estos casos, el programa no podrá continuar cuando se produzca una excepción, entonces
 * ¿acaso esto significa que cualquier parte incorrecta en el código rompe el programa?
 * Definitivamente no. Puedo identificar una excepción y, luego, detenerla. Para capturar una excepción,
 * utilizo algo llamado el bloque try-catch. De esta manera, voy a capturar cualquier throwable.
 * Se llama throwable, ya que a veces se denomina a una excepción como una instrucción throw, y
 * luego imprimo caught. Dentro de catch, puedo especificar qué tipo de excepción quisiera capturar.
 * Se supone que la excepción aquí debería ser una excepción de formato de número. Puedo especificar
 * que quiero esperar concretamente esa excepción usando un tipo en el bloque catch. Sin embargo,
 * si especifica que espera otro tipo de excepción a la que realmente se produce, no se captará,
 * por lo que si espera la ArithmeticException, y la excepción arrojada es NumberFormatException,
 * que no es ArithmeticException, no se capturará. Esto significa que el programa está roto de nuevo.
 * Aquí se produce una excepción y no es capturada por try-catch porque catch no captura la excepción
 * que se produjo, por lo que la excepción pasa y rompe el programa. También podemos tener varios
 * bloques catch para cubrir múltiples casos de excepción, por lo que en el caso de ArithmeticException,
 * Voy a imprimir Caught ArithmeticException, y en el caso de NumberFormatException, voy a imprimir
 * Caught NumberFormatException. Las excepciones tienen una jerarquía y la que está más arriba es
 * throwable, que es un supertipo de todas las excepciones, así que si capturo throwable, capturo todo.
 * TIPOS DE EXCEPCIONES:
 * Throwable >>> Captura todo
 * NumberFormatException >>> Captura excepciones de formato de número
 * ArithmeticException >>> Captura excepciones de aritmética
 * IllegalArgumentException >>> Captura excepciones de argumentos no válidos
 * IllegalStateException >>> Captura excepciones de estado ilegal
 *
 * BLOQUE FINALLY
 * Dentro de try, también puede usar un bloque llamado finally. Se utiliza para especificar un
 * bloque de código que siempre se debe invocar, incluso si se produce una excepción. Eche un vistazo
 * al código a someFunction donde se produce una excepción.Termina la función, y termina el cuerpo
 * de try. Como no hay un bloque catch, esta excepción no se capturará y finalizará la función “main”.
 * Sin embargo, está el bloque finally que se invoca incluso si se produce una excepción.
 *
 * */

//EJEMPLOS

fun someFunction() {
        throw Throwable("Some error")
    println("Will not be printed")
}

fun main() {
    try {
        val result = 10 / 0
        val num: Int = "ABC".toInt()
    } catch (t: ArithmeticException) {
        println("ArithmeticException")
    } catch (exception: NumberFormatException) {
        println("NumberFormatException")
        exception.printStackTrace()//Para mostrar donde esta la excepción
    } catch (t: Throwable) {
        println("Caught")
    }
    println("Done")
    println()

    //EJEMPLO FINALLY
    println("Función someFunction para especificar un bloque de código que siempre se debe invocar, \n" +
            "incluso si se produce una excepción ")
    try {
        someFunction()
        println("Will not be printed")
            } finally {
        println("Finally block was called") // Finally block was called
            }
    println("Will not be printed")

}