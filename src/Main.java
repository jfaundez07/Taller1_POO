import java.sql.PseudoColumnUsage;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //menu();
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
                matriz[i][j] = generarNumero.nextInt(1,10);;
            }
        }

        return matriz;
    }

}