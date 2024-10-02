import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] array = cargarArray();
        System.out.println("Array desordenado:");
        mostrarArray(array);
        String orden = elegirOrden();
        aplicarMetodo(array, orden);
        System.out.println("Array ordenado:");
        mostrarArray(array);
    }

    public static int[] cargarArray() {
        int[] array = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 20 valores enteros");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void mostrarArray(int[] array) {
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }

    public static String elegirOrden() {
        Scanner sc = new Scanner(System.in);
        String orden;
        while(true) {
            System.out.println("Ingrese orden a realizar: \n1 - ASCENDENTE\n2 - DESCENDENTE");
            int num = sc.nextInt();
            if (num == 1) {
                orden = "ASC";
                break;
            } else if (num == 2) {
                orden = "DESC";
                break;
            } else {
                System.out.println("Error. Ingreso inválido.");
            }
        }
        return orden;
    }

    public static void aplicarMetodo(int[] array, String orden) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese método de ordenamiento a utilizar: \n1 - INSERCIÓN\n2 - BURBUJA\n3 - SELECCIÓN");
            int num = sc.nextInt();
            if (num == 1) {
                AlgoritmosFundamentales.insercion(array, orden);
                System.out.println("El array ha sido ordenado en forma " + orden + " por el método de inserción.");
                break;
            } else if (num == 2) {
                AlgoritmosFundamentales.burbuja(array, orden);
                System.out.println("El array ha sido ordenado en forma " + orden + " por el método de burbuja.");
                break;
            } else if (num == 3) {
                AlgoritmosFundamentales.seleccion(array, orden);
                System.out.println("El array ha sido ordenado en forma " + orden + " por el método de selección.");
                break;
            } else {
                System.out.println("Error. Ingreso inválido.");
            }
        }
    }
}