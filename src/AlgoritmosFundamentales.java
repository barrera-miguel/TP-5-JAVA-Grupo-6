public class AlgoritmosFundamentales {

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