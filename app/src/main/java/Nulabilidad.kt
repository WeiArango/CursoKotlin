/**NULABILIDAD
 * Digamos que quiere hacer algo nuevo en su jardín, sabe que quiere plantar algo, pero no está
 * seguro de qué planta. Necesita una maceta para cuando finalmente la consiga. Así que, en esencia,
 * la planta no existe, pero tiene el espacio para ella. La planta es null. Para especificar una
 * variable sin un valor utilizo el objeto null para rellenar el espacio.  *
 * Ahora exploremos cómo se implementa este concepto al comenzar con el almacenamiento de un nombre
 * de usuario. Digamos que tiene una aplicación y desea permitir que los usuarios completen con su
 * nombre. Decide mantener el nombre en una variable llamada name. Los nombres de usuario serán de
 * tipo cadena como Alex, por ejemplo. Sin embargo, ¿qué valor debe usarse antes de que un usuario
 * especifique un nombre? En otras palabras, ¿qué marcador de posición debe usarse cuando no se ha
 * especificado ningún valor? La respuesta estándar a esa pregunta en programación es null.
 * Null es un valor que indica una falta de valor. Así que si quiere decir que no hay ningún valor
 * de cadena aquí, debe usar null. Pero en Kotlin, no puede simplemente usar null en cualquier lugar,
 * sino que tiene que hacer un tipo que admita valores null. Lo que eso significa es que debe
 * construir un tipo que permita un valor que admita valores null, y para ello, debe agregar un
 * signo de interrogación después del tipo. String? es un tipo especial que indica que el valor puede
 * ser null o una cadena. String? acepta ambos valores, mientras que una cadena normal solo acepta
 * una cadena. Lo mismo sucede con todos los demás tipos. Si desea tener un entero que admita
 * valores null, debe agregar un signo de interrogación después de Int, y si quiere un carácter que
 * admita valores null, entonces debe agregar un signo de interrogación después de char.
 * Lo mismo sucede con los tipos de clases. Supongamos que tiene el nombre de clase user que tiene
 * el valor name, no puede ser null de forma predeterminada, sino que tiene que lograr que admita
 * valores null. Los tipos que admiten un valor null también se pueden usar como parámetros o como
 * tipos de resultados.
 * Si tiene una función que espera user, entonces no aceptará un valor null. Pero si convierte sus
 * parámetros para que admitan un valor null, se aceptará null. Con el tipo result funciona de manera
 * similar. Puede especificar un tipo result que admita valores null para que su resultado pueda ser
 * null. Entonces aquí puedo devolver Null.
 * También puedo convertir un parámetro class para que admita valores null para que el usuario sea
 * null en vez de un nombre. De manera predeterminada, cuando crea un usuario, no puede usar null.
 * Sin embargo, si usa un tipo que admite valores null aquí, entonces el usuario puede ser null en
 * lugar de tener un nombre, lo que indica que el usuario no tiene un nombre específico. Como se
 * demostró, los tipos que admiten valores null se pueden usar en todas partes, pero deben usarse
 * explícitamente. Debe indicar explícitamente que un tipo particular admite valores null para
 * que acepte valores de este tipo; puede hacerlo agregando un signo de pregunta después del tipo
 * para que admita un valor null. Es muy conveniente que Kotlin especifique claramente lo que puede
 * y lo que no puede ser null.
 *
 * LLAMADA SEGURA
 * Otra forma de evitar el error es usar una llamada segura. *
 * La llamada segura es cuando se utiliza?. en lugar de . entre un objeto y su función o propiedad.
 * Una llamada segura llama al lado derecho si el lado izquierdo no es nulo. De lo contrario, no hace
 * nada y devuelve null.
 *
 * ASERCIÓN NO NULO
 * La otra opción se llama aserción no nulo. Para esta uso dos signos de exclamación después de un
 * valor que admite valores null. La aserción no nulo es una opción no segura porque arroja una
 * excepción cuando un valor es null. Rompe el programa produciendo una excepción cuando su lado
 * izquierdo es null, y por eso generalmente se evita esta opción. Preferimos usar opciones más
 * seguras. Solo uso una aserción no nulo cuando estoy absolutamente seguro de que un valor no puede
 * ser nulo.
 * */

