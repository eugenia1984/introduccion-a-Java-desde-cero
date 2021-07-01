# Curso Udemy Introduccion a Java desde cero

## Curso  de Jesús Gimenez

## ¿ Qué hice ?

**Proyecto: Hola Mundo**  <br>

Dentro del proyecto tengo los siguientes paquetes:  <br>

**holamundo** : el primer Hola Mundo en Java.  <br>

**clase1**: veo los comentarios, de una sola línea ( // )  y multilínea ( /* */).<br>
Y los comentarios JavaDOC /* * */ con los @. <br> 

**variables** : veo los tipos de variables: boolean, char, string, byte, short, int, long, float, double.<br>
También las constantes. <br>
Las imprimo con **System.out.println** y **concateno** string con variable. <br>

**ejemploCasting** : puedo poner un INT dentro de un FLOAT, pero no la reves por tema de memoria, entonces debo pasar el FLOAT a INT, mediante carting: **(int)**.<br>
También puedo pasar de INT a CHAR, con casting: **(char)**. <br>
También puedo pasar de String a int con **Integer.parseInt()** o de int a string con **Integer.toString()**. <br>


---


### Variables

Se ejecutan en la memoria RAM. <br>
Al declarar una variable, se genera un 'cajon' en la MEMORIA RAM que guarda un dato, que puede ser un número entero, uan cadena de caracteres, un caracter. <br>
Dependiendo del tipo de dato que guardo, puedo ocupar más o menos memoria. <br>
Es **variable** porque su valor puede ir cambiando a lo largo de mi prigrama. <br>
Puedo **variar el contenido de una variable, siempre y cuando sea del mismo tipo que la declare**. <br>

¿Cómo la declaro ? <br>

**tipoDeVarible** **nombreDeLaVariable** = **valorDelaVariable**; <br>


### Constantes

También son un 'cajon' para guardar información, pero al declararla le debo asginar un valor, y ese valor no cambia mientras se ejecute el programa. <br>

¿ Cómo se declaran ? <br>

**final** **tipoDeConstante** **NOMBRECONSTANTE** = **valorDeCosntante**; <br>

Al tener el nombre en mayúscula, se que es constante y no es variable. <br>
 

### Tipo de variables - primitivas

-BOLEANO: <br>

**Boolean** <br>
True / False <br>
1 bit <br>
False es el valor por defecto <br>

-CARACTER: <br>

**char** <br>
caracter unicode <br>
16 bits <br>
\u0000 valor por defecto<br>
Cada caracter tiene un valor ASCCI. <br>
siempre van entre comillas simpleas. <br>

-ENTEROS: <br>
**short** <br>
entero con signo<br>
8 bits <br>
0 valor por defecto <br>

**int** <br>
entero con signo<br>
32 bits <br>
0 valor por defecto <br>

**long** <br>
entero con signo<br>
64 bits <br>
0 por defecto <br>
Siempre al asignar un valor debo indicarle al final una **l** o **L**, sino comila como int. <br>

-REALES: <br>

**float** <br>
coma flotante de presicion simplre <br>
32 bits <br>
0.0 valor por defecto <br>
siempre al asignarle un valor al final debo indocar **f** o **F**, sino el compilador entiende que es un double, que es más preciso. <br>

**double** <br>
coma flotante de precision doel <br>
64 bits <br>
0.0 valor por defecto <br>


### String - tipo de variable no primitiva, es un objeto

Van entre comillas dobles. <br>
El lenguaje Java me permite luego manejarla como un objeto con los métodos, como por ejemplo: <br>

**.charAt()** para localizar un caracter dentro de la cadena<br>

**.equals()** para comparar dos cadenas y saber si son iguales<br>

**.isEmpty()** para saber si la cadena está vacía, si no tiene texto<br>

**.lenght()** para saber la longitud de la cadena.<br>

**.replace()** para sustituir un caracter por otro. <br>


### Concatenar

Tengo una cadena y una varaible, concatenada con **+** . <br>

### Casting

Para pasar de un tipo **ENTERO** a un tipo **DECIMAL** o vice versa. <br>

También está el **CASTING COMPLEJO** .<br>


```
int numero = Integer.parseInt("10");  //paso de CADENA a ENTERO

String cadena = Integer.toString(10);  //paso de ENTERO a CADENA
```


---


### Características del lenguaje Java

1- Sensible a mayúsculas y minúsculas, es **case sensitive** , y se aplica a varaible, matriz, objeto, método, a todo. <br>

2- Soporta comentarios JavaDoc. JavaDoc es una librería de Oracle que nos permite documentar. No es lo mismo que los comentarios en línea // y los comentarios multilínea /* */. <br>
Nos genera un fichero con toda al documentación.  <br>
Es un informe en HTML.  <br>
En mi proyecto, click derecho -> Generar JavaDoc, y me abre una página HTML. <br>

3- Lenguaje de formato libre. <br>
Puedo escribir: <br>


```
System.out.
         println
 ("Hola mundo!"),
```

Pero en este caso, por buenas prácticas, no es recomendable.<br>
NetBeans nos da como sugerencia con una linea roja fina, de no pasarnos hasta ahí.<br>
Si nos sirve para una matriz, por ejemplo: <br>

```
int[] matriz = {
                1,2,3,4,5
                };
```
 

4- Lenguaje orientado a objetos.  <br>
Salvo los tipos primitivos (las variables), todo lo demás es un **objeto**. <br>
La Programación orientada a objeto es una forma de programar. <br>


5- Garbage Collector <br>
Es un recolector de basura, todo lo que declaramos ocupa memoria, el garbage colector ve nuestro código fuente, y si ve que una varaible no se usa la libera de la memoria.<br>


---


## ALGORITMO


Es un conjunto de pasos lógicos, ordenados, finitos , que siempre dan el mismo resultado, para resolver un problema. <br>
Tienen: <br>
  * Inicio
  * Entrada
  * Proceso
  * Salida
  * Fin


Un ejemplo de la visa real, para ir al cine:
  * ver la cartelera
  * Elegir la pelicula
  * Comprar los tickets
  * Ingresar a la sala
  * Ver la película
  
  
---


## PALABRAS RESERVADAS

No se pueden usar para llamar a una variable, una constante, funciones o un método dentro de mi algoritmo. <br>
Algunos ejemplos: int, public, static, void. <br>


---


## ESTRUCTURA DE UN PROGRAMA EN JAVA

1- Todos los programas en java están formados por **CLASES** . Por ejemplo: <br>


```
public class ejemplo {

}
```


2- Lo que vamos a necesitar: las varaibles de entrada y salida <br>


3- El método main, el que inicializa cualquier programa en Java, por ejemplo: <br>


```
public class ejemplo {

    public static void main (String[] args) {

    }
}    
```


4- Dentro del main se realizan todas las operaciones. <br>


---



