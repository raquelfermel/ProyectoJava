package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean jasp = false;
        int edad = sc.nextInt();
        int nivelDeEstudios = sc.nextInt();
        int ingresos = sc.nextInt();

        if ( edad <= 28 && nivelDeEstudios > 3 || edad < 30 && ingresos > 28000) {
            jasp = true;
            System.out.println(jasp);
        }else{
            System.out.println(jasp);
        }
    }
}
