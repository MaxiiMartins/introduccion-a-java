# **Guía 1**

## **Ejercicios realizado durante los encuentros 1 al 3**

- ### **Ejercicio 1**

     En un nuevo proyecto crear una clase de nombre Producto con los atributos código de tipo entero, descripción un String, precio de tipo double y stock de tipo entero; un constructor que permita inicializar todos sus atributos y los métodos get y set. Desde el método main de clase principal del proyecto instanciar un Producto y luego mostrar por consola el estado de todos sus atributos.

- ### **Ejercicio 2**

     En un nuevo proyecto crear una clase que represente una Computadora, usted determine que atributos describirían mejor a dicho objeto y luego agregue un constructor para inicializar sus atributos y los respectivos métodos getter y setter. Desde el método main de la clase principal del proyecto, instanciar una Computadora y mostrar por consola el estado de todos sus atributos.

- ### **Ejercicio 3**

     En un nuevo proyecto crear una clase de nombre Jugador con los atributos: nombre, puntaje, nacionalidad y edad. Luego un constructor vació y un constructor que inicialice todos sus atributos; agregue además los respectivos métodos getter y setter. Desde el método main de la clase principal del proyecto crear un Jugador utilizando el constructor vacío; luego, a dicho jugador darle de nombre “Juan”, con 140 puntos, de nacionalidad “Argentino” y una edad de 29 años; por último mostrar por consola el estado de cada uno de sus atributos.
  
- ### **Ejercicio 4**

     En nuevo proyecto crear una clase de nombre Perro, cuyos atributos son: nombre, raza, peso y edad. La clase tendrás un constructor que permita inicializar todos sus atributos y los métodos getter y setter. Además agregaremos un método adicional de nombre mostrarInfo que visualizará por consola todos los datos de este animal. Por último, desde el método main de la clase principal del proyecto usted creará un Perro de nombre “Olivia” de raza “Buldog Francés” que pese 1.2Kg con 1 año de edad; en la línea siguiente invocará el método mostrarInfo de la instancia creada anteriormente.
  
- ### **Ejercicio 5**

     En un nuevo proyecto para un juego de ajedrez, nos piden modelar e implementar una clase que representa una Pieza de dicho juego. Usted deberá pensar que atributos serían necesarios para describir las características de dicha clase, agregarle los métodos getter y setter correspondientes y luego probar desde el main de la clase principal del proyecto.

## **Ejercicios realizado durante los encuentros 4 al 10**

- ### **Ejercicio 6**

     En un nuevo proyecto crear una clase de nombre Numero, con un atributo de tipo entero, un constructor que permita inicializar dicho atributo, los métodos getter y setter y los siguientes métodos adicionales:
  - **esPar**: este método retornará true si el valor guardado en el atributo es par, caso contrario retornará false.
  - **esPositivo**: este método retornará true si el valor guardado en el atributo es mayor o igual a cero, caso contrario retornará false.
  - **esMultiploDe**: este método recibirá un valor por parámetro y retornará true si el valor guardado en el atributo es múltiplo del valor recibido, caso contrario retornará false.

- ### **Ejercicio 7**

     En un nuevo proyecto crear una clase de nombre Cuadrilatero con los atributos largo y alto, un constructor que permita inicializar dichos atributos, sus respectivos getter y setter y los siguientes métodos adicionales:
  - **calcularPerimetro()**: este método retornará el perímetro del cuadrilátero.
  - **calcularArea()**: este método retornará la superficie del cuadrilátero.
  - **esUnCuadrado()**: este método retornará true si este cuadrilátero es un cuadrado, caso contrario retornará false.

- ### **Ejercicio 8**

     En un nuevo proyecto, crear una clase de nombre Circulo, con los atributos PI que es una constante con el valor 3.14 y radio; un constructor que permita inicializar el radio del círculo; los métodos “get” y “set” para radio y los siguientes métodos adicionales:
  - **calcularArea()**: este método retornará la superficie del círculo.
  - **calcularPerímetro()**: este método retornará el perímetro del círculo.

- ### **Ejercicio 9**

     En un nuevo proyecto, crear una clase de nombre Conversor con los siguientes métodos estáticos:
  - **convertirAPesos()**: recibe un valor en dólares y retorna convertido a pesos argentinos.
  - **convertirADolar()**: recibe un valor en pesos argentinos y retorna convertido a dólar.

- ### **Ejercicio 10**

     En un nuevo proyecto, crear una clase de nombre Utilitario con una serie de métodos estáticos:
  - **dibujaCuadrado()**: Este método recibe un número entero N, y dibujará un cuadrado de N elementos por lado utilizando el carácter “*”.
  - **elMayorEs()**: Este método recibe 3 números enteros y mostrará por consola cual es el mayor. En caso de ser iguales lo deberá informar.
  - **elDiaEs()**: Se espera que este método reciba un numero entero entre 1 y 7 que corresponderá a un día de la semana, retornando el nombre que le corresponda, por ejemplo: 1 -> Lunes, 2 -> Martes, 3 -> Miércoles, 4 -> Jueves, 5 -> Viernes, 6 -> Sábado, 7  -> Domingo. **Si recibe un valor distinto retornará “No existe ese día!!!”**.

- ### **Ejercicio 11**

     En un nuevo proyecto, crear una clase de nombre Triangulo con los atributos: lado1, lado2, lado3; un constructor que permita inicializar sus atributos; los métodos getter y setter; y los siguientes métodos adicionales:
  - **esUnTriangulo()**: Sabiendo que la regla principal que da origen al triángulo tiene que ver con la longitud de sus lados. Esta plantea que la suma de dos de sus lados debe ser mayor a la longitud del tercer lado. Por lo tanto si los valores de los lados de este triángulo cumplen con la regla este método retornará true caso contrario false.
  - **tipoTriangulo()**: Si es un triángulo y tiene sus tres lados iguales, este método retornará equilátero; si sus tres lados son distintos, retornará “escaleno”; caso contrario, es decir, si sólo dos de sus lados son iguales, retornará “isósceles”; en el caso de que no sea un triángulo, retornará “Con sus lados no se puede representar un triángulo!!!”

- ### **Ejercicio 12**

   En un nuevo proyecto, crear una clase de nombre Robot con los atributos: batería inicializado en 500 unidades de energía y nombre; un constructor que permita inicializar únicamente a su atributo nombre; los métodos getter y setter para sus atributos y los siguientes métodos adicionales:
  - **avanzar()**: Este método recibirá la cantidad de pasos que deberá dar el robot, sabiendo que por cada 100 pasos consume 10 unidades de energía y que sólo avanzará si hay batería suficiente.
  - **bateriaVacia()**: Este método retornará true, sólo cuando la batería quede con un valor menor o igual a cero.

- ### **Ejercicio 13**

   En un nuevo proyecto, crear una clase de nombre Calculo con los siguientes métodos estáticos:
  - **esPrimo()**: Este método recibe un número entero y retorna true si el número recibido es primo, caso contrario retornará false.
  - **valorAbsoluto()**: Este método recibe un número entero y retorna su valor absoluto.
  - **calcularRices()**: Este método recibe los coeficientes a, b y c de una ecuación de segundo grado y mostrará por consola sus raíces y si no las tiene también lo informará.

- ### **Ejercicio 14**
  
  En un nuevo proyecto, crear una clase de nombre Pensador con un atributo que almacenará un valor entero; un constructor que permita inicializar dicho atributo; los métodos get y set para dicho atributo y los siguientes métodos adicionales:
  - **invertir()**: Este método retornará el valor guardado en el atributo con sus cifrasinvertidas. Por ejemplo si el valor guardado es 3915, retornará 5193
  - **parAntes()**: Este método retornará el valor par próximo anterior al valor guardado.
  - **parPosterior()**: Este método retornará el valor par próximo posterior al valor guardado.
  - **primerDigito()**: Este método retornará el primer dígito del valor guardado.
  - **ultimoDigito()**: Este método retornará el último dígito del valor guardado.
