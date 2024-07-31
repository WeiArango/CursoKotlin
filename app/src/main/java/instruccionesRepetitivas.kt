/**INSTRUCIONES REPETITIVAS
 *
 * INSTRUCCIÓN WHILE
 * El código se ejecuta línea por línea, desde el principio hasta el final. Entonces, si inicia el
 * código dentro de main, la primera línea llama print(1), y la segunda print(2), por lo que el
 * resultado es 12.
 * El orden en que se ejecutan las líneas se denomina flujo de control. El orden predeterminado es
 * instrucción por instrucción (línea por línea), de arriba a abajo. Sin embargo, es importante
 * tener en cuenta que algunas estructuras pueden cambiar este orden. La condición if salta sobre un
 * bloque específico de código (su cuerpo) cuando su condición no se cumple (devuelve false).
 * Hasta ahora, una línea de código no se podría llamar más de una vez durante la ejecución de un solo
 * programa. Esa es una gran limitación que puede solucionar con bucles que permiten ejecutar un
 * bloque de código varias veces.
 * while Hasta cierto punto, es similar a una condición if. Su estructura es la misma, excepto que
 * usa la palabra clave while en lugar de if. En ambos casos, si el predicado devuelve false, el
 * cuerpo nunca se ejecuta.
 * La diferencia se hace evidente cuando el predicado devuelve true. En ambos casos, se ejecuta el
 * cuerpo. Después de eso, la condición if termina, pero la condición while comprueba el predicado
 * nuevamente. La instrucción while imprimirá el cuerpo durante el tiempo que la condición devuelva
 * true. Eso significa que no debe usar condiciones while con un predicado que siempre devolverá true.
 * Dicho código se ejecutará para siempre a menos que lo detenga.
 * >>>Ejempplo N° 1: Se comienza con un código que imprime su cuerpo solo una vez.
 *
 * >>>Ejemplo N°2: Usemos el bucle while para imprimir algunas secuencias matemáticas. Hagamos que
 * la primera secuencia comience en 0, subamos 7 en cada paso y detengámonos antes de que sea mayor
 * que 100. Puede implementar esto declarando una variable con un valor inicial de 0 y luego,
 * escribiendo un bucle while. El bucle solo debe funcionar cuando el número actual es menor que 100.
 * Dentro del cuerpo, imprimirá el número actual y luego agregará 7 a su valor.
 *
 * >>>Ejemplo N°3: La siguiente secuencia comenzará en el número 1, y cada número siguiente será dos
 * veces más grande. También se detendrá cuando el número sea mayor que 100. Por lo tanto, puede
 * comenzar con una variable con un valor inicial de 1, escribir un bucle while con la condición de
 * que el número sea menor que 100 y duplicar el número actual dentro del cuerpo del bucle while.
 *
 * >>>Ejemplo N°4: En el último ejemplo, creará una secuencia de los cuadrados de todos los números
 * enteros y la detendrá antes de que el valor al cuadrado sea mayor que 100. Para eso, usará un
 * bucle while para iterar en los números enteros, e imprimirá el cuadrado de cada uno de ellos.
 * El predicado detendrá el bucle cuando el cuadrado sea mayor que 100.
 *
 *
 * INSTRUCCIÓN FOR
 * El bucle for es un tipo popular de bucle. A menudo se utiliza para invocar una acción para cada
 * elemento de una lista.
 * >>>Ejemplo N°1: Usa un bucle for para iterar en una lista
 *
 * >>>Ejemplo N°2: Ahora miremos como podemos usar los bucles for para iterar en números
 *
 * >>>Ejemplo N°3: Para llamar al código para cada número de a a b, con un paso c, use a..b step c
 * en el for-loop (bucle for) y con uso de variables
 *
 * >>>Ejemplo N°4: Para llamar al código para cada número de d a e, sin incluir e, con un paso f,
 * use a until b step c dentro del for-loop.
 *
 * BUCLE ANIDADO
 * Puede tener un bucle for dentro de otro bucle for, lo que se llama bucle anidado. El bucle for
 * externo invoca su cuerpo n veces y para cada una de esas veces, el bucle for interno imprime su
 * cuerpo n veces
 * >>>Ejemplo N°1: Digamos que tengo que imprimir un cuadrado de estrellas de cinco por cinco de
 * tamaño. Puedo hacerlo usando un bucle for anidado. El bucle exterior es responsable de imprimir
 * cada fila y el bucle interior es responsable de imprimir la estrella en cada fila. Primero,
 * imprimo una estrella, y luego necesito una línea de impresión vacía para iniciar una nueva línea,
 * y se imprime un cuadrado de cinco por cinco
 *
 * >>>Ejemplo N°2: quiero imprimir un triángulo de estrellas. En la primera fila, debe haber una
 * estrella, en la segunda fila, hay dos estrellas, en la tercera fila, hay tres estrellas, cuatro
 * en la cuarta fila y para formar la parte inferior del triángulo, hay cinco estrellas en la quinta
 * fila. Es posible que haya observado que el número de la fila es también el número de estrellas
 * que deben imprimirse en esa fila. Puedo usar eso. En cada fila, imprimo el mismo número de
 * estrellas que el número de fila. El resultado es un triángulo impreso.
 *
 * >>>Ejemplo N°3: Pero, ¿qué sucede si quiero un triángulo al revés? El número de estrellas dependerá
 * de la variable i. Pero, ¿por qué depende de la variable? Consideremos el número de estrellas y su
 * número de fila. Para la primera fila, debo imprimir cinco estrellas, la segunda fila consta de
 * cuatro estrellas, la tercera fila de tres estrellas, la cuarta fila de dos estrellas, y para la
 * fila número 5, solo se necesita una estrella. ¿Cómo logro el valor de las estrellas del número de
 * fila? La forma más sencilla es usar 6 menos i. Esto se debe a que 6 menos 1 es 5, 6 menos 2 es 4,
 * 6 menos 3 es 3, 6 menos 4 es 2, y 6 menos 5 es 1. El código proporciona el resultado deseado de
 * un triángulo al revés.
 *
 * **/


