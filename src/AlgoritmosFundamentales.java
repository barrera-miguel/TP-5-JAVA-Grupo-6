public class AlgoritmosFundamentales {

    //Algoritmo ordenamiento por insersión
    private static int[] insercionBase(int[] cadena) {
        for (int i = 0; i < cadena.length; i++) {
            int valor = cadena[i];
            int j = i - 1;
            while (j >= 0 && cadena[j] > valor) {
                cadena[j + 1] = cadena[j];
                j--;
            }
            cadena[j + 1] = valor;
        }
        return cadena;
    }

    //Algoritmo de la burbuja
    private static int[] burbujaBase(int[] cadena) {
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < cadena.length; i++) {
                if (cadena[i - 1] > cadena[i]) {
                    int aux = cadena[i - 1];
                    cadena[i - 1] = cadena[i];
                    cadena[i] = aux;
                    intercambiado = true;
                }
            }
        } while (intercambiado == true);
        return cadena;
    }

    //Algoritmo ordenamiento por selección
    private static int[] seleccionBase(int[] cadena) {
        int n = cadena.length;
        for (int i = 1; i < n-1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (cadena[j] < cadena[minimo]  ) {
                    minimo = j;
                }
                int aux = cadena[minimo];
                cadena[minimo] = cadena[i];
                cadena[i] = aux;
            }
        }
        return cadena;
    }

    //Algoritmo búsqueda secuencial
    private static boolean busquedaBase(int[] cadena, int num) {
        int n = cadena.length;
        boolean seEncontro=false;
        for (int i = 0; i < n; i++) {
            if (cadena[i] == num) {
                seEncontro=true;
            }
        }
        return seEncontro;
    }

    //Algoritmo ordenamiento por insersión modificado
    public static void insercion(int[] lista, String orden) {
        for (int i = 1; i < lista.length; i++) {
            int valor = lista[i];
            int j = i - 1;
            if (orden.equals("ASC")) {
                while (j >= 0 && lista[j] > valor) {
                    lista[j + 1] = lista[j];
                    j = j - 1;
                }
            } else if (orden.equals("DESC")) {
                while (j >= 0 && lista[j] < valor) {
                    lista[j + 1] = lista[j];
                    j = j - 1;
                }
            } else {
                System.out.println("Error. Parámetro inválido. Use 'ASC' o 'DESC'.");
                return;
            }
            lista[j + 1] = valor;
        }
    }

    //Algoritmo de la burbuja modificado
    public static void burbuja(int[] lista, String orden) {
        int n = lista.length;
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < n; i++) {
                if (orden.equals("ASC") && lista[i-1] > lista[i]) {
                    int aux = lista[i-1];
                    lista[i-1] = lista[i];
                    lista[i] = aux;
                    intercambiado = true;
                } else if (orden.equals("DESC") && lista[i-1] < lista[i]) {
                    int aux = lista[i-1];
                    lista[i-1] = lista[i];
                    lista[i] = aux;
                    intercambiado = true;
                }
            }
        } while (intercambiado);
    }

    // Algoritmo ordenamiento por selección modificado
    public static void seleccion(int[] lista, String orden) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            int m = i;
            for (int j = i + 1; j < n; j++ ) {
                if (orden.equals("ASC") && lista[j] < lista[m]) {
                    m = j;
                } else if (orden.equals("DESC") && lista[j] > lista[m]) {
                    m = j;
                }
            }
            int aux = lista[m];
            lista[m] = lista[i];
            lista[i] = aux;
        }
    }
}