/**CLASES DE ANOTACIÓN
 * El último tipo especial de clase se llama annotation. Las anotaciones son clases utilizadas para
 * describir el código. Por ejemplo, supongamos que su función produce una excepción. Para informar
 * a otros codificadores que puedan usar nuestra clase sobre esa posibilidad, puede agregar Throws
 * de anotación con una clase de excepción.
 * Es importante entender que una anotación por sí sola no hace absolutamente nada. Sin embargo, las
 * anotaciones suelen definirse mediante bibliotecas que analizan el código y cambian su comportamiento
 * en función de una anotación. Algunas anotaciones también son utilizadas por Kotlin. Por ejemplo,
 * supongamos que definió una clase con ciertos métodos, pero con el tiempo decide introducir un método
 * alternativo para realizar la misma operación. El problema es que el método anterior aún es utilizado
 * por otras partes del programa. ¿Qué debe hacer? La respuesta es usar la anotación Deprecated antes
 * del método anterior. Dicha anotación es interpretada por el compilador de Kotlin e IntelliJ, y da
 * como resultado que los usos de funciones anteriores aparezcan tachados y que se muestre una advertencia
 * con el mensaje especificado en la anotación. Este es un buen mecanismo para informar a los usuarios
 * de su clase que el método anterior ya no debe usarse y con qué deben reemplazarlo. Cuando haya
 * pasado suficiente tiempo (normalmente un período de al menos un año es aceptable), puede suponer
 * que todos los usuarios ajustaron su código para dejar de usar el método obsoleto y finalmente
 * puede eliminarlo.
 * */

//EJEMPLO DE CLASES DE ANOTACIÓN
@Throws(ArithmeticException::class)
fun divide(a: Int, b: Int): Int {
    return a / b
}

@Throws(IllegalArgumentException::class)
fun findClusters(number: Int) {
    if (number < 1) throw IllegalArgumentException("The number of clusters cannot be smaller than 1, it is $number")
    // ...
}

annotation class MyAnnotation(val someDescription: String)

@MyAnnotation("Class annotation")
class A(
    @MyAnnotation("Constructor property annotation")
val a: Int
) {
     @MyAnnotation("Method annotation")
    fun b() {}
}