fun main() {
    instruccionWhile()
    instruccionFor()
    instruccionForAnidado()
}

fun instruccionWhile() {
    println("La instrucción 'while' se ejecutará hasta que la condición cambie a false")
    println("Ejemplo N°1")
    var toBePrinted = true
    while (toBePrinted) {
        println("Will be printed once")
        toBePrinted = false
    }
    println()

    println("Aquí hay un código que llama a su cuerpo para los números del 0 al 2.")
    var printedTimes = 0
    while (printedTimes <= 2) {
        println("Line $printedTimes");
        printedTimes += 1
        // or
        // printedTimes = printedTimes + 1
    }
    println()

    println("Ejemplo N°2")
    var num = 0
    while (num < 100) {
        println(num)
        num += 7 // or num = num + 7
    }
    println()

    println("Ejemplo N°3")
    var num1 = 1
    while (num1 <= 100) {
        println(num1)
        num1 = num1 * 2
    }
    println()

    println("Ejemplo N°4")
    println("Generalmente se utiliza var para poder realizar los cambios en el incremento")
    var num2 = 1
    while (num2 * num2 <= 100) {
        println(num2 * num2)
        num2++
    }
    println()
    var toBePrinted1 = true
    while (toBePrinted1) {
        print("A")
        toBePrinted1 = false
    }
    println()
}

fun instruccionFor() {
    println()
    println("El bucle for es un tipo popular de bucle. A menudo se utiliza para invocar una acción \n" +
            "para cada elemento de una lista.")
    println("Ejemplo N°1")
    val letters = listOf("A", "B", "C")
    for (letter in letters) {
        println("The next letter is $letter")
    }
    println()

    println("Uso de for para iterar en números con rangos cerrados que incluya el último valor")
    for(i in 1..5) {
        println(i)
    }
    println()

    println("Uso de for para iterar en números con rangos abiertos que no incluya el último valor. \n" +
            "Se debe utilizar la palabra clave until")
    for(i in 1 until 5) {
        println(i)
    }
    println()

    println("Uso de for para iterar en números con rangos empezando desde el valor mas alto y \n" +
            "terminando con el valor mas bajo. Se debe utilizar la palabra clave downTo. Además \n" +
            "contiene el último valor")
    for(i in 5 downTo 1) {
        println(i)
    }
    println()

    println("Uso de for para iterar en números con rangos y especificar un paso predeterminado que \n" +
            "funcionaría como el incremento, utilizando la palabra step")
    for(i in 10 downTo 0 step 2) {
        println(i)
    }
    println()

    println("Uso de for para iterar en números con rangos y especificar un paso predeterminado que \n" +
            "funcionaría como el incremento, utilizando la palabra step")
    for(i in 0..10 step 5) {
        println(i)
    }
    println()

    println("Uso de for para iterar en números con rangos y especificar un paso predeterminado que \n" +
            "funcionaría como el incremento, utilizando la palabra step")
    for(i in 0 until 10 step 4) {
        println(i)
    }
    println()

    println("Ejemplo N°3")
    val a = 10
    val b = 0
    val c = 4
    for (i in a downTo b step c) {
        println(i)
    }
    println()

    println("Ejemplo N°4")
    val d = 0
    val e = 10
    val f = 2
    for (i in d until e step f) {
        println(i)
    }
    println()
}

fun instruccionForAnidado() {
    println("For anidado")
    println("Ejemplo N°1: Cuadrado")
    for (i in 1..5) {
        for (j in 1..5) {
            print("*")
        }
        println()
    }
    println()

    println("Ejemplo N°2: Triángulo normal")
    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    println()

    println("Ejemplo N°3: Triángulo invertido")
    for (i in 1..5) {
        val numbersOfStars = 6 - i
        for (j in 1..numbersOfStars) {
            print("*")
        }
        println()
    }
    println()

    println("Otra forma de Triángulo invertido")
    for (numberOfStar in 5 downTo 1) {
        for (i in 1..numberOfStar) {
            print("*")
        }
        println()
    }
    println()

    println("Triángulo invertido a la derecha")
    val width = 5
    for (i in 1 until width step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    for (i in width downTo 1 step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    println()

    println("Triángulo invertido a la izquierda")
    for (i in 1 until 5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    println()

    println("Otro tipo de triángulo")
    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    println()

    println("Otro triángulo invertido y alineado a la derecha")
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    println()

    println("Otro triángulo invertido y alineado al centro")
    for (i in 5 downTo 1) {
        val numberOfSpaces = i - 5
        for (j in numberOfSpaces..1) {
            print(" ")
        }
        val numberOfStars = i * 2 - 1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    println()

    println("Triángulo isósceles: calculando el número de estrellas de esta manera: i * 2 - 1.")
    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i * 2 - 1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    println()

    println("Para aumentar el tamaño del triangulo normal")
    val height = 10
    for (i in 1..height) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    println()

    println("Para aumentar el tamaño del triangulo invertido")
    val height1 = 10
    for (i in 1..height1) {
        val numberOfStars = 11 - i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    println()
}