//EJEMPLO DE NULABILIDAD
var name: String? = null
var i: Int? = null
var c: Char? = null

class User(val name: String?)
var user: User? = null

fun getUser(user: User?): User? {
    return null
}

//EJERCICIO DE NULABILIDAD
/**Ejercicio: Practicar la gestión de la nulabilidad
Resumen
La nulabilidad es el concepto de programación donde a una variable le falta algún valor. En Kotlin,
puede usar null para indicar que una variable no tiene valor. En este ejercicio, practicará cómo
gestionar los valores que admiten null y evitar excepciones del puntero nulo, o NPE.
Para ello, se pueden adoptar algunos enfoques diferentes, tales como, comprobar valores nulos en una
condición, utilizar llamadas seguras, el operador Elvis o el operador de aserción.
Este ejercicio se concentra en estos dos enfoques
Operador Elvis
Operador de aserción

Escenario
Digamos que está ayudando al Departamento de TI de una escuela grande. La escuela tiene una lista de
estudiantes. Desea permitir que el personal busque y recupere la información de los estudiantes utilizando
sus nombres o sus identificaciones de estudiante. Para permitir dos frases de búsqueda necesita dos
funciones. Una es para localizar a un estudiante por la identificación y la otra es para buscarlo por
su nombre. Debe considerar que, en un proyecto del mundo real, la identificación del estudiante
normalmente es generada por el sistema para cada estudiante. Por lo tanto, puede depender en que sea
precisa y esté presente en cada estudiante almacenado. Por lo tanto, si el usuario busca a un estudiante
por su identificación y esa identificación no está presente, el programa debe devolver null o un error,
ya que esa identificación no coincide con ninguna de las identificaciones almacenadas. Si el usuario
busca a un estudiante por su nombre y este no figura, entonces el programa debe mostrar “The student
is not found”.

En los próximos pasos de este ejercicio, gestionará ambas posibilidades; por ahora solo tenga en
cuenta que debe devolver un error si el usuario ingresa una identificación que no está almacenada y
se devuelve una NPE. Aparece el mensaje “The student is not found” si el nombre que se ingresó no
coincide con ninguno de los nombres de los estudiantes guardados.

Resumen de los requisitos de este ejercicio:
Cree una clase Student con tres argumentos: Id como Int, name como String y grade como Double y,
luego, cree una lista de estudiantes.
Cree una función getStudentById que tenga un parámetro llamado id como Int, que devuelva a un estudiante.
Cree una función searchInStudents que tenga un parámetro llamado name como String, que devuelva a un
estudiante y que admita valores null.
Obtenga los valores del usuario que se buscará.
 * */

//SOLUCIÓN EJERCICIO DE NULABILIDAD
/**Paso 1: Crear una clase de estudiante y una lista de estudiantes*/
data class Student(val fullName: String, var id: Int, var grade: Double)

val students = listOf<Student>(
    Student("John", 223,140.0),
    Student("Mark", 548,120.0),
    Student("Natali", 342,150.0),
    Student("Sara", 781,130.0)
)

/**Paso 2:  Crear una función getStudentById
En este paso, se debe devolver el estudiante de la lista de estudiantes y, si no lo encuentra, el
programa debe devolver NPE. En el escenario, como se mencionó, si el usuario desea obtener un estudiante
por su identificación que no está presente en la lista, el programa debe mostrar un error. Para buscar
en la lista de student,puede usar el método de find (búsqueda).
Para que la búsqueda sea eficaz, debe usar el método find dentro de la función y si alguna identificación
de estudiante coincide con la identificación ingresada por el usuario, debe devolver ese estudiante.
Si no es así, debe mostrar un error como una excepción del puntero nulo utilizando el operador de aser
ción nulo !! ¿Por qué es ese el mejor método para usar en este caso? Porque si obtenemos null, el
operador de aserción puede mostrar una NPE.
La función find itera en la lista e it (in it==5) representa cada elemento individual. Tenga en
cuenta que la función find devuelve un valor que admite null, lo que significa que si queremos
encontrar 5 en listOfInt, myInt será null, ya que 5 no está en la lista. Como resultado, el programa
mostrará NPE debido al operador de aserción nulo !!.
Nota: En una situación real, el operador de aserción se usa normalmente con un valor solo cuando está
seguro de que el valor no será nulo en ningún punto del código.
La función debería ser así:*/
fun getStudentById(id:Int):Student{
    return  students.find { it.id==id }!!
}

/**Paso 3:  Crear una función searchInStudent
A continuación, debe crear una función denominada searchInStudents con un argumento string y devolver
Student que admita valores null. Kotlin utiliza su estructura de tipos para reconocer referencias de
variables que pueden contener un valor nulo.  En esta función, usará Student? Para crear un student
que admite valores null; en otras palabras, la función puede devolver null o student.
Después de eso, debe buscar en la lista de estudiantes el nombre usando la función find, y si el
nombre coincide con alguno de los nombres de estudiantes almacenados, la búsqueda devolverá esa
instancia de estudiante.
Nota: la instancia de student devuelta admite valores null, por lo tanto, se crea la función
searchInStudents con student que admite valores null para devolver usando Student?
Nota: Cuando se comparan dos cadenas, se recomienda utilizar la función lowercase() o uppercase(),
ya que en KOTLIN, “a” no es igual a “a”, distingue entre mayúsculas y minúsculas en una comparación
de cadenas, por lo tanto, primero se debe convertir usando minúsculas o mayúsculas en ambos lados
antes de la comparación.
Debería verse así:*/
fun searchInStudents(name:String):Student?{
    return students.find { it.fullName.lowercase()==name.lowercase()}
}

fun main() {
    getUser(null)

    println("Ejemplo de nulabilidad comprobando el valor nulo antes de acceder a la propiedad")
    var message: String? = "Hello World"
    message = null // Assign null to the variable
    if (message != null) {
        var length =
            message.length // Will not cause an error because you have checked that the value is not null
        print(length)
    } else {
        print(null)
    }

    //EJEMPLO DE LLAMADA SEGURA
    println()
    println("Ejemplo de Llamada segura")
    var message1: String? = "Hello World"
    print(message1?.length) //Will print 11
    message1 = null //Assign null to the variable
    print(message1?.length) //Will print null

    println()
    println("Del mismo modo, si llama a una función utilizando la llamada segura, no hará nada. \n" +
            "Actualicemos el ejemplo para llamar a la función String en mayúsculas.")
    var message2: String?= "Hello World"
    println(message2?.uppercase())
    println("****")
    message2 = null
    println(message2)
    println()

    //EJERCICIO DE NULABILIDAD
    /**Paso 4: Obtener los valores del usuario
    En este paso, debe tomar una entrada del usuario del flujo de entrada estándar que es el terminal
    (conocido como Run Window en IntelliJ). Para aceptar la entrada del usuario, utilice la función
    readln() que lee una línea del terminal y la devuelve como una String. Luego, puede convertir ese
    valor de la cadena en un número Int usando la función toInt() y, por último, asignarle una variable.
    Para que sea más fácil de usar, debe imprimir algo como “Please enter the ID of a student” y, luego,
    tomar la entrada.
    Debería verse así:*/
    println("Please, Enter the student's ID")
    val id = readln().toInt()
    println( getStudentById(id))
    println("Please, Enter the student's name")
    val name= readln()
    println(searchInStudents(name)?:"the student is not found")
}
