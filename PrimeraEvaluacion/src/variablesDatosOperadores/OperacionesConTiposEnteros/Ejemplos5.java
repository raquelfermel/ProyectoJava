package variablesDatosOperadores.OperacionesConTiposEnteros;

import java.util.Scanner;

public class Ejemplos5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nvalor = sc.nextInt();
        int resultado = ((nvalor + 1) * nvalor + 2) * nvalor + 3;
        System.out.println("el valor de n en la operacion ((n + 1) * n + 2) * n + 3 se ha sustituido por el valor " + nvalor);
        System.out.println("el resultado de la operacion es " + resultado);
    }
}
