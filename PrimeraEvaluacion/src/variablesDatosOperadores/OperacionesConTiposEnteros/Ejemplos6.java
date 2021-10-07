package variablesDatosOperadores.OperacionesConTiposEnteros;

import java.util.Scanner;

public class Ejemplos6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Existen x ardillas y k nueces");
        int ardillas = sc.nextInt();
        int nueces = sc.nextInt();
        int division = nueces/ardillas;
        int resto = nueces%ardillas;
        System.out.println("para cada ardilla le corresponde " + division + " nueces y sobran " + resto);
    }
}
