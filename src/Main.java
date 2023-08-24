import java.sql.PseudoColumnUsage;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       menu();
    }

    public static int ingresarNumero() {

        Scanner Leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int numeroIngresado = Leer.nextInt();

        return (numeroIngresado);
    }

    public static boolean validarNumero(int numeroValidar) {

        boolean validacion;

        if (numeroValidar > 0)
        {
            validacion = true;
        }
        else
        {
            validacion = false;
        }

        return validacion;
    }

    public static int[][] crearMatriz(int Filas, int Columnas) {

        int[][] matriz = new int[Filas][Columnas];

        return matriz;
    }

    public static int[][] llenarMatriz(int[][] matriz) {

        Random generarNumero = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarNumero.nextInt(0,10);;
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarFila (int matriz[][], int fila){

        for(int i=0; i < matriz.length; i ++) {
            System.out.println(matriz[fila][i] + " ");
        }
    }

    public static boolean matrizCero(int [][] matriz, int cantFilas, int cantColumnas) {

        int total = cantFilas * cantColumnas;
        boolean esMatrizCero;
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    contador ++;
                }
            }
        }

        if (contador >= total/2)
        {
            esMatrizCero = true;
        }
        else {
            esMatrizCero = false;
        }


        return (esMatrizCero);
    }

    public static void menu(){
        System.out.println("Bienvenido! Que desea realizar?");
        System.out.println("[0] Salir\n" +
                "[1] Crear la matriz" +
                "[2] Rellenar la matriz" +
                "[3] Mostrar la matriz" +
                "[4] Mostrar una fila seleccionada" +
                "[5] Matriz Cero" );

        //menu();
        //int Filas = ingresarNumero();
        //int Columnas = ingresarNumero();
        //int [][] matriz = crearMatriz(Filas, Columnas);
        //llenarMatriz(matriz);
        //mostrarMatriz(matriz);
        //System.out.println(matrizCero(matriz, Filas, Columnas));
    }
}