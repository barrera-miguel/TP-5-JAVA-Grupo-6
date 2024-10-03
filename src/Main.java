import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num2;
        System.out.println("----------------------------------- \n¡Bienvenido al Trabajo Práctico 5!\n-----------------------------------");
        System.out.println("Grupo: 6 \nIntegrantes: - Miguel Barrera - Emilia Barros -  Federico Frankenberger  - Guadalupe Maricchiolo - \n-----------------------------------");
        System.out.println("-Ingrese-\n1 / Continuar \n2 / Salir\n-----------------------------------");
        do {
            num = sc.nextInt();
            switch (num) {
                case 1:
                    do {
                        System.out.println("------------\n EJERCICIOS \n------------");
                        System.out.println("-Ingrese-\n-- 1 a 5 para ejercicios\n-- 6 para salir");
                        num2 = sc.nextInt();
                        switch (num2) {
                            case 1:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 1:");
    /*Algoritmos de Ordenación:
- Ordenamiento por Inserción:
Funciona construyendo una secuencia ordenada de elementos, insertando cada nuevo elemento en la posición adecuada.
-Algoritmo de la burbuja:
Este algoritmo consiste en comparar cada elemento de la lista con el siguiente (por parejas), si no están en el orden correcto, se intercambian entre sí sus valores.
- Ordenamiento por selección: Se recorre toda la lista buscando el menor de todos los elementos, una vez terminada la recorrida el menor elemento se coloca al inicio de la lista recorrida.
                              En la siguiente iteración se recorre nuevamente la lista pero comenzando en el segundo elemento.
Algoritmo Quick-Sort: El algoritmo original es recursivo, pero se utilizan versiones iterativas para mejorar su rendimiento. Tiene la propiedad de trabajar mejor para elementos de entrada desordenados completamente que para elementos semiordenados.
    Algoritmos de Búsqueda:
- Búsqueda Secuencial: Este algoritmo busca el elemento dado, recorriendo secuencialmente la lista desde un elemento al siguiente, comenzando en la primera posición de la lista y se detiene cuando encuentra el elemento buscado o bien se alcanza el final de la lista sin haberlo encontrado.
                       La búsqueda secuencial es el méttodo utilizado para listas no ordenadas.
- Búsqueda Binaria: Este algoritmo se utiliza cuando disponemos de una lista ordenada, lo que nos permite facilitar la búsqueda, ya que podemos ir disminuyendo el espacio de búsqueda a segmentos menores a la lista original y completa.
Algoritmos de Recorrido:
- Recorrido de Profundidad: El proceso exige un camino desde el nodo raıź a través de un hijo, al descendiente más lejano del primer hijo antes de proseguir a un segundo hijo.
- Recorrido de Anchura: El proceso se realiza horizontalmente desde el raıź a todos sus hijos, a continuación, a los hijos de sus hijos y así ́ sucesivamente hasta que todos los nodos han sido procesados.*/
                                break;
                            case 2:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 2:");
                                //En class AlgoritmosFundamentales
                                break;
                            case 3:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 3:");
                                //En class AlgoritmosFundamentales
                                break;
                            case 4:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 4:");
                                Ejercicio4.main(args);
                                break;
                            case 5:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 5:");
                                Ejercicio5 clase = new Ejercicio5();
                                int [][] array = clase.cargaArray();
                                clase.mostrarMatriz(array);
                                int promedio  = clase.promedio(array);
                                System.out.println("--PROMEDIO--"+"\n" +promedio);

                                System.out.println("------------");
                                clase.busqueda(array, promedio);
                                break;
                            case 6:
                                System.out.println("-------------------------------------");
                                System.out.println("Gracias por su corección!");
                                System.out.println("-------------------------------------");
                                num = 2;
                                break;
                            default:
                                System.out.println("--------------------------------------------------");
                                System.out.println("ERROR - número fuera de rango - vuleva a intentar!");
                                System.out.println("--------------------------------------------------");
                        }
                    } while (num != 2);
                case 2:
                    System.out.println("--------");
                    System.out.println("Gracias!");
                    System.out.println("--------");
                    break;
                default:
                    System.out.println("- Número fuera de rango - Intente nuevamente -\n1 / Continuar \n2 / Salir");
            }
        } while (num != 2);
    }
}