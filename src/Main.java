import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //menu();
    }
    public static int ingresarNumero() {

        Scanner Leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int numero = Leer.nextInt();

        return (numero);
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
}