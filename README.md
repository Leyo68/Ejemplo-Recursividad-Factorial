# Ejemplo-TDA
Aplicación de consola

Aplicación de consola en donde se hace uso de la recursividad, es este caso se calcula el factorial de un número que el usuario digite.
La aplicación se realizó en el lenguaje de Java, el IDE en el que se trabajó fue Sublime Text.

A continuación se presenta el código fuente de la clase principal y la función main

![1](https://user-images.githubusercontent.com/71055467/94619173-064a6c00-0272-11eb-8702-fd15819c2cee.jpg)

El código que sigue es del constructor y de la función recursiva, esta parte es el más importante para este ejemplo debido a que aqui es donde se encuentra la función recursiva, para ser precisos se encuentra en la línea 79, cada vez que se manda a llamar la función a sí mismo el valor de n que es el número que ha digitado  el usuario disminuye en uno y se va realizando dichas multiplicaciones.

![2](https://user-images.githubusercontent.com/71055467/94619186-0c404d00-0272-11eb-969c-d0c3844536ab.jpg)

El resultado de la ejecución del código anterior es el que se visualiza en la captura siguiente
Antes que nada se tiene que compilar el código, y en caso de que no hay errores se ejecuta dicho código es aquí donde empieza pidiendo un numero al usuario, ya que se digita un número correcto, hace el cálculo internamente y muestra el resultado con una impresión de pantalla adjuntado con un pequeño enunciado como se muestra.

![3](https://user-images.githubusercontent.com/71055467/94619832-2890b980-0273-11eb-91ac-6063aa9f9ea6.jpg)

Despues de calcular el factorial de un número por consola, se ejecuta otro código, en donde realiza la misma operación pero por un método diferente, es decir, calcula el factorial pero esta vez por el método iterativo y además no lo hace en consola, de lo contrario, pide al usuario un numero y lo muestra en pantalla, pero por medio de una ventana JOptionPane.
El código fuente se muestra a continuación

![4](https://user-images.githubusercontent.com/71055467/94620644-912c6600-0274-11eb-8653-40ce2457a178.jpg)

Ahora se muestra una captura de pantalla sobre la ejecución del programa por el método iterativo y por medio de una interfáz grafica.

![imagen](https://user-images.githubusercontent.com/71055467/94621192-7f978e00-0275-11eb-9fc3-15e31b913cb7.png) ![imagen](https://user-images.githubusercontent.com/71055467/94621223-8b835000-0275-11eb-808b-b92552fd1b4a.png)

Lo anterior, el equipo lo realizó con la finalidad de ver cual es la gran diferencia entre estos dos métodos, ya que hacen lo mismo pero de forma diferente.

Una vez calculado el factorial en ambos métodos, el programa pedirá al usuario si desea ingresar de nuevo otro numero para calcular su factorial, en caso de que la respuesta es sí, se vuelve a ejecutar el código anterior, pero si no, hace todo lo contrario, es decir el programa termina de ejecutarse.
El código fuente se muestra a continuación, aunque hay que decir que hace falta la palabra do y el corchete, debido a que es en este campo en donde se encuentra la mayoria del programa, pero el código completo se puede observar en el archivo que se encuentra al inicio.

![imagen](https://user-images.githubusercontent.com/71055467/94620975-1b74ca00-0275-11eb-8e0c-dd1f62682d08.png)

En conclusión, lo que aprendimos acerca de esta práctica nos ayudó a aprender a analizar un programa y determinar cual es el mejor método para utilizar dependiendo del problema a resolver, ya que en este caso ambos métodos hacen lo mismo pero no los dos son igual de eficientes hablando en términos de memoria de la computadora, ahora sabemos que para este caso lo mejor a utilizar es el método iterativo, aunque la diferencia no pueda verse pero el método recursivo hace mayor uso de memoria del computador.
