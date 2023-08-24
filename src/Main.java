
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int[][] matriz;

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

        matriz = new int[Filas][Columnas];

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

        for(int j=0; j < matriz[fila].length; j ++) {
            System.out.print(matriz[fila][j] + " ");
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

    public static void opcionesMenu() {
        System.out.println("\nBienvenido! Que desea realizar?");
        System.out.println("[0] Salir\n" +
                "[1] Crear y rellenar la matriz\n" +
                "[2] Mostrar la matriz\n" +
                "[3] Mostrar una fila seleccionada\n" +
                "[4] Matriz Cero\n");
        System.out.println("Respuesta: ");
    }

    public static void menu(){

        boolean continuar = true;
        while (continuar) {
            opcionesMenu();
            Scanner Leer = new Scanner(System.in);
            int seleccion = Leer.nextInt();

            if (seleccion == 0) {
                continuar = false;
            }

            if (seleccion == 1) {
                int Filas = ingresarNumero();
                while (validarNumero(Filas) != true) {
                    Filas = ingresarNumero();
                }
                int Columnas = ingresarNumero();
                while (validarNumero(Columnas) != true) {
                    Columnas = ingresarNumero();
                }
                int[][] matriz = crearMatriz(Filas, Columnas);
                llenarMatriz(matriz);

            }

            if (seleccion == 2) {
                mostrarMatriz(matriz);
            }

            if (seleccion == 3) {
                System.out.println("Ingrese el numero de la fila:");
                int Fila = Leer.nextInt();
                mostrarFila(matriz, Fila);
            }

            if (seleccion == 4) {
                System.out.println(matrizCero(matriz, matriz.length, matriz[0].length ));
            }

        }

    }
}