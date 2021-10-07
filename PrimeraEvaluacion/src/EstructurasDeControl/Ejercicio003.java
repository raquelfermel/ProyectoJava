package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime dos numeros y te digo si el primero es mayor que el segundo");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El primero es mayor");
        }else  {
            System.out.println("El primer es menor");
        }
    }
}
