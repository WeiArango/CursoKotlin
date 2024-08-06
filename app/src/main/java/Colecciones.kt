/**COLECCIONES
 * Hasta ahora, ha aprendido a usar las variables para mantener los valores individuales como cadenas
 * o enteros. Esto resulta útil, pero no siempre es suficiente cuando se codifica en Kotlin. Digamos
 * que implementa una tienda en línea y no sabe de antemano cuántos productos ofrecerá, además de que e
 * stas ofertas también pueden cambiar con el tiempo. Mantener estas ofertas en numerosas variables
 * no será conveniente. Esto significa que necesita un objeto que represente una colección de elementos.
 * Ese objeto se llama colección.
 * Cuando escribe código para crear una tienda en línea, necesita una colección de productos,
 * una colección de vendedores, una colección de compradores y una colección de diferentes variantes
 * de productos. También puede tener una colección de las formas de pago permitidas y una colección
 * de las formas de entrega que se permiten. En Kotlin, además, hay algunos tipos de colecciones que
 * puede utilizar, como una lista, que es uno de los tipos de colecciones más comunes en Kotlin.
 * Una forma estándar de crear una lista en Kotlin es usando la función listOf y, luego, especificando
 * sus valores usando los argumentos.
 * Kotlin le proporciona muchas formas de almacenar información. Decidir qué información y cómo se
 * va utilizar depende del proyecto que se esté desarrollando. Por ejemplo, si desea guardar el
 * inventario de su tienda en línea, podría almacenar el producto y el precio en una lista.
 * Esto le permitirá agregar o quitar productos. Si la tienda tiene una determinada cantidad de
 * productos que no cambiarán, podría guardarlos en una lista. Una vez escrita la lista,
 * quedan establecidos los elementos que hay en ella.
 *
 * Hay 3 tipos de colecciones en Kotlin:
 * Lista
 * Conjunto
 * Mapa
 *
 * LISTA:
 * La lista es el tipo más básico de una colección y representa una lista ordenada de elementos.
 * Una característica útil de una lista es que puede utilizar los mismos valores y elementos varias veces.
 * Puede utilizar una lista, por ejemplo, para representar productos en un carrito de compra en línea
 * o para ver las opciones de envío. El orden de los elementos en la lista se mantiene, lo que
 * significa que si define su lista de métodos de envío en una configuración, estos elementos se
 * mostrarán en el mismo orden en la ventana de pago en línea
 *
 * CONJUNTO:
 * Un conjunto es una lista desordenada de elementos sin duplicados. La buena noticia es que normalmente
 * puede encontrar elementos en un conjunto más rápido que en una lista. Los conjuntos se utilizan
 * cuando no desea conservar el orden de la lista. Tampoco aceptan duplicados de valores. Digamos,
 * por ejemplo, que desea almacenar una lista de nombres de perros. El orden en que se guardaron no
 * importa, pero no quiere que el mismo nombre aparezca por duplicado.
 *
 * MAPA:
 * Un mapa, por otro lado, es diferente de una lista o de un conjunto. El motivo es que no mantiene
 * una colección de elementos, sino una colección de pares de clave-valor. Las claves son únicas y
 * cada uno de estos mapas de claves es exactamente un valor. Estos valores pueden estar duplicados.
 * Los mapas también son útiles para almacenar conexiones lógicas entre objetos, como el número de
 * identificación de un empleado, que es único y es una clave perfecta, y su posición como valor al
 * que se asigna la clave
 *
 * Las colecciones en Kotlin son de solo lectura de forma predeterminada, lo que significa que no
 * hay un mecanismo directo para cambiar el contenido que está dentro de una lista.
 * Para ello se puede utilizar el concepto de lista mutable (lectura y escritura) y lista inmutable
 * (solo lectura).
 *
 * */

//EJEMPLO DE LISTAS
fun main() {
    var lista = listOf(
        "Cerveza",
        "Carne",
        "Heavy Metal"
    )
    println("Que se necesita para un buen asado?: $lista")
    println()

    println("También se puede iterar una lista por medio de un bucle for:")
    for (elemento in lista) {
        println(elemento)
    }
    println()

    println("También puedo saber cuantos elementos tiene esta lista con la función size:")
    println("Esta lista tiene ${lista.size} elementos")
    println()

    println("Puedo agregar y eliminar elementos de la lista con las funciones add y remove sin \n" +
            "necesidad de crear una nueva lista ni modificar la existente:")
    val nuevaLista = lista - "Carne" + "Chorizos"
    println(nuevaLista)
    println()

    //EJEMPLO DE CONJUNTOS
    println("Ejemplo de conjuntos")
    var conjunto = setOf(
        "Cerveza",
        "Carne",
        "Heavy Metal",
        "Ron"
    )
    println("Que se necesita para un buen asado?: $conjunto")
    println()

    //EJEMPLO DE MAPAS
    println("Ejemplo de mapas")
    var mapas = mapOf(
        "Cerveza" to 1,
        "Carne" to 2,
        "Heavy Metal" to 3,
        "Ron" to 4
    )
    println("Que se necesita para un buen asado?: $mapas")
    println()

    //EJEMPLO DE LISTAS MUTABLES
    println("Ejemplo de listas mutables")
    var listaMutable = mutableListOf(
        "Cerveza",
        "Carne",
        "Heavy Metal",
        "Ron"
    )
    listaMutable.add("Chorizos")
    listaMutable.remove("Carne")
    println("Que se necesita para un buen asado?: $listaMutable")
    println()

    //EJEMPLO DE LISTAS INMUTABLES
    println("Ejemplo de listas inmutables")
    var listaInmutable = listOf(
        "Cerveza",
        "Carne",
        "Heavy Metal",
    )
    println("Que se necesita para un buen asado?: $listaInmutable")
    println()
}
