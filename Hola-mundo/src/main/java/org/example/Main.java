package org.example;

// Importaciones siempre van al inicio
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hola mundo desde Java!\n");

        // Una multiplicación de dos números
        int a = 6;
        int b = 7;
        int resultado = a * b;
        System.out.println("Resultado: " + resultado);

        //4.INVESTIGACION
        //4.1 Arreglos
        //En java los arreglos son objetos que almacenan multiples variales del mismo tipo. Tienen un tamaño fijo una vez creados.
        //Forma 1: tamaño explicito, se utiliza cuando sabes cuantos elementos necesitas,
        //pero no sabes sus valores java rellena el arreglo con valores por defecto(0 para números, null para objetos, false para booleanos).

        //Ejemplo de la forma 1 arreglo con capacidad de 5 elementos
        // (Nota: He movido esto dentro del main para que se ejecute)
        int [] numeros = new int [5];
        //asignacion manual
        numeros [0] = 10;
        numeros [4] = 50;

        //Forma 2: declaracion e inicializacio literal se utiliza cuando conoces los valores
        //desde el principio. No es necesario especificar el tamaña

        //Ejemplo de la forma 2 arreglo de 5 elementos con valores especificos
        int[] valores = {1, 2, 3, 4, 5};
        //tambien se puede con cadenas
        String[] nombres = {"Ana", "Luis", "Pedro"};

        //4.2 Metodos y utilidades principales para arreglos
        //La clase java.util.Arrays es una caja de herramientas esencial para manipular arreglos,
        // ya que los arreglos nativos no tienen muchos métodos propios.

        //Ejemplos de los 5 metodos
        System.out.println("\n--- 4.2 Demo Arrays ---");
        int[] datos = {9, 5, 1, 8, 3};

        // 1. Arrays.toString(): Convierte el arreglo a texto legible para imprimirlo
        System.out.println("Original: " + Arrays.toString(datos));

        // 2. Arrays.sort(): Ordena el arreglo (algoritmo Dual-Pivot Quicksort)
        Arrays.sort(datos);
        System.out.println("Ordenado: " + Arrays.toString(datos)); // [1, 3, 5, 8, 9]

        // 3. Arrays.binarySearch(): Busca un elemento en un arreglo ORDENADO
        // Devuelve el índice si lo encuentra, o un número negativo si no.
        int indice = Arrays.binarySearch(datos, 8);
        System.out.println("El 8 está en el índice: " + indice);

        // 4. Arrays.copyOf(): Crea un nuevo arreglo copiando el original (útil para redimensionar)
        // Aquí creamos uno nuevo con mayor capacidad (7 elementos)
        int[] datosExpandidos = Arrays.copyOf(datos, 7);
        System.out.println("Expandido: " + Arrays.toString(datosExpandidos)); // [1, 3, 5, 8, 9, 0, 0]

        // 5. Arrays.fill(): Rellena todo el arreglo (o una parte) con un valor específico
        Arrays.fill(datosExpandidos, -1);
        System.out.println("Relleno: " + Arrays.toString(datosExpandidos)); // [-1, -1, -1, -1, -1, -1, -1]

        // Extra: Arrays.equals(): Compara si dos arreglos tienen exactamente el mismo contenido
        boolean sonIguales = Arrays.equals(datos, new int[]{1, 3, 5, 8, 9});
        System.out.println("¿Es igual a la copia manual?: " + sonIguales); // true


        //4.3 como se recorren los arreglos en java (existen tres paradigmas principales)

        //1.Bucle For Tradicional(por indice)
        //es el  mas flexible. Permite modificar el arreglo original y acceder a la posicion i

        //ejemplo bucle for tradicional
        // (Nota: Renombramos la variable porque 'numeros' ya existía arriba)
        int [] numerosEjemplo = {10, 20, 30};

        System.out.println("\n--- For Tradicional ---");
        for (int i = 0; i < numerosEjemplo.length; i++){
            System.out.println("Indice " + i + ": " + numerosEjemplo[i]);
        }

        //2. Bucle For-Each(For mejorado)
        //Es mas limpio y legible. Se usa cuando solo necesitas leer los valores y no te importa
        //el indice. No permite modificar la estructura del arreglo facilmente.

        //ejemplo bucle for-each
        System.out.println("--- For-Each---");
        for (int num : numerosEjemplo) {
            System.out.println("Valores:" + num);
        }

        //3. Java Streams(Programacion Funcional)
        //introducido en Java 8. Permite operaciones concisas y procesamientos de datos
        //enb una sola linea

        //ejemplo Java Streams
        System.out.println("--- Streams ---");

        Arrays.stream(numerosEjemplo).forEach(n -> System.out.println("Stream:" + n));

        System.out.println("--- Stream con Filtro (>15) ---");
        Arrays.stream(numerosEjemplo)
                .filter(n -> n > 15)
                .forEach(System.out::println);


        //4.4 Diferencia entre Arreglos y ArrayList en Java

        //caracsteristica-----------Arreglo(Array)--------------------------ArrayList
        //tamaño                    Fijo.Se define al crearlo y no          Dinamico.Crece y se reduce
        //                          se puede cambiar.                       automaticamente
        //tipos de datos            Admite premitivos (int, char)           Solo admite objetos(usa Integer en vez de int)
        //                          y objetos
        //rendimiento               Mas rapido y consume menos memoria      Ligeramente mas lento debido a la gestion
        //                                                                  dinamica
        //Sintaxis                  Usa corchetes [] y propiedad            Usa metodos .add(), .get(), .size().
        //                          .length
        //Funcionalidad             Basica (alamacenamiento simple)         Avanzada (metodos para insertar, borrar, buscar)


        //¿Cuando usar cada uno?

        //1. Arreglos [] cuando:
        //-conoces el tamaño exacto de los datos
        //-necesitas el maximo rendimiento posible
        //-trabajas con grandes cantidades de datos primitivos(int, double) y quieres
        //evitar la sobrecarga de objetos

        //2. ArrayList cuando:
        //-no sabes cuantos datos vas a recibir
        //-necesitas insertar o eliminar elemtos frecuentemente en medio de la lista
        //-prefieres comodidad y metodos listos para usar sobre un rendimiento extremo
    }
}