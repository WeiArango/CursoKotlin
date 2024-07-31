/**OPEREACIONES LÓGICAS
 *
 * BOOLEANOS:
 *
 * EL OPERADOR 'and' (&&):
 * >>>Ejemplo N°1: Para que entienda los operadores lógicos, imagine una conversación entre un niño llamado Steven y
 * su madre. Él quiere jugar en la computadora, así que le pregunta a su madre, y ella responde:
 * “Puedes jugar en la computadora, pero solo si haces la tarea y limpias tu habitación”. En
 * programación, puede expresar esta condición usando un operador and (&&) entre valores lógicos.
 *
 * >>>Ejemplo N°2: Imaginemos otro escenario que involucre a Steven. Digamos que a Steven le gustaría tener un
 * cachorro. Esto significa que necesita tiempo para cuidar al cachorro porque será responsable de
 * él. En este escenario, Steven tiene tiempo, pero no es lo suficientemente responsable como para
 * tener un cachorro, por lo que la respuesta debería ser no.
 *
 * >>>Ejemplo N°3: Imagine que debe verificar un valor porcentual. Un porcentaje tiene que ser
 * cualquier valor de 0 a 100 inclusive.
 *
 * EL OPERADOR 'or' (||)
 * >>>Ejemplo N°1: Volvamos a Steven. No terminó su tarea, por lo que no pudo jugar en la
 * computadora. Pero entonces su amigo lo llama y lo invita a ir al cine. Cuando le pregunta a su
 * madre si puede ir, ella responde: “Puedes ir si limpias el auto o cortas el césped”.
 *
 * >>>Ejemplo N°2: Digamos que Steven puede comer chocolate si se porta bien o limpia su habitación.
 *
 * >>>Ejemplo N°3: Otro ejemplo es que el número de un porcentaje es incorrecto si es menor que 0 o
 * mayor que 100.
 *
 * EL OPERADOR 'not' (!):
 * El último operador lógico importante es not (!), y niega el valor booleano. Entonces, convierte
 * true en false y false en true.
 *>>>Ejemplo N°1: El operador not a menudo forma parte de expresiones lógicas más complejas. Por
 * ejemplo, cuando la mamá de Steven dijo: “Puedes jugar si apruebas el examen de matemáticas y
 * limpias tu habitación”.
 *
 * */

fun main() {
    operadorAnd()
    operadorOr()
    operadorNot()
}

fun operadorAnd() {
    println("El operador 'and' arroja un true siempre y cuando ambas afirmaciones sean true, si alguna \n" +
            "de las afirmaciones es false, entonces el operador and arrojaría un false")
    println("Ejemplo N°1")
    var finishedHomework = false // or true
    var cleanedRoom = true // or false
    var canPlayGames = finishedHomework && cleanedRoom
    println("Can children play games?: $canPlayGames")
    finishedHomework = true
    cleanedRoom = true
    canPlayGames = finishedHomework && cleanedRoom
    println("Can children play games?: $canPlayGames")

    println("Ejemplo N°2")
    var haveTime = true // or true
    var isResponsible = false // or false
    var canHavePuppy = haveTime && isResponsible
    println("Can children have puppy?: $canHavePuppy")
    haveTime = true
    isResponsible = true
    canHavePuppy = haveTime && isResponsible
    println("Can children have puppy?: $canHavePuppy")

    println("Ejemplo N°3")
    var percent = 50
    var correct = percent >= 0 && percent <= 100
    println("Percent is correct?: $correct")
    println("**************************************************************************************")
}

fun operadorOr() {
    println("El operador 'or' arroja un true siempre y cuando almenos una de las afirmaciones sea true, \n" +
            "si ambas afirmaciones son false, entonces el operador or arrojaría un false")
    println("Ejemplo N°1")
    var carCleaned = true
    var grassCut = false
    var canGo = carCleaned || grassCut
    println("Can children go?: $canGo")
    carCleaned = false
    grassCut = false
    canGo = carCleaned || grassCut
    println("Can children go?: $canGo")

    println("Ejemplo N°2")
    var behavedWell = false
    var cleanedRoom = false
    var canEatChocolate = behavedWell || cleanedRoom
    println("Can children eat chocolate?: $canEatChocolate")
    behavedWell = true
    cleanedRoom = true
    canEatChocolate = behavedWell || cleanedRoom
    println("Can children eat chocolate?: $canEatChocolate")

    println("Ejemplo N° 3")
    var percent = -50
    var incorrect = percent < 0 || percent > 100
    println("percent is incorrect?: $incorrect")
    println("**************************************************************************************")
}

fun operadorNot() {
    println("El operador not niega el valor booleanoo")
    println(!true) // false
    println(!false) // true

    val isAmazing = true
    println(!isAmazing) // false

    val isBoring = false
    println(!isBoring) // true

    println("El operador not también puede convertir un número negativo en un núemero positivo y \n" +
            "visceversa")
    var number = -150
    println("Cambio de un número negativo por uno positivo: ${-number}")
    number = 150
    println("Cambio de un número positivo por uno negativo: ${-number}")
    println("En programación se puede utilizar la negación varias veces en una sóla línea de comando")
    println(!true) // false
    println(!!true) // true
    println(!!!true) // false
    println(!!!!true) // true
    println(!!!!!true) // false

    println("Ejemplo N°1")
    val failedMathExam = true
    val roomCleaned = true
    val canPlayGames = !(failedMathExam && roomCleaned)
    println("Can play games the children?: $canPlayGames") // false
}