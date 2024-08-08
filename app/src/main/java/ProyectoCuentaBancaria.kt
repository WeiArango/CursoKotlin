import java.time.temporal.TemporalAmount

/**EJERCICIO CUENTA BANCARIA
 * Creará una aplicación bancaria donde se pueda realizar lo siguiente:
 *     Crear cuentas bancarias
 *     Validar la entrada del usuario
 *     Consultar los saldos de cuentas
 *     Procesar depósitos y retiros
 *
 * Creará una pantalla de apertura que permita la selección de un tipo de cuenta.
 * Y producirá un tipo de respuesta cuando gestione la transferencia de dinero.
 *
 * LA CODIFICACIÓN
 * Trabajará con construcciones, tales como funciones, bucles, instrucciones condicionales y expresiones
 * when para crear la funcionalidad de la aplicación de la cuenta bancaria. Las operaciones bancarias
 * se definen en un conjunto de funciones agrupadas en la estructura del proyecto. En la lógica de
 * la aplicación se utilizarán bucles para procesar las entradas del usuario y crear cuentas bancarias.
 * En función de la entrada del usuario, controle los extractos de flujos, como las instrucciones
 * condicionales y las expresiones when ejecute las operaciones bancarias y asegúrese de que la
 * aplicación de cuenta bancaria funcione sin problemas.
 *
 * DETALLES DEL PROYECTO *
 * El proyecto se divide en tres partes. En cada una de ellas encontrará todos los lineamientos
 * necesarios, los comentarios y las soluciones. La secuencia y el contenido de las tres partes del
 * proyecto simulan el tipo de progresión de desarrollo de software que ocurriría en una compilación
 * del mundo real de dicha aplicación.
 *
 * Parte 1: Cree una interfaz del usuario (UI) visual y configure las cuentas
 * En esta primera parte, creará la aplicación para permitirle al usuario elegir entre tres tipos
 * diferentes de cuentas bancarias: crédito, débito y cuenta corriente. Este trabajo incluye lo
 * siguiente:
 *     >>>Imprima los nombres de los tres tipos de cuentas bancarias en la consola.
 *     >>>Utilice bucles para crear una nueva cuenta bancaria basada en la elección del usuario.
 *     >>>Utilice una expresión when para validar la entrada del usuario y seleccione el tipo de cuenta
 *     bancaria requerido.
 *
 * Parte 2: Defina las operaciones de la cuenta bancaria
 * Para cada tipo de cuenta, configure la aplicación para las operaciones de depósito y de retiro de
 * fondos.
 *     >>>Utilice las funciones para crear operaciones de cuenta bancaria válidas y apropiadas basadas
 *     en los tipos de cuentas bancarias.
 *     >>>Configure instrucciones condicionales para implementar la lógica de los retiros y los
 *     depósitos en las cuentas bancarias.
 *
 * Parte 3: Administre la cuenta bancaria
 * Después de crear una cuenta bancaria y definir las operaciones, procese los comandos de entrada
 * del usuario para administrar una cuenta bancaria. *
 *     >>>Utilice las funciones para administrar los retiros y los depósitos de dinero.
 *     >>>Utilice bucles para procesar varios comandos de usuario de la cuenta bancaria dada.
 *     >>>Para las transferencias de dinero, use las instrucciones condicionales para seleccionar la
 *     operación de la cuenta bancaria que desea sobre la base del tipo de cuenta bancaria en cuestión.
 *     >>>Utilice expresiones when para elegir la operación de cuenta bancaria correcta de la lista
 *     de operaciones de cuenta bancaria válidas.
 * */

