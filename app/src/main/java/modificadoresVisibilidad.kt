/**MODIFICADORES DE VISIBILIDAD
 * Cuando define una clase, debe pensar en cómo la usarán otros desarrolladores y lo que desea y lo
 * que no desea que hagan con ella. Por ejemplo, supongamos que implementa una clase que representa
 * una cuenta bancaria y desea que otros desarrolladores puedan interactuar con esta clase utilizando
 * las funciones deposit y withdraw, pero no quiere que puedan modificar el saldo. Exponer solo
 * ciertos métodos para modificar un objeto se llama encapsulación, y es uno de los conceptos más
 * importantes en la programación moderna. Para hacer posible la encapsulación, debe ocultar algunas
 * propiedades y métodos para que puedan usarse dentro de una clase, pero no fuera de ella. Para
 * ello, use el modificador de visibilidad privado antes de la función o la propiedad que desea
 * ocultar. Por lo tanto, una vez que uso el modificador de visibilidad privado en la clase de cuenta
 * bancaria, aún puedo utilizar la propiedad de saldo dentro de esta clase, pero no se puede usar
 * fuera de ella. Aquí hay un error de compilación que indica que dicho código no se compilará.
 *
 * PRIVATE
 * El privado es el modificador de visibilidad más importante después del predeterminado,
 * que es público. Esto se debe a que, de manera predeterminada, todo está visible y se puede usar
 * en cualquier lugar. Privado significa que una propiedad o función en particular solo se puede
 * utilizar en el ámbito donde está definida. Entonces, si la define en una clase, entonces solo se
 * puede usar en esa clase. También puede agregar el modificador privado a los elementos que desea
 * encontrar en un archivo. Veamos el archivo Test2 de. Aquí, se usa la función de suma y debido a
 * que es pública de forma predeterminada, también se puede usar en otros archivos. Si hago que la
 * función sea privada, aún puedo usarla en el mismo archivo, pero no en otro archivo. Tenga en
 * cuenta el error de compilación que indica que no puedo usarla. Por lo tanto, la función de suma
 * se define en el ámbito del archivo y el modificador privado indica que solo se puede usar en ese
 * mismo archivo.
 *
 * PROTECTED
 * Solo se usa dentro de las clases abiertas o abstractas. Así que consideremos lo siguiente.
 * Tiene una clase llamada ship que se amplía con la clase electric ship, y a la clase ship se le
 * pasó una propiedad llamada miles que no desea que los usuarios puedan modificar. La solución
 * intuitiva es convertirla en privada. Sin embargo, si la convierte en privada, solo puede acceder
 * a ella en la misma clase, no puede modificarla en las subclases. Si desea que una propiedad o
 * una función que está utilizando esté visible en la misma clase y en las subclases, debe usar el
 * modificador protected. Protected aquí significa que el elemento estará visible en la misma clase
 * y en sus subclases. Así que ahora la clase electric ship puede modificar la propiedad, pero
 * no se puede modificar desde fuera de esa clase. La clase ship no expone milesPassed y, si trato
 * de usarla, observará que no puedo modificarla ni acceder a ella porque está protegida.
 *
 * INTERNAL
 * Significa que un elemento será visible en el mismo módulo. Por lo general, utiliza un módulo para
 * un proyecto. Entonces, para usted como desarrollador, usar internal puede parecer que es efectivamente
 * lo mismo que público, pero no debería pensar en ello de esa manera. Los desarrolladores a menudo
 * usan el código de otras personas en los proyectos, y si usa bibliotecas u otros tipos de dependencias
 * y algunos de sus elementos están marcados como internal, significa que los desarrolladores que
 * crearon esas dependencias pueden usarlas donde sea, pero usted no. ¿Qué significa eso en la práctica?
 * Significa que probablemente no use el modificador internal en su propio proyecto porque para usted
 * es como si fuera público. Pero si desea usar el código de una biblioteca y ve el modificador internal,
 * entonces sabe que no puede usar ese código porque solo estará visible dentro de esa biblioteca.
 *
 * Y así es como puede usar los modificadores de visibilidad.
 * Puede configurar una propiedad o función como privada, protegida o
 * interna, según sus necesidades.
 * */