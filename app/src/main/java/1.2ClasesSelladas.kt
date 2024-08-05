/**CLASES SELLADAS
 * Interfaces y clases selladas:
 * Como se explicó en un módulo anterior, las clases conectadas en las relaciones entre elementos
 * principales y secundarios forman jerarquías. Por ejemplo, cuando tiene la clase abstracta Animal,
 * con las subclases Dog y Cat, están en una relación entre sí, y forman una jerarquía de objetos.
 *      abstract class Animal
 *      class Dog : Animal()
 *      class Cat : Animal()
 * A esa jerarquía se la llama open (abierta) porque siempre se puede definir otra clase que herede
 * de Animal. Eso tiene mucho sentido, ya que no hay límite para el número de tipos de animales.
 * Sin embargo, esto no sucede con todas las jerarquías. Suponga que intenta realizar una operación
 * de red. El resultado es correcto o incorrecto. No desea permitir que nadie defina ninguna otra
 * subclase. Ese es el caso para usar un modificador sealed en lugar de abstract.
 *      sealed class Result
 *      class Success(val data: String) : Result()
 *      class Failure(val exception: Throwable) : Result()
 * Un modificador sealed (sellado) utilizado delante de una clase se comporta como abstract (abstracto),
 * pero también presenta algunas limitaciones.
 * Oficialmente, las subclases de una clase sellada deben definirse en el mismo paquete. Lo que es
 * más importante es que un modificador sealed es información para el desarrollador que lee el
 * código: le informa que esta clase tiene un número limitado de subclases conocidas de antemano
 * durante la compilación.
 *
 * Clases selladas y expresiones when:
 * Hay una consecuencia importante del uso de las clases selladas. Puede que recuerde que para usar
 * when como expresión debe especificar un bloque else para que siempre se devuelva algo.
 *      fun constructLabel(role: String, name: String): String {
 *          return when (role) {
 *              "ceo" -> "The boss"
 *              "manager" -> "Manager $name"
 *              "worker" -> name
 *              else -> "Unknown role"
 *           }
 *      }
 *
 * fun main() {
 * val label = constructLabel("manager", "Leonard")
 * println(label) // Manager Leonard
 * }
 *
 * Hay excepciones a esta regla. Como se demostró anteriormente, no es necesario especificar else si
 * usa una expresión when con una clase enum y abarca todos los valores posibles.
 * enum class Role {
 *      CEO,
 *      MANAGER,
 *      WORKER
 * }
 *
 * fun constructLabel(role: Role, name: String): String {
 *      return when (role) {
 *          CEO -> "The boss"
 *          MANAGER -> "Manager $name"
 *          WORKER -> name
 *       }
 * }
 *
 * fun main() {
 * val label = constructLabel(Role.MANAGER, "Leonard")
 * println(label) // Manager Leonard
 * }
 *
 * Otra excepción de este tipo es cuando usa when con un valor de clase sellada y abarca todos los
 * subtipos posibles. Eche un vistazo al código a continuación. Dado que abarca todos los subtipos
 * posibles de Role en una expresión when, no es necesario especificar un bloque else. Es posible
 * gracias al modificador sealed.
 *
 * sealed class Role
 * class CeoRole(): Role()
 * class ManagerRole(val name: String): Role()
 * class WorkerRole(val name: String): Role()
 *
 * fun constructLabel(role: Role): String {
 *      return when (role) {
 *          is CeoRole -> "The boss"
 *          is ManagerRole -> "Manager ${role.name}"
 *          is WorkerRole -> role.name
 *      }
 * }
 *
 * fun main() {
 * val label = constructLabel(ManagerRole("Leonard"))
 * println(label) // Manager Leonard
 * }
 * */