import java.util.Scanner;

public class Ejercicio5 {
    static Scanner sc = new Scanner(System.in);
    private static int [][]matriz;
    private int x;
    private int y;
    public  int[][] cargaArray () {
        do{
            System.out.println("Ingrese 2 valores mayores o iguales a 2 para filas y columnas");
            System.out.print("X: ");
            x = sc.nextInt();
            System.out.print("Y: ");
            y = sc.nextInt();
            if(x<2 || y<2){
                System.out.println("ERROR uno o más valores no es igual o mayor a 2!");
            }
        }while (x<2 || y<2);
        matriz = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Ingrese el entero de la pos " +"[" +i +"]" +"[" +j +"]");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }
    public void mostrarMatriz(int clase [][]) {
        System.out.println("------------");
        System.out.println("---MATRIZ---");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(clase[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------");
    }
    public int promedio(int[][] clase){
        int suma=0;
        int totalElementos = x*y;
        for (int i=0;i<clase.length;i++){
            for (int j=0;j<clase[i].length;j++){
                suma += clase[i][j];
            }
        }
        int promedio = suma/totalElementos;
        return promedio;
    }
    public void busqueda(int [][] clase, double num){

        boolean seEncontro=false;
        System.out.println("--BUSQUEDA--");
        int contador = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(clase[i][j]==num){
                    seEncontro=true;
                    if (contador==0){
                        System.out.println("Valor promedio encontrado en:");
                    }
                    System.out.println("[" +i+"]" +"[" +j+"]");
                    contador++;
                }
            }
        }
        if(seEncontro==false){
            System.out.println("No se encontró ninguna coincidencia");
        }
    }
}
