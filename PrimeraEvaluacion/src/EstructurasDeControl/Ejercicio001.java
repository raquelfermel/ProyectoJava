package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escribe un numero y te digo si es par");

        int num = sc.nextInt();
        if ( num%2 == 0 ) {
            System.out.println(num + " es par");
        } else {
            System.out.println(num+" no es par");
        }


    }
}
