package variablesDatosOperadores.OperacionesConTiposEnteros;

import java.util.Scanner;

public class Ejemplos4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe cuatro números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println("La suma de " + num1 +" y " + num2 +" es " + (num1+num2));
        System.out.println("La multiplicacion de " + num1 +" y " + num2 +" es " + (num1*num2));


    }
}
