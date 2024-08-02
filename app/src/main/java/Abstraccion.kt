/**CLASES ABSTRACTAS
 * Cuando utiliza la palabra clave abstract antes de la definición de una clase, provoca que esta
 * clase sea abstracta. Las clases abstractas son como un híbrido de una clase abierta y una interfaz.
 * Hay dos consecuencias principales de hacer que una clase sea abstracta:
 *
 *     1. Las clases abstractas pueden tener métodos o propiedades abstractas. Esos elementos están
 *     marcados con un modificador abstract y no tienen un cuerpo. Son solo definiciones, similares
 *     a las de las interfaces, que deben anularse en las subclases.
 *
 *     2. Las clases abstractas no se pueden utilizar para crear objetos. Sin embargo, puede heredar
 *     subclases de ellos. Este es el resultado de la primera consecuencia: no se pueden crear objetos
 *     con métodos o propiedades abstractas. Se deben anular.
 *
 * Puede usar clases abstractas como reemplazo de las interfaces, pero esto se considera una mala
 * práctica. Siempre que sea posible, la preferencia es utilizar interfaces. Cada clase puede heredar
 * de una sola clase, pero implementar muchas interfaces. Las interfaces se consideran un concepto más
 * fácil de aprender en comparación con las clases abstractas. La ventaja clave de las clases abstractas
 * es que pueden tener métodos no abiertos (en las interfaces, todos los elementos son abiertos) y
 * propiedades no abstractas.
 *
 * Las clases abstractas se utilizan principalmente cuando se desea especificar un conjunto de
 * operaciones genéricas para varias clases. Supongamos que escribe una aplicación que dibuja varias
 * formas de diferentes maneras. Es posible que las dibuje en componentes nativos de Android, en
 * sitios web o en un terminal. Dado que dibuja de diferentes maneras en cada una de esas plataformas,
 * necesita clases por separado.
 * Sin embargo, también hay otra opción. Dado que un cuadrado y un rectángulo se pueden dibujar usando
 * líneas, puede definir una clase abstracta ShapeDrawer, que definirá los métodos drawSquare y
 * drawRectangle sobre la base del método abstracto drawLine. Ahora las clases drawer pueden heredar
 * de shapeDrawer y solo deben definir una función drawLine para tener también drawSquare y drawRectangle.
 * */

//EJEMPLO
abstract class ShapeDrawer {
    fun drawSquare(){
        drawLine()
    }
    fun drawRectangle(){
        drawLine()
    }
    internal abstract fun drawLine()
}
class AndroidShapeDrawer():ShapeDrawer(){

    override fun drawLine() {
        //code that draw lines for android platform
        println("Test code -Draw line for  android platform")
    }
}
class DesktopShapeDrawer():ShapeDrawer(){
    override fun drawLine() {
        //code that draw lines for android platform
        println("Test code -Draw line for  desktop platform")
    }
}
fun main(){
    val androidDrawer:ShapeDrawer = AndroidShapeDrawer()
    androidDrawer.drawSquare()
    val desktopDrawer:ShapeDrawer = DesktopShapeDrawer()
    desktopDrawer.drawSquare()
    println()

}


/**Ejemplo de caso de uso de las clases abstractas
En el siguiente ejemplo, hay tres clases: AndroidShapeDrawer, WebsiteShapeDrawer y TerminalShapeDrawer.
Cada clase tiene una función para dibujar una línea, dibujar un cuadrado y dibujar un rectángulo.
 * */

class cajonAndroid {
    fun dibujarLinea(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /*...*/
    }
    fun dibujarCuadrado(x: Int, y: Int, size: Int) {
        /*...*/
    }
    fun dibujarRectangulo(x: Int, y: Int, height: Int, width: Int) {
        /*...*/
    }
}

class cajonWebsite {
    fun dibujarLinea(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /*...*/
    }
    fun dibujarCuadrado(x: Int, y: Int, size: Int) {
        /*...*/
    }
    fun dibujarRectangulo(x: Int, y: Int, height: Int, width: Int) {
        /*...*/
    }
}

class cajonDesktop {
    fun dibujarLinea(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /*...*/
    }
    fun dibujarCuadrado(x: Int, y: Int, size: Int) {
        /*...*/
    }
    fun dibujarRectangulo(x: Int, y: Int, height: Int, width: Int) {
        /*...*/
    }
}

/**Cada clase podría implementar estas funciones individualmente; sin embargo, hay otra opción.
Dado que un cuadrado y un rectángulo se pueden dibujar usando líneas, puede definir una clase abstracta
dibujarLinea, que definirá los métodos dibujarCuadrado y dibujarRectangulo sobre la base del método
abstracto dibujarLinea. Ahora las clases drawer pueden heredar de cajon y solo deben definir una
función dibujarLinea, pero también tendrán las funcionalidades dibujarCuadrado y dibujarRectangulo.
 * */

//ACÁ LA SOLUCIÓN CON ABSTRACT
abstract class Cajon {

    abstract fun dibujarLinea(fromX: Int, fromY: Int, toX: Int, toY: Int)

    fun dibujarCuadrado(x: Int, y: Int, size: Int) {
        dibujarLinea(x, y, x + size, y)
        dibujarLinea(x + size, y, x + size, y + size)
        dibujarLinea(x, y, x, y + size)
        dibujarLinea(x, y + size, x + size, y + size)
    }

    fun dibujarRectangulo(x: Int, y: Int, height: Int, width: Int) {
        dibujarLinea(x, y, x + width, y)
        dibujarLinea(x + width, y, x + width, y + height)
        dibujarLinea(x, y, x, y + height)
        dibujarLinea(x, y + height, x + width, y + height)
    }
}

class cajonAndroid1: Cajon() {
    override fun dibujarLinea(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}

class cajonWebsite1: Cajon() {
    override fun dibujarLinea(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}

class cajonDesktop1: Cajon() {
    override fun dibujarLinea(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}