//SOLUCIÓN DEL PROYECTO
//Parte 1 de la cuenta bancaria
/**Este ejercicio es la parte 1 de 3 partes en el proyecto de la cuenta bancaria. Este es un resumen
 * de lo que hará en cada parte del proyecto.
Parte 1: Configure la interfaz de usuario y las cuentas bancarias.
Parte 2: Defina las operaciones de las cuentas bancarias.
Parte 3: Administre la cuenta bancaria.

Paso 1: Iniciar la interfaz del sistema bancario
Primero, debe crear la interfaz de usuario de la aplicación de la cuenta bancaria. Esta interfaz
guiará a los usuarios por el proceso de configuración de cuentas bancarias. Para lograr esto, use
instrucciones print para mostrar lo siguiente en la interfaz:
Welcome to your banking system (Bienvenido al sistema bancario).
What type of account would you like to create? (¿Qué tipo de cuenta le gustaría crear?)
>>>Debit account (Cuenta de débito)
>>>Credit account (Cuenta de crédito)
>>>Checking account (Cuenta corriente)
>>>Choose an option (1, 2 or 3)
Nota: Utilice 6 instrucciones print diferentes para mostrar el mensaje de bienvenida y las 3 opciones
de cuenta distintas.

****************************************************************************************************

Paso 2: Crear variables para el tipo de cuenta bancaria y la entrada del usuario
Luego, cree variables que se utilizarán para almacenar el tipo de cuenta bancaria y la entrada del
usuario.
>>>Cree una variable para el tipo de cuenta bancaria. Llámela accountType y establezca su valor
en "" (que es una cadena vacía).
>>>Cree una variable para la entrada del usuario. Asígnele el nombre userChoice y establezca su valor
en 0 (cero).

****************************************************************************************************

Paso 3: Crear una cuenta bancaria basada en la entrada del usuario
En este paso, creará la cuenta bancaria y establecerá su tipo en función de la entrada del usuario.
Nota: De forma predeterminada, el entorno de Playground no puede procesar los datos proporcionados
por el usuario. Aquí evitará ese problema generando números aleatorios que se utilizan para simular
la entrada de un usuario.
Comenzará definiendo un bucle while que genere la entrada del usuario utilizando números aleatorios.
Si los números generados son 1, 2 o 3, se creará la cuenta bancaria. El bucle debe repetirse siempre
que el valor de la variable accountType sea igual a una cadena vacía. Si la entrada generada por el
usuario es válida la primera vez que se ejecuta el bucle, este concluirá. Si la entrada generada por
el usuario no es válida, el bucle se repetirá hasta que lo sea.

Generación de entrada del usuario en el bucle while:
1. Después de insertar la palabra clave while para el bucle while, entre paréntesis agregue la
instrucción condicional accountType == “”. Luego, incluya una instrucción print entre llaves para
mostrar las opciones para los diferentes tipos de cuenta. La instrucción print debe imprimir lo
siguiente: Elija una opción (1, 2 o 3)

2. Luego, para simular la entrada del usuario, use la función IntRange.random()  para generar un
número aleatorio entre 1 y 5. Para ello, úselo como (1..5).random() donde 1 es el límite inferior y
5 es el límite superior de los números aleatorios generados. Asigne el número aleatorio generado a
la variable userChoice.
Note: Las opciones válidas son entre 1 y 3. Está generando números aleatorios entre 1 y 5 para que
el rango se adapte a dos opciones del usuario no válidas (4 y 5) y se puedan simular los errores que
a veces se producen en un escenario del mundo real.

3. Dentro del bucle while, imprima el número aleatorio generado en la consola. Esta es la entrada de
usuario simulada. La instrucción print debe mostrar lo siguiente:
La opción seleccionada es...
Nota: Utilice la interpolación de cadenas para tener acceso al valor de la variable userChoice dentro
de la instrucción print.

Definición del tipo de cuenta en función de la entrada del usuario:
Luego, declarará una expresión when dentro del bucle while. La expresión when utiliza el valor de la
variable userChoice para seleccionar el tipo de cuenta bancaria entre las tres opciones proporcionadas
por la interfaz. Esto cambia el valor de la variable accountType en función del número generado
aleatoriamente. Esto significa que se creará una cuenta bancaria si la entrada del usuario es válida.

Uso de la expresión when:
1. Asigne "debit" a la variable accountType cuando el valor de userChoice sea 1. Esto significa que
se crea una cuenta de débito si la entrada generada por el usuario es 1.

2. Asigne "credit" a la variable accountType cuando el valor de userChoice sea 2. Esto significa que
se crea una cuenta de crédito si la entrada generada por el usuario es 2.

3. Asigne "checking" a la variable accountType cuando el valor de userChoice sea 3. Esto significa
que se crea una cuenta corriente si la entrada generada por el usuario es 3.

4. Por último, agregue else case para gestionar las entradas no válidas para que sea exhaustivo.
Gestionará todos los valores de la variable userChoice que otros casos no gestionan. Agregue la
instrucción continue para pasar a la siguiente iteración del bucle sin hacer nada más. Esto significa
que no se crea ninguna cuenta bancaria porque la entrada del usuario no es válida.

****************************************************************************************************

Paso 4: Mostrar el tipo de cuenta
Por último, imprima el tipo de cuenta bancaria que se ha creado. La instrucción print debería decir:
"You have created a XXX account" (Ha creado una cuenta XXX).
Utilice la interpolación de cadena para obtener acceso al valor de la variable accountType dentro de
la instrucción print (reemplazar XXX).

****************************************************************************************************

Paso 5: Ejecutar el código
Ejecute el programa y anote el resultado que observa de los dos casos a continuación.
1.    La primera y segunda instrucción print que vea deben ser:
Welcome to your banking system (Bienvenido al sistema bancario)
What type of account would you like to create? (¿Qué tipo de cuenta le gustaría crear?)

2.    Revise más en profundidad el resultado e identifique qué tipo de cuenta se creó utilizando la
entrada generada por el usuario aleatoriamente.

****************************************************************************************************/

//Parte 2 de la cuenta bancaria
/**Resumen
En este ejercicio, practicará trabajar con funciones e instrucciones condicionales para implementar
las operaciones de la cuenta bancaria que creó en el ejercicio anterior del proyecto. Utilizará todas
estas operaciones cuando administre el sistema de cuentas bancarias en el último ejercicio del proyecto.
Las operaciones de la cuenta pueden ser retiros o depósitos de dinero. Utilizará funciones e
instrucciones condicionales para crear las operaciones de la cuenta bancaria y gestionar la lógica
de los retiros y depósitos de cuentas.

Paso 1: Crear constantes y variables
Consejo: En Kotlin, puede usar las palabras clave var y val para crear variables. Si se usa var, la
variable es reasignable, lo que significa que su valor se puede cambiar. Cuando se usa val, el valor
de la variable no se puede volver a asignar y este tipo de variable a menudo se conoce como constante.

1. Primero cree una variable usando la palabra clave “var” para almacenar el saldo de la cuenta.
Asigne a la variable del saldo de la cuenta bancaria el nombre accountBalance. Utilice el método
IntRange.random() como (0..1000).random() para generar un número aleatorio entre 1 y 1000 y asignarlo
a la variable accountBalance.
Nota: Recuerde que está generando números aleatorios para la entrada del usuario porque Playground
no puede procesarla de forma predeterminada.

2. Imprima el saldo de la cuenta en la consola. Utilice la interpolación de cadenas para tener acceso
al valor de la variable accountBalance dentro de la instrucción print.

3. Luego cree una constante usando la palabra clave “val” para almacenar la cantidad de dinero
utilizada para retiros y depósitos de cuentas y asígnele el nombre money. Utilice el método
IntRange.random() como (0..1000).random() para generar un número aleatorio entre 1 y 1000 y asignarlo
a la constante money.

4. Imprima el saldo de la cuenta y la cantidad que se depositará o retirará en la consola. Utilice
la interpolación de cadenas para acceder al valor de la constante money dentro de la instrucción
print.

****************************************************************************************************

Paso 2: Crear una variable de prueba
Cree una variable para el resultado de las funciones que definiremos en el siguiente paso para
administrar las operaciones de la cuenta bancaria, como los depósitos y retiros. Asigne a la variable
el nombre output y establezca su valor en 0 (cero). Utilizará esta variable para probar el resultado
de las funciones de retiro y depósito cuando las ejecute. (Implementará esas funciones en los pasos
siguientes).

****************************************************************************************************

Paso 3: Operación de retiro para cuentas corrientes y cuentas bancarias de crédito
Luego, defina la función que gestiona la lógica de la operación de retiro para cuentas corrientes y
cuentas bancarias de crédito.
1. Nombre la función como withdraw y asígnele un parámetro denominado amount. El parámetro amount es
un entero y la función también devolverá un entero, por lo tanto, la definición será
withdraw(amount: Int): Int. El parámetro  amount y el valor devuelto por la función
withdraw(...) representan la cantidad de dinero que se retiró de la cuenta.

2. Utilice el operador de asignación de resta dentro del cuerpo de la función withdraw(...) para
restar el valor del parámetro amount del valor de la variable accountBalance y asigne el resultado
a la variable accountBalance. Esto significa que ha retirado dinero de su cuenta bancaria.

3.Imprima la cantidad de dinero retirado de su cuenta bancaria y el saldo actualizado de la cuenta
en la consola dentro del cuerpo de la función withdraw(...). Utilice la interpolación de cadenas para
acceder al valor del parámetro amount y la variable accountBalance dentro de la instrucción print.

4. Devuelva el valor del parámetro amount de la función withdraw(...) dentro del cuerpo de la función.

****************************************************************************************************

Paso 4: Probar la operación de retiro
Ahora, pruebe la función que gestiona la lógica de la operación de retiro para cuentas corrientes y
cuentas bancarias de crédito.
1. Llame a la función withdraw(...) con el valor de la variable money como argumento y asigne su
resultado a la variable del resultado.

2. Imprima el resultado de la función withdraw(...) en la consola. Utilice la interpolación de cadena
para acceder al valor de la variable del resultado dentro de la instrucción print.

****************************************************************************************************

Paso 5: Operación de retiro para cuentas de débito
Luego, implemente la función que gestiona la lógica de la operación de retiro en las cuentas bancarias
de débito. A diferencia de las cuentas corrientes donde el saldo puede ser negativo, las cuentas
bancarias de débito permiten el retiro solo si hay un saldo positivo neto presente en la cuenta
bancaria.

Cree la función
Nombre a la función debitWithdraw y asígnele un parámetro denominado amount. El parámetro amount es
un entero y la función debitWithdraw(...) devuelve un entero, por lo tanto, la definición de la
función sería debitWithdraw(amount: Int): Int. El parámetro amount representa el dinero que se va a
retirar y el valor devuelto de la función debitWithdraw(...) representa la cantidad de dinero
realmente retirada de la cuenta.

Use una instrucción else/if dentro del cuerpo de la función debitWithdraw(...) para comprobar el
estado del saldo de la cuenta bancaria. Configure la instrucción else/if como se indica a continuación:
1. Bloque If: Compruebe si el valor de la variable accountBalance es 0 para determinar si hay fondos
disponibles en la cuenta. Imprima "Can't withdraw, no money on this account!" en el bloque if.
Devuelva el valor de la variable accountBalance.

2. Bloque else if: Compruebe si el valor del parámetro amount es mayor que el valor de la variable
accountBalance para evaluar si hay suficiente dinero en la cuenta para realizar el retiro. Imprima
"Not enough money on this account! The checking balance is ${accountBalance} dollars.". Devuelva 0 de
la función  debitWithdraw(...) dentro del bloque else if. Esto significa que no se ha retirado dinero
porque el saldo de la cuenta es inferior al monto del retiro.

3. Bloque else: Por último, llame a la función withdraw(...) con el valor del parámetro amount como
argumento y devuelva el resultado desde la función debitWithdraw(...) dentro del blooque else.
Esto significa que el usuario puede continuar con el retiro porque la cantidad de dinero que desea
retirar es menor o igual al saldo de la cuenta.

****************************************************************************************************

Paso 6: Probar la operación de retiro
Ahora pruebe la función que gestiona la lógica de la operación de retiro para cuentas bancarias de
débito.
1. Llame a la función debitWithdraw(...) con el valor de la variable money como argumento y asigne
su resultado a la variable del resultado.

2. Imprima el resultado de la función debitWithdraw(...) en la consola. Utilice la interpolación de
cadena para acceder al valor de la variable del resultado dentro de la instrucción print.

****************************************************************************************************

Paso 7: Operación de depósito para cuentas corrientes y de débito
Luego, implementará una función que gestione la operación de depósito para cuentas corrientes y de
débito.
Cree la función. Nombre la función como deposit y asígnele un parámetro llamado amount.
El parámetro amount es un entero y la función deposit(...) devuelve un entero, por lo tanto, la
definición de la función es deposit(amount: Int): Int. El parámetro amount y la función deposit(...)
devuelven valores que representan la cantidad de dinero depositado en la cuenta.

1. Utilice el operador de asignación de suma dentro del cuerpo de la función deposit(...) para sumar
el valor del parámetro amount al valor de la variable accountBalance, y asigne el resultado a la
variable accountBalance. Esto significa que deposita dinero en la cuenta bancaria.

2.Imprima la cantidad de dinero depositado en su cuenta bancaria y el saldo actualizado de la cuenta
en la consola dentro del cuerpo de la función deposit(...). Utilice la interpolación de cadenas para
acceder al valor del parámetro amount y la variable accountBalance dentro de la instrucción print.

3. Dentro del cuerpo de la función deposit(...), devuelva el valor del parámetro amount de la función
deposit(...).

****************************************************************************************************

Paso 8: Probar la operación de depósito para cuentas corrientes y de débito
Ahora pruebe la función que gestiona la lógica de la operación de depósito para cuentas corrientes y
de débito.
1. Llame a la función deposit(...) con el valor de la variable money como argumento y asigne su
resultado a la variable del resultado.

2. Imprima el resultado de la función deposit(...) en la consola. Utilice la interpolación de cadena
para acceder al valor de la variable del resultado dentro de la instrucción print.

****************************************************************************************************

Paso 9: Implementar la operación de depósito en cuentas de crédito
Luego, implemente la función que gestiona la lógica de la operación de depósito en las cuentas
bancarias de crédito.
1. Cree la función. Nombre a la función como creditDeposit y asígnele un parámetro denominado amount.
El parámetro amount es un entero y la función creditDeposit(...) devuelve un entero, por lo tanto,
la definición de la función sería creditDeposit(amount: Int): Int. El parámetro amount representa la
cantidad de dinero que se depositará y el valor devuelto de la función creditDeposit(...) representa
la cantidad de dinero realmente depositada en la cuenta.

2. Use una instrucción if else if dentro del cuerpo de la función creditDeposit(...) para comprobar
el estado del saldo de la cuenta bancaria. Primero, verifique si el valor de la variable del saldo
es 0 para verificar si tiene dinero en su cuenta bancaria.

3. Imprima el estado del depósito en la consola dentro del bloque if del cuerpo de la función
creditDeposit(…). No es necesario que deposite nada para cancelar el pago de la cuenta, ya que ya se
ha pagado.

4. Devuelva el valor de la variable del saldo de la función creditDeposit(...) dentro del bloque if
del cuerpo de la función creditDeposit(...). El valor de la variable del saldo es 0 porque no tiene
dinero en su cuenta bancaria en este caso.

5. Ahora verifique si la suma del valor de la variable del saldo y el valor del parámetro amount es
mayor que 0 dentro del cuerpo de la función creditDeposit(...) para ver cuánto dinero desea depositar
para cancelar el pago de la cuenta.

6. Imprima el estado de la cuenta de crédito y el saldo de la cuenta en la consola dentro del primer
bloque else if del cuerpo de la función creditDeposit(...). Use la interpolación de cadena para
acceder al valor de la variable del saldo dentro de la instrucción print: Deposit failed, you tried
to pay off an amount greater than the credit balance. The checking balance is ${accountBalance} dollars
(Error en el depósito, ha intentado pagar una cantidad mayor que el saldo de la cuenta de crédito.
El saldo de la cuenta corriente es ${accountBalance} dólares).

7. Devuelva 0 desde la función creditDeposit(...) dentro del primer bloque else if del cuerpo de la
función creditDeposit(...). Esto significa que no ha depositado dinero en su cuenta bancaria porque
la cantidad que desea depositar es mayor que la cantidad que debe depositarse para pagar el saldo de
la cuenta de crédito.

8. Luego, compruebe si el valor de la variable accountBalance es el opuesto al valor del parámetro
amount dentro del cuerpo de la función creditDeposit(...) para verificar que deposita el dinero
suficiente para pagar completamente la cuenta.

9. Imprima el estado del depósito actualizado dentro del segundo bloque else if del cuerpo de la
función creditDeposit(...). Depositó el dinero suficiente para pagar completamente la cuenta en este
caso.

10. Devuelva el valor de la variable amount de la función creditDeposit(...) dentro del segundo bloque
else-if del cuerpo de la función creditDeposit(...). Esta es la cantidad que deposita en su cuenta
bancaria para pagar completamente la cuenta.

11. Por último, llame a la función deposit(...) con el valor del parámetro amount como argumento y
devuelva el resultado de la función creditDeposit(...) dentro del bloque else del cuerpo de la función
creditDeposit(...). Esto significa que la cantidad de dinero que deposita en su cuenta bancaria solo
puede cancelar el pago de la cuenta parcialmente en este caso.

****************************************************************************************************

Paso 10: Probar la operación de depósito
Por último, pruebe la función que gestiona la lógica de la operación de depósito en las cuentas
bancarias de crédito.
1. Llame a la función creditDeposit(_:) con el valor de la variable money como argumento y asigne su
resultado a la variable output.

2. Imprima el resultado de la función creditDeposit(_:) en la consola. Utilice la interpolación de
cadena para acceder al valor de la variable output dentro de la instrucción print.

****************************************************************************************************/

//Parte 3 de la cuenta bancaria
/**Resumen
En este ejercicio, practicará trabajar con funciones, bucles, instrucciones condicionales y expresiones
when. Escribirá código para administrar la cuenta bancaria que creó en la primera parte del proyecto.
Además, ejecutará diferentes operaciones de cuentas bancarias que ya definió como funciones en la
segunda parte del proyecto.
El tipo de cuenta bancaria puede ser una cuenta corriente, una cuenta bancaria de débito o de crédito.
Las operaciones de la cuenta son retiros o depósitos.

Paso 1: Implementar la operación de transferencia para las categorías de cuenta
Luego, implemente la función que gestiona la lógica de la transferencia de los retiros y depósitos
en las cuentas corrientes, de débito y de crédito.
1. Primero cree el prototipo de la función. Nombre la función como transfer y asígnele un parámetro
denominado mode. El parámetro mode es una cadena y la función transfer(...) no devuelve nada, por lo
tanto, la definición de la función será transfer(mode: String). El valor del parámetro de la función
transfer(...) representa la dirección de la transferencia de la cuenta bancaria. Puede ser un retiro
o un depósito.

2. A continuación, cree una constante utilizando la palabra clave val para el importe de la
transferencia de la cuenta dentro del cuerpo de la función transfer(...). Denomínela transferAmount
y establezca su tipo de entero explícitamente porque aún no conoce su valor, por lo que no puede usar
la inferencia de tipo para determinar su tipo de datos en función de su valor.

3. Agregue una expresión when dentro del cuerpo de la función transfer(...) que, sobre la base del
valor de la variable de modo, ejecuta el código para un retiro o un depósito.

4.Para “withdraw” como valor de modo, agregue una instrucción if else para verificar si accountType
es de tipo “debit”. De esta manera se verifica que la cuenta bancaria sea una cuenta de débito.
Para este caso, llame a la función debitWithdraw(...) con el valor de la constante money como argumento
y asigne su resultado a la constante transferAmount dentro del bloque if. La cuenta bancaria es un
tipo de cuenta de débito y usted está realizando un retiro de débito de ella.

5. Se ejecutará el caso else si no es una cuenta bancaria de débito. Por lo tanto, dentro del bloque
else, llame a la función withdraw(...) con el valor de la constante money como argumento y asigne su
resultado a la constante transferAmount dentro del bloque else. La cuenta bancaria es una cuenta
corriente o una cuenta de crédito y usted está realizando un retiro de ella.

6. Imprima el resultado de la operación de retiro con el mensaje: The amount you withdrew is
${transferAmount} dollars. Utilice la interpolación de cadenas para tener acceso al valor de la
constante transferAmount dentro de la instrucción print.

7. En el caso de un depósito, agregue una instrucción if-else para verificar si accountType es
“credit”. En caso afirmativo, significa que está verificando que la cuenta bancaria es una cuenta de
crédito.

8. Llame a la función creditDeposit(…) con el valor de la constante money como argumento y asigne su
resultado a la constante transferAmount dentro del bloque if. La cuenta bancaria es una cuenta de
crédito, y usted está realizando un depósito de crédito en ella.

9. El caso else se ejecutará si no es una cuenta bancaria de crédito. En este caso, llame a la función
deposit(…) con el valor de la constante money como argumento y asigne su resultado a la constante
transferAmount dentro del bloque else. La cuenta bancaria es una cuenta corriente o una cuenta de
débito y usted está realizando un depósito en ella.

10. Imprima el resultado de la operación de depósito con el mensaje: The amount you deposited is
${transferAmount} dollars. Utilice la interpolación de cadenas para tener acceso al valor de la
constante transferAmount dentro de la instrucción print.

11. Agregue el caso else al bloque de la expresión when dentro del cuerpo de la función transfer(…)
para que sea exhaustivo. El caso else gestiona todos los valores del parámetro mode que otros casos
no lo hacen. Utilice una instrucción return dentro del caso else de la expresión when en el cuerpo
de la función transfer(…) para salir sin hacer nada más. Esto significa que no se realiza ninguna
transferencia de cuenta porque el modo de la transferencia de la cuenta no es válido, ya que no es
ni un depósito ni un retiro.

Probará la función transfer(…) en los siguientes pasos.

****************************************************************************************************

Paso 2: Crear variables para el estado de la interfaz de la aplicación de la cuenta bancaria y la
opción de la interfaz del usuario
Ahora cree variables que almacenen el estado de la interfaz de la aplicación de la cuenta bancaria y
la opción seleccionada de la interfaz del usuario desde la consola.
1. Cree una variable para el estado de la interfaz. Llámela isSystemOpen y establezca su valor en
true. Esto significa que el sistema está abierto de forma predeterminada.

2. Cree una variable para la opción seleccionada de la interfaz del usuario. Denomínela option y
configure su valor en 0.

****************************************************************************************************

Paso 3: Administrar la cuenta bancaria sobre la base de la opción de la interfaz del usuario
Luego, administre su cuenta bancaria y realice su operación específica en función de la entrada del
usuario. La entrada del usuario se procesaría así:
Recuerde que está generando números aleatorios para la entrada del usuario porque Playground no
puede procesar entradas del usuario de forma predeterminada.
1. Defina un bucle while que gestione la entrada del usuario y realice la operación de la cuenta
bancaria correspondiente. El bucle se repite siempre que el valor de la variable isSystemOpen sea
true. Esto significa que la interfaz de la aplicación bancaria está abierta, por lo que aún puede
realizar operaciones de cuenta bancaria en su cuenta bancaria. El bucle while se repite al menos una
vez para que pueda realizar al menos una operación de cuenta en su cuenta bancaria hasta que se cierre
la interfaz de la aplicación de la cuenta bancaria.

Utilice las instrucciones print para mostrar lo siguiente en la interfaz:
What would you like to do? (¿Qué desea hacer?)
1. Check bank account balance (Consultar el saldo de la cuenta bancaria)
2. Withdraw money (Retirar dinero)
3. Deposit money (Depositar dinero)
4. Close the app (Cerrar la aplicación)
Which option do you choose? (1, 2, 3 or 4) (¿Qué opción elige?  [1, 2, 3 o 4])
Nota: Utilizará 6 instrucciones print para mostrar la información anterior.

2. Genere un número aleatorio entre 1 y 5 para la entrada del usuario dentro del bucle. El método
IntRange.random() utiliza un rango cerrado de enteros que define los límites inferior y superior de
los números aleatorios generados. Asigne el número aleatorio generado a la variable option.

3. Imprima el número aleatorio generado en la consola dentro del bucle. Recuerde que esta es la
entrada del usuario en este caso. Utilice la interpolación de cadenas para tener acceso al valor de
la variable option dentro de la instrucción print.

4. Declare dentro del bucle una expresión when que seleccione la operación de cuenta bancaria
correcta de la lista de operaciones de cuenta bancaria proporcionada por la interfaz de la aplicación
bancaria. La expresión ejecuta el código relevante sobre la base del valor de la variable option y,
en consecuencia, realiza cualquier operación de cuenta bancaria válida.

5. Cuando el valor de la variable option sea 1, imprima el saldo de la cuenta bancaria. Utilice la
interpolación de cadenas para acceder al valor de la variable balance dentro de la instrucción print.

6. Cuando el valor de la variable option es 2, llame a la función transfer(...) con la cadena
“withdraw” como argumento. Esto significa que está realizando un retiro de su cuenta bancaria.

7. Cuando el valor de la variable option sea 3, llame a la función transfer(...) con la cadena
“deposit” como argumento. Esto significa que está realizando un depósito en su cuenta bancaria.

8. Cuando el valor de la variable option sea 4, asigne “false” a la variable isSystemOpen. Esto
significa que la interfaz de la aplicación ahora está cerrada y que el bucle while se detiene una
vez que llega al final de la iteración de comprobación. Imprima el estado actualizado de la interfaz
de la aplicación como cerrado.

9. Agregue otro caso else a la expresión when dentro del bucle para que sea exhaustiva. El caso else
gestiona todos los valores de la variable option que otros casos no lo hacen. Agregue una instrucción
continue dentro del caso else para salir de la expresión when sin hacer nada más. Esto significa que
no se realiza ninguna operación de cuenta bancaria cuando la entrada del usuario no es válida.

****************************************************************************************************

Paso 5: Ejecutar el código
Ejecute el programa y anote el resultado.
La primera instrucción impresa debería ser “What would you like to do?”.
 * */




fun main() {
    //PASO 1.1
    println("Bienvenido al sistema bancario")
    println("¿Qué tipo de cuenta le gustaría crear?")
    println("1. Cuenta de débito")
    println("2. Cuenta de crédito")
    println("3. Cuenta corriente")

    //PASO 2.1
    var accountType = ""
    var userChoice = 0

    //PASO 3.1
    while (accountType == "") {
        println("Elija una opción (1, 2 o 3)")
        userChoice = (1..5).random()
        println("La opción seleccionada es $userChoice")
        when (userChoice) {
            1 -> accountType = "debit"
            2 -> accountType = "credit"
            3 -> accountType = "checking"
            else -> continue
        }
    }

    //PASO 4.1
    println("Has creado una cuenta $accountType")
    println("***************************************************************************")

    //PASO 1.2
    var accountBalance = (0..1000).random()
    println("El saldo de la cuenta es $accountBalance")
    val money = (0..1000).random()
    println("El dinero a depositar o retirar es $money")

    //PASO 2.2
    var output = 0

    //PASO 3.2
    fun withdraw(amount: Int): Int {
        accountBalance -= amount
        println("Se retiraron $amount de la cuenta $accountType. El saldo actual es $accountBalance")
        return amount
    }

    //PASO 4.2
    output = withdraw(money)
    println("El resultado de la operación de retiro es $output")

    //PASO 5.2
    fun debitWithdraw(amount: Int): Int {
        if (accountBalance == 0) {
            println("Can't withdraw, no money on this account!")
            return accountBalance
        } else if (amount > accountBalance) {
            println("¡No hay suficiente dinero en esta cuenta! El saldo actual es ${accountBalance}")
            return 0
        } else {
            return withdraw(amount)
        }
    }

    //PASO 6.2
    output = debitWithdraw(money)
    println("El resultado de la operación de retiro es $output")

    //PASO 7.2
    fun deposit(amount: Int): Int {
        accountBalance += amount
        println("Depositaste exitosamente $amount en tu cuenta $accountType. El saldo actual es $accountBalance")
        return amount
    }

    //PASO 8.2
    output = deposit(money)
    println("La cantidad que depositaste es $output")

    //PASO 9.2
    fun creditDeposit(amount: Int): Int {
        if(accountBalance == 0) {
            println("¡Esta cuenta está completamente pagada! ¡No es necesario que deposites dinero!")
            return accountBalance
        } else if(accountBalance + amount > 0) {
            println("Error en el depósito, ha intentado pagar una cantidad mayor que el saldo de la\n" +
                    "cuenta de crédito. El saldo de la cuenta corriente es ${accountBalance}")
            return 0
        } else if (amount == -accountBalance) {
            accountBalance = 0
            println("Has pagado esta cuenta")
            return amount
        } else {
            return deposit(amount)
        }
    }

    //PASO 10.2
    output = creditDeposit(money)
    println("La cantidad que depositaste es $output")
    println("***************************************************************************")

    //PASO 1.3
    fun transfer(mode: String) {
        val transferAmount: Int
        when (mode) {
            "withdraw" -> {
                if (accountType == "debit") {
                    transferAmount = debitWithdraw(money)
                } else {
                    transferAmount = withdraw(money)
                }
                println("La cantidad que retiraste es $transferAmount")
            }
            "deposit" -> {
                if (accountType == "credit") {
                    transferAmount =    creditDeposit(money)
                } else {
                    transferAmount = deposit(money)
                }
                println("La cantidad que retiraste es $transferAmount")
            }
            else -> return
        }
    }

    //PASO 2.3
    var isSystemOpen = true
    var option = 0

    //PASO 3.3
    while (isSystemOpen == true) {
        println("¿Qué desea hacer?")
        println("1. Consultar el saldo de la cuenta bancaria")
        println("2. Retirar dinero")
        println("3. Depositar dinero")
        println("4. Cerrar la aplicación")
        println("¿Qué opción elige? [1, 2, 3 o 4]")
        option = (1..5).random()
        println("La opción seleccionada es $option")

        when (option) {
            1 -> println("El saldo de la cuenta es $accountBalance")
            2 -> transfer("withdraw")
            3 -> transfer("deposit")
            4 -> {
                isSystemOpen = false
                println("La interfaz de la aplicación bancaria está cerrada")
            }
            else -> continue
        }
    }
}