/**INSTRUCCIONES CONDICIONALES
 *
 * INSTRUCCIÓN IF-ELSE
 * Utilice la instrucción if para invocar un código condicional. En otras palabras, el código solo se
 * ejecutará si se cumple un predicado
 * El bloque else adicional se utiliza para proporcionar una alternativa para los casos en que no se
 * cumple un predicado.
 * A menudo, el predicado es una expresión en la que se comparan dos valores. Por ejemplo, si un
 * valor es menor o mayor que otro valor.
 * >>>Ejemplo N°1: Steven puede ir al cine si termina la tarea:
 *
 * USO DE IF-ELSE COMO EXPRECIONES
 * Se puede utilizar una instrucción if-else como expresión. En otras palabras, devolver un valor
 * que se puede almacenar en una variable. El valor devuelto es el que devuelve el bloque del cuerpo
 * elegido.
 * >>>Ejemplo N° 2: un predicado devuelve true, y se elige el primer cuerpo, por lo que se devuelve
 * 10.0
 *
 * USO DE IF-ELSE-IF
 * Al colocar un bloque if-else tras otro, se forma una estructura conocida como if-else-if. Es una
 * estructura que comprueba las condiciones una tras otra hasta encontrar la primera que se cumple,
 * y llama a su cuerpo. Si todas las condiciones devuelven false, se llama al bloque else.
 * >>>Ejemplo n°3: Si probability (probabilidad) es menor o igual a 40, solo se imprimirá Unlikely.
 * Si probability es superior a 40, pero menor o igual a 80, entonces solo se imprimirá Likely. Si
 * probability es superior a 80, pero menor o igual a 100, solo se imprimirá Yes. De lo contrario,
 * se imprimirá What?.
 * If-else-if es una estructura conocida en muchos lenguajes, pero no en Kotlin. Esto se debe a que
 * hay una mejor alternativa, llamada la declaración when, pero es bueno saber cómo usar if-else-if
 * en caso de que alguna vez la necesite.
 *
 *INSTRUCCIÓN WHEN
 * La instrucción when es una alternativa a if-else-if. En cada rama de la instrucción when, puede
 * especificar un predicado y un cuerpo. El cuerpo se ejecutará solo para el primer predicado que
 * devuelva true. Por lo tanto, funciona igual que if-else-if, pero se prefiere porque su sintaxis
 * es más adecuada para varias condiciones. Y gracias al hecho de que es una sola instrucción, Kotlin
 * puede ejecutar este código más rápido que verificar múltiples instrucciones if-else-if.
 * >>>Ejemplo N°1: si probability es menor o igual a 40, solo se imprimirá Unlikely. Si probability
 * es superior a 40, pero menor o igual a 80, solo se imprimirá Likely. Si probability es superior a
 * 80, pero menor o igual a 100, solo se imprimirá Yes. De lo contrario, se imprimirá What?. Si ejecuta
 * el código, debería ver Likely porque la probability inicial es 70, pero siéntase libre de cambiar
 * ste valor y ejecutar el código nuevamente.
 *
 * >>>Ejemplo N°2: Al igual que en una instrucción if, se deben usar llaves solo en los cuerpos con
 * más de una instrucción. Si solo hay una instrucción en un cuerpo, puede omitir las llaves.
 *
 * USAR WHEN COMO EXPRESIÓN
 * La instrucción when también se puede utilizar como expresión para producir un valor. La única
 * regla es que una instrucción when debe tener un bloque else para que tenga un valor para devolver
 * en caso de que no se elija ningún otro bloque.
 * >>>Ejemplo N°3: En el código siguiente, el valor text depende de la rama elegida por la expresión
 * when.
 *
 * USAR WHEN CON UN VALOR
 * También hay otra forma de la instrucción when. Si agrega un valor entre paréntesis después de la
 * palabra clave when, entonces en cada rama, Kotlin compara este valor con otros valores
 * >>>Ejemplo N°4: En el ejemplo siguiente, cuando number es 1, la instrucción when elige la rama
 * con un valor de 1 e imprime Missed hit. Cuando number es 2, 3, 4 o 5, se elige la segunda rama y
 * se imprime Hit with value {number value}. Cuando el valor es 6, se elige la última rama y se
 * imprime Critical hit.
 *
 * USO DE RANGOS EN INSTRUCCIONES WHEN
 * Se puede simplificar la expresión when gracias a la característica conocida como range check. En
 * algunas ramas, la condición puede ser comprobar si un valor está dentro de una colección o de un
 * rango.
 * >>>Ejemplo N°5: En el siguiente ejemplo, en lugar de 2, 3, 4, , se usó 2..5, por lo que en lugar
 * de proporcionar valores para comparar, comprueba si el valor está en un rango de valores de 2 a 5.
 * La sintaxis es la siguiente: comience con la palabra clave in y, luego, especifique una colección
 * o un rango que pudiera contener el valor o no
 *
 * EJERCICIO CON EL USO DE CONDICIONALES
 * La cafetería Little Lemon abre en varios horarios según el día de la semana, de acuerdo con la
 * siguiente tabla:
 *
 * Día        *    HORARIOS
 * Lunes      *    De 8 a. m. a 12 p. m. (8:00 - 12:00)
 * Martes     *    De 8 a. m. a 6 p. m. (8:00 - 18:00)
 * Miércoles  *    De 8 a. m. a 6 p. m. (8:00 - 18:00)
 * Jueves     *    De 8 a. m. a 6 p. m. (8:00 - 18:00)
 * Viernes    *    De 8 a. m. a 9 p. m. (8:00 - 21:00)
 * Sábado     *    De 9 a. m. a 4 p. m. (9:00 - 16:00)
 * Doming0    *    De 8 a. m. a 4 p. m. (8:00 - 16:00)
 *
 * Escribir un programa que, sobre la base del día de la semana que se trate, imprima el horario de
 * apertura.
 *
 * **/

fun main() {
    instruccionIfElse()
    instruccionWhen()
}

fun instruccionIfElse() {
    println("La instrucción 'if' solo se ejecutará si se cumple un predicado")
    println("Ejemplo N°1")
    val finishedHomework = true
    if (finishedHomework) {
        println("Steven can go to the cinema")
    } else {
        println("Steven can´t go to the cinema")
    }
    println()
    val i = 5
    if (i < 3) {
        println("Smaller")
    } else {
        println("Bigger")
    }
    println()

    println("Ejemplo N°2")
    val haveSomeExtraMoney = false
    val tip: Double =
        if (haveSomeExtraMoney) {
            10.0
        } else {
            0.0
        }
    println("Cuanto dinero extra tengo?: $tip")
    println()

    println(
        "Dentro de los cuerpos if-else, puede incluir más de una instrucción. El valor devuelto \n" +
                "por un cuerpo es la última expresión que tiene."
    )
    val haveExtraMoney = true
    val tip2: Double =
        if (haveExtraMoney) {
            println("Here you go")
            1.0 // this value is ignored, because it is not the last one
            5.0 // this value is ignored, because it is not the last one
            10.0 // this value is ignored, because it is not the last one
            20.0
        } else {
            println("Sorry, I am broke")
            0.0
        }
    println(tip2)
    println()

    println("Si solo tiene una expresión en el cuerpo, puede omitir las llaves.")
    val haveMoney = true
    val tip3: Double = if (haveMoney) 10.0 else 0.0
    println(tip3)
    println()

    println("Ejemplo N°3")
    println("Is it going to rain?")
    val probability = 39
    if (probability <= 40) {
        println("Unlikely")
    } else if (probability <= 80) {
        println("Likely")
    } else if (probability < 100) {
        println("Yes")
    } else {
        println("What?")
    }
    println()

    println("Ejemplo práctico sobre la seguridad de una contraseña")
    val password = "WEI#1234"
    val specialCharacters = "!@#$%^&*(),.?:{}|<>"

    if (password.isEmpty()) {
        println("Password cannot be empty")
    } else if (password.length < 7) {
        println("This password is quite short")
    } else if (!password[0].isUpperCase()) {
        println("The first letter of the password must be uppercase.")
    } else if (password.none { it in specialCharacters }) {
        println("Your password must have a special character")
    } else {
        println("Password is valid")
    }
    println()
}

fun instruccionWhen() {
    println("Uso de la instrucción when")
    println("Ejemplo N°1")
    println("Is it going to rain?")
    val probability1 = 90
    when {
        probability1 < 40 -> {
            println("Unlikely")
        }

        probability1 <= 80 -> {
            println("Likely")
        }

        probability1 < 100 -> {
            println("Yes")
        }

        else -> {
            println("What?")
        }
    }
    println()

    println("Ejemplo N°2")
    println("Is it going to rain?")
    val probability2 = 70
    when {
        probability2 < 40 -> println("Unlikely")
        probability2 <= 80 -> println("Likely")
        probability2 < 100 -> println("Yes")
        else -> println("What?")
    }
    println("Se pueden eliminar las llaves de cada condición para que el código sea mas corto")
    println()

    println("Ejemplo N°3")
    println("Is it going to rain?")
    val probability3 = 70
    val text = when {
        probability3 < 40 -> "Unlikely"
        probability3 <= 80 -> "Likely"
        probability3 < 100 -> "Yes"
        else -> "What?"
    }
    println(
        "Se pueden eliminar los println de cada condición para que el código sea mas conciso \n" +
                "y corto: $text"
    )
    println()

    println("Ejemplo N°4")
    val number = 1 // or 2, 3, 4, 5, 6
    when (number) {
        1 -> {
            println("Missed hit")
        }

        2, 3, 4, 5 -> {
            println("Hit with value $number")
        }

        6 -> {
            println("Critical hit")
        }
    }
    println()

    val number1 = 5 // or 2, 3, 4, 5, 6
    val text1 = when (number1) {
        1 -> "Missed hit"
        2, 3, 4, 5 -> "Hit with value $number"
        6 -> "Critical hit"
        else -> "Unsupported value"
    }
    println("Eliminando los print y las llaves y anexando el bloque else: $text1")
    println()

    println("Ejemplo N°5")
    val number2 = 1 // or 2, 3, 4, 5, 6
    val text2 = when (number2) {
        1 -> "Missed hit"
        in 2..5 -> "Hit with value $number2"
        6 -> "Critical hit"
        else -> "Unsupported value"
    }
    println("Utilizando la característica range check: $text2")
    println()

    println("EJERCICIOS CON EL USO DE CONDICIONALES")
    val weekDay = "wednesday"
    val hour = 12
    val isOpen = when (weekDay) {
        "monday" -> hour in 8..12
        "tuesday" -> hour in 8..18
        "wednesday" -> hour in 8..18
        "thursday" -> hour in 8..18
        "friday" -> hour in 8..21
        "saturday" -> hour in 9..16
        "sunday" -> hour in 8..16
        else -> "Undefined"
    }
    if (isOpen == true) {
        println("Little Lemon is open now")
    } else {
        println("Little Lemon is closed now")
    }
    println(weekDay.toUpperCase() + " " + isOpen)
    println()

    println("Veamos un ejemplo práctico de la seguridad de una contraseña utilizando When")
    val pass = "wei$123"
    val characterSpecial = "!@#$%^&*(),.?:{}|<>"
    val textToShow =
        when {
            pass.isEmpty() -> "Password cannot be empty"
            pass.length < 7 -> "This password is quite short"
            !pass[0].isUpperCase() -> "The first letter of the password must be uppercase."
            pass.none { it in characterSpecial } -> "Your password must have a special character"
            else -> "Password is valid"
        }
    println(
        "Acá se muestra el mensaje condicional o resultado almacenado en la variable textToShow, \n" +
                "además podemos eliminar las llaves y el println para que el código sea más conciso y \n" +
                "corto"
    )
    println(textToShow)
}
