package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime tu sueldo y te digo si tienes que abonar impuestos");

        int num = sc.nextInt();

        if ( num > 9000 ) {
            System.out.println("lo siento debes abonar impuesto");
        }else {
            System.out.println("vaya parece que te pagan poco no debes pagar impuestos");
        }
    }
}
