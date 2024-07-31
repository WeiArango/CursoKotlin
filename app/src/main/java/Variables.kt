/**USO DE VARIABLES EN KOTLIN*/
/**Existen variables (var) y valores (val) la diferencia es que cuando se crea o isntancia (Instanciar es cuando se crea una referencia) una variable
se puede modificar, pero cuando se crea o se instancia un valor no lo puedes volver a modificar.
Tipos de variables:

>>>VAL
Este tipo de variable tipo valor (val) no permiten ser modificadas una vez han sido declaradas, es decir que val es una constante

>>>VAR
Este tipo de variables tipo var si permiten ser modificadas una vez han sido declaradas, es decir que var si son variables

--NUMÉRICAS
INT (-2.147.483.647 a 2.147.483.647)
val age: int = 40 (con esta sintaxis escribimos el tipo de variable INT en este caso)
val age = 40 (con esta sintaxis, kotlin puede deducir el tipo de variable, pero no siempre)

LONG (-9.223.372.036.854.775.807 a 9.223.372.036.854.775.807 ). Se puede agregar L después de un
número para especificar que esa variable es de tipo Long (10L).

FLOAT
Este tipo de variables soportan decimales

DOUBLE
Son variables similares a float, a diferencia que soportan hasta 14 decimales y no es necesario colocar
D al final del

****************************************************************************************************

--ALFANUMÉRICAS
Son variables que contienen otros caracteres además de los números

CHAR
Esta es una variable que sólo soporta un caracter, es una variable muy chiquita. El caracter se debe
colocar entre comillas simples ''

STRING
Esta variable acepta lo que sea, el tamaño que quieras. Debe ir en comillas dobles ""

****************************************************************************************************

--BOOLEANAS
Son variables que sólo devuelven dos valores: true o false

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

--ANY
Any es un tipo de datos que incluye todos los demás tipos. Por lo tanto, string, int y Boolean son
todos subtipos de any. Eso significa que si define una variable llamada userInputData con el tipo
any, puede asignarle cualquier valor que haya aprendido hasta ahora.
Por ejemplo, si define una variable x con el tipo any, puede asignarle cualquier valor que haya aprendido hasta ahora.

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

SISTEMA UNICODE
En programación todos los caracteres están representados por números. Esto se debe a que una
computadora no ve las letras, sino solo el código binario, que está compuesto por ceros y unos. Luego,
se creó una tabla especial que asigna a cada carácter un número único. Esta tabla llamada Unicode es,
en esencia, universalmente aceptada en los lenguajes de programación. Y, en su forma básica, admite
144,697 caracteres diferentes. Por ejemplo el carácter A es el código 65. Para poder ver el código de
un caracter en Kotlin  se le asigna .code al caracter
 */

//NOTA: LAS VARIABLES NO TIENEN QUE ESTAR DENTRO DE UN MÉTODO fun main, pueden estar por fuera
fun main(){ //Esto es una función. Se debe tener en cuenta que el main es el ejecutable
    //Con este código fun main() podemos ejectuar pequeñas líneas de código
    print("Con print podemos mostrar en consola las líneas de código dando click a play. Luego con println() generamos saltos de linea")
    println()
    println("---------------------VARIABLES NUMÉRICAS-----------------------")
    println("-----------------------------INT-------------------------------")
    val int = 40
    val int1 = 40
    print("Especificando el tipo de variable: $int")
    println()
    print("Sin especificar el tipo de variable: $int1")
    println()
    println("---------------------------------------------------------------")
    println("--------------------------LONG---------------------------------")
    val long = 986978987890045677
    var long1 = 5L
    val long2 = 1_234_567
    println("long imprime hasta 18 cifras: $long")
    println("Se añade L al final de un número para especificar el tipo de variable Long: $long1")
    long1 = 10L
    println(long1)
    println("$long2 colocando guiones bajos en cada cientos, miles, millones, etc de un número mas" +
            " largo mejora su legibilidad")
    println()
    println("---------------------------------------------------------------")
    println("---------------------------FLOAT-------------------------------")
    val float = 5.847361F
    print("La variable float acepta hasta 6 decimales, se debe colocar F al final del número: ${float}")
    println()
    println("---------------------------------------------------------------")
    println("------------------------DOUBLE---------------------------------")
    val double: Double = 3.475398574609273
    print("La variable Double soporta hasta 14 decimales, no es necesario colocar D al final del número: ${double}")
    println()
    println("---------------------VARIABLES ALFANUMÉRICAS-------------------")
    println("------------------------------CHAR-----------------------------")
    val char: Char = 'w'
    val char1: Char = '1'
    val char2: Char = '#'
    print("La variable char sólo acepta un caracter, cualquier cosa, debe ir en '' ${char}, ${char1}, ${char2}")
    println()
    println("---------------------------------------------------------------")
    println("-----------------------------STRING----------------------------")
    val string = "Hola me llamo Wei, Cel 3008886725, email: wei.bedoya@hotmail.com \n"
    print("Las variables tipo string, van en comillas dobles y aceptan cualquier caracter y tamaño: \n" +
            "${string}")
    var s1 = "Hello"
    s1 += " world"
    println("Utilizando += para concatenar valores de una misma variable: $s1")
    println()
    println("Sistema Unicode")
    var unicode = 'A'
    println("A = ${unicode.code}")
    unicode = 'a'
    println("a = ${unicode.code}")
    unicode = 'W'
    println("W = ${unicode.code}")
    unicode = 'w'
    println("w = ${unicode.code}")
    println()
    val usoDeLength = "Uso de Length"
    println("Para verificar la extensión de una cadena se utiliza .length: ${usoDeLength.length}")
    println()
    val busquedaDeCadenas = "ParaBuscarCadenas"
    var encuentraLaCadena = busquedaDeCadenas.startsWith("Para")
    println("Se utiliza startsWidth para verificar si la cadena comienza con x caracteres y arroja un " +
            "valor booleano: $encuentraLaCadena")
    encuentraLaCadena = busquedaDeCadenas.startsWith("Cadenas")
    println(encuentraLaCadena)
    encuentraLaCadena = busquedaDeCadenas.endsWith("denas")
    println("Se utiliza endsWith para verificar si la cadena termina con x caracter y arroja un " +
            "valor booleano: $encuentraLaCadena")
    encuentraLaCadena = busquedaDeCadenas.endsWith("cad")
    println(encuentraLaCadena)
    println()
    println("Para mostrar el primer caracter")
    val caracter = "Hola mundo"
    var resultadoCaracter = caracter.first()
    println("Para mostrar el primer caracter se utiliza .first: $resultadoCaracter")
    resultadoCaracter = caracter.last()
    println("Para mostrar el último caracter se utiliza .last: $resultadoCaracter")
    println()
    println("Para saber si la cadena es igual a (x) y arroja un valor booleano: " +
            "${caracter.equals("Hola mundo")} ")
    println("Para saber si la cadena es igual a (x) y arroja un valor booleano: " +
            "${caracter.equals("Hola maldito mundo")} ")
    println("Para convertir la cadena a mayusculas se utiliza .uppercase(): ${caracter.uppercase()}")
    println("Para convertir la cadena a minusculas se utiliza .lowercase(): ${caracter.lowercase()}")

    println()
    println("------------------------BOOLEANAS------------------------------")
    println("--------------------------BOLEAN-------------------------------")
    val boleanTrue = true
    val boleanFalse = false
    print("Las variables Booleanas sólo aceptan dos valores false and true: ${boleanTrue}, ${boleanFalse}")
    println()
    println("---------------------------------------------------------------")
    println("---------------------VARIABLES TIPO VAR------------------------")
    var stringVar = "Variable tipo string que vamos a modificar después"
    print("Variable sin modificar: ${stringVar}")
    println()
    stringVar = "Acá podemos ver que la variable stringVar fué modificada, demostrando que las var si se pueden" +
            " modificar una vez que han sido declaradas, a diferencia de las val"
    print("Variable stringVar modificada: ${stringVar}")
    println()
    println("---------------------------------------------------------------")
    println("-----------------VAMOS A TRABAJAR CON VARIABLES----------------")
    println("---------------------OPERACIONES ARITMÉTICAS-------------------")
    var numero1 = 1984
    var numero2 = 521.9F
    println("Suma de dos números: ${numero1} + ${numero2} = ${numero1 + numero2}")
    println("Restas de dos números: ${numero1} - ${numero2} = ${numero1 - numero2}")
    println("Multiplicación de dos números: ${numero1} * ${numero2} = ${numero1 * numero2}")
    println("División de dos números: ${numero1} / ${numero2} = ${numero1 / numero2}")
    numero2 = 521.0F
    println("Operación llamada remainder (resto):")
    println("Módulo de dos números enteros (Sólo funciona con número enteros): ${numero1} % ${numero2} = " +
            "${numero1 % numero2}")
    println()
    numero1 = 20000
    numero2 = 2500.7F
    println("Ahora veamos resultados con variables modificadas")
    println("Suma de dos números enteros: ${numero1} + ${numero2} = ${numero1 + numero2}")
    println("Restas de dos números enteros: ${numero1} - ${numero2} = ${numero1 - numero2}")
    println("Multiplicación de dos números enteros: ${numero1} * ${numero2} = ${numero1 * numero2}")
    println("División de dos números enteros: ${numero1} / ${numero2} = ${numero1 / numero2}")
    println()
    println("Ahora podemos almacenar los resultados en una nueva variable")
    val resultadoSuma = numero1 + numero2
    println("Resultado almacenado en la variable resultadoSuma: ${numero1} + ${numero2} = ${resultadoSuma}")
    val resultadoDivision = numero1 / numero2
    println("Resultado almacenado en la variable resultadoDivision: ${numero1} / ${numero2} = ${resultadoDivision}")
    println()
    println("Podemos realizar un cambio en el tipo de variable, por ejemplo cambiar un Float por un Int. Se" +
            " realiza colocando delante del nombre de la variable .toInt() o .toFloat()")
    val resultadoMultiplicacion = numero1 * numero2.toInt()
    println("Resultado de la multiplicación de dos números un entero y un float, realizando un cambio" +
            " de variable Float por Int: ${numero1} * ${numero2.toInt()} = ${resultadoMultiplicacion}")
    val resultadoResta = numero1.toFloat() - numero2
    println("Resultado de la resta de dos números un entero y un float, realizando un cambio" +
            " de variable Int por Float: ${numero1.toFloat()} * ${numero2} = ${resultadoResta}")
    println()
    println("Podemos realizar cambios en variables tipo String por tipo Int de la siguiente forma")
    var stringEjemplo1 = "12"
    var stringEjemplo2 = "34"
    val resultadoStrings = stringEjemplo1 + stringEjemplo2
    val resultadoStringsCambioVariable = stringEjemplo1.toInt() + stringEjemplo2.toInt()
    println("Veamos que sumando estas stringEjemplo1 + stringEjemplo2, el resultado será una concatenación:" +
            " ${stringEjemplo1} + ${stringEjemplo2} = ${resultadoStrings}")
    println("Pero sumando estas stringEjemplo1 + stringEjemplo2, hacemos el cambio de variable y el" +
            " resultado será de una suma de dos números reales: ${stringEjemplo1.toInt()} + ${stringEjemplo2.toInt()} = " +
            " $resultadoStringsCambioVariable")
    println("Mas ejemplos de cambio de variables:")
    val i: Int = 10
    val l: Long = i.toLong()
    val d1: Double = i.toDouble()
    val d2: Double = l.toDouble()
    println(i)
    println(l)
    println(d1) // 10.0
    println(d2) // 10.0
    println()
    println("Veamos un ejemplo con el tipo de variable any")
    var x: Any = "ABC"
    println(x) // ABC
    x = 123
    println(x) // 123
    x = true
    println(x) // true
    println("Obervamos que al utilizar el tipo de variable any, podemos cambiar el valor de la " +
            "variable inicial x por cualquier tipo de variable ya sea INT, BOLEAN, etc ")
    println("Veamos que al dividir dos valores enteros, siempre el resultado será un número entero, " +
            "para mostrar decimales en el resultado se debe cambiar uno de los valores a Double o Float")
    val a = 5
    val b = 2
    println(a / b) // 2
    println(a.toDouble() / b) // 2.5 Se debe cambiar una de las variables a Double o Float para mostrar los decimales
    println("La precedencia operacional es un concepto matemático que hace referencia a la secuencia\n" +
            "en la que se evalúa un cálculo. Se respeta la precedencia operativa en todas las \n" +
            "operaciones matemáticas de Kotlin. Por ejemplo, 1 más 2 veces 3 es 7, no 9, porque la \n" +
            "multiplicación siempre se realiza antes de la suma")
    println(1 + 2 * 3)
    println((1 + 2) * 3)
    println()
    println("Asignaciones aumentadas: El valor de las variables definidas con var se puede cambiar")
    var f = 10
    println(f) // 10
    f = 20
    println(f) // 20
    println("Esto se usa a menudo para sumar o restar algo del valor \n" +
            "Dado que aplicar sumas o restas a un valor es una operación común, Kotlin tiene un \n" +
            "soporte especial para eso. \n" +
            "    a += b es una alternativa a a = a + b \n" +
            "    a -= b es una alternativa a a = a - b \n" +
            "    a *= b es una alternativa a a = a * b \n" +
            "    a /= b es una alternativa a a = a / b \n" +
            "    a %= b es una alternativa a a = a % b")
    var g = 10
    println(g) // 10
    g += 10
    println(g) // 20
    g += 10
    println(g) // 30
    println()
    println("Operación de prefijo y postfijo")
    println("En Kotlin, hay algunas maneras diferentes de sumar o restar 1 Por ejemplo:")
    var postfijo = 5
    val eq = 6 + postfijo++
    println("Suma de postfijo + eq= ${eq}")
    println("Ahora veamos que el valor de postfijo cambió a 6 debido a que se le sumó 1 (postfijo++), \n" +
            "luego eq pasó a ser 11. Por lo tanto 11 + 6 = 17: ${postfijo + eq}")
    println()
    println("Ahora veamos prefijo")
    var prefijo = 5
    val equ = 6 + ++prefijo
    println("Suma de prefijo + equ= ${equ}")
    println("Ahora veamos que el valor de prefijo cambió a 6 antes de realizar la operación debido a \n" +
            "que se le sumó 1 (++prefijo), luego equ pasó a ser 12. Por lo tanto 12 + 6 = 18: ${prefijo + equ}")
    println()
    println("Lo mismo sucede si utiliza operaciones de postfijo y prefijo en la resta (a-- y --a) .")
    println()
}
