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
 * mostrarán en el mismo orden en la ventana de pago en línea.
 * List es un tipo que representa listas de solo lectura. Si desea crear una lista mutable, utilice
 * mutableListOf y el tipo de resultado es MutableList. Con las listas mutables, puede usar métodos
 * como add o remove para agregar o quitar un determinado elemento.
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
    var lista: List<String> = listOf(
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
    val nuevaLista1 = lista - "Carne" + "Chorizos"
    val nuevaLista2 = (listOf("Chorizos", "Whisky") + lista - "Carne")
    println("Puedo saber si una lista está vacía con la función isEmpty: nuevaLista2; ${nuevaLista2.isEmpty()}")
    println(nuevaLista1)
    println(nuevaLista2)
    println("Para mostrar el elemento que ocupa una posición dentro de la lista: ${nuevaLista1[0]}")
    println("Para mostrar el elemento que ocupa una posición dentro de la lista: ${nuevaLista1[1]}")
    println("Para mostrar el elemento que ocupa una posición dentro de la lista: ${nuevaLista1[2]}")
    println("Puede comprobar si un conjunto contiene un determinado elemento. Para ello, puede usar\n" +
            " el método contains o el operador in. Ambas opciones devuelven true si en la lista hay\n" +
            " un elemento igual al que está buscando, y devuelve false en caso contrario.")
    println(nuevaLista1.contains("Cerveza"))
    println(nuevaLista1.contains("Cocacola"))
    println("Cerveza" in nuevaLista1)
    println("Cocacola" in nuevaLista1)
    println()

    var listaInt: List<Int> = listOf(
        1,
        2,
        3,
        4,
        5
    )
    println("Puedo sumar los elementos de una lista con la función sum, ${listaInt.sum()}")
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
    println("Los elementos que ya están en un conjunto no se agregan; su incorporación simplemente se ignora:")
    val set = setOf("Cerveza", "Carne", "Heavy Metal", "Ron")
    println(set + "Carne")
    println(set + setOf("Carne", "Heavy Metal"))

    val list = listOf("Cerveza", "Carne", "Heavy Metal", "Ron")
    println(list + "Carne")
    println(list + listOf("Carne", "Ron"))
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

    val capitals = mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")
    println("Algunas capitales en en el mundo: $capitals")

    println()
    println("El tipo de resultado es Map<K, V>, donde K es el tipo de una clave y V es el tipo de un\n" +
            " valor. En el caso de las capitales, tanto las claves como los valores son de tipo String,\n" +
            " por lo que el tipo de mapa es Map<String, String>. Sin embargo, no es necesario que\n" +
            " sea del mismo tipo.")
    val alphabet: Map<Char, Int> = mapOf('A' to 1, 'B' to 2, 'C' to 3)
    println(alphabet)
    println()

    println("Para buscar un valor de una clave utilice [] o get:")
    println(alphabet['A'])
    println(alphabet.get('B'))
    println(alphabet['D'])//Si el elemento no existe en el mapa, devuelve null
    println()

    println("Para agregar elementos a un mapa, utilice [] o put:")
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 + ('C' to "Celina")
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex, B=Bob, C=Celina}
    val map3 = mapOf('D' to "Daniel", 'E' to "Ellen")
    val map4 = map2 + map3
    println(map3)
    println(map4)
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
    println("También se puede cambiar un elemento con el uso de corchetes así:")
    listaMutable[3] = "Whisky"
    println(listaMutable)
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

    val m = mapOf('a' to "Alex", 'a' to "Anna")
    println("Los mapas no permiten duplicar las claves: $m")
    println()



    //EJERCICIO PRÁCTICO DE COLECCIONES
    /**PASO 2:Aquí creará una lista de comentarios. La publicación puede no tener comentarios o tener muchos
     * comentarios. Dentro de la función main: */
    val comments: List<Comment> = listOf(
        Comment(5241, "Nice code"),
        Comment(6624, "Like it"),
        Comment(5224, "What’s going on?"),
        Comment(9001, "Check out my website"),
        Comment(8818, "Hello everyone :)")
    )

    /**PASO 3: Cree un conjunto de identificaciones de usuarios bloqueados utilizando setOf() con
     * los valores 5224 y 9001 y almacénelo en una variable denominada blockedUserIds: */
    val blockedUserIds: Set<Int> = setOf(5224, 9001)

    /**PASO 4: Cree una relación entre el usuario y los autores de los comentarios usando un mapa.*/
    val userIdToRelation: Map<Int, String> = mapOf(
        5241 to "friend",
        6624 to "close friend"
    )

    /**PASO 5: Usando una instrucción if, compruebe si la userId no está en el conjunto de blockedUserIds.
     * Esto se definió en el paso 3. Primero debe iterar en la lista comments (que creó en el paso 2)
     * usando un bucle for.*/
    for (comment in comments) {
        if (comment.userId !in blockedUserIds) {
            /**PASO 6: Encuentre la relación entre el usuario actual y el autor del comentario. Usando una
             * instrucción if-else, debe modificar el código del paso 5 con una sólida instrucción if:
             * Nota: Podemos usar el operador Elvis ?: . Sería el mismo resultado que si usara una instrucción
             * if-else.*/
            val relation = userIdToRelation[comment.userId] ?: "unknown"

            /**PASO 7: Muestre el comentario en formato Comment {comment message} from {relation} pasando la
             * cadena con formato al método println(). Puede usar las plantillas de cadena según sea necesario
             * para concatenar el commentMessage evaluado y la relation usando el signo de dólar $ como se
             * muestra a continuación:*/
            println("Comment ${comment.message} from $relation")
        }
    }
}

//EJERCICIO PRÁCTICO DE COLECCIONES
/**PASO 1: Se usa una clase llamada Comment con 2 parámetros para almacenar un comentario que los
autores pueden agregar a una publicación. */
class Comment(
    val userId: Int,
    val message: String
)






