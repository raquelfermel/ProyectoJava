package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿es fin de semana(si/no)?");
        String finde = sc.nextLine();
        System.out.println("cuantas tazas de mantequillas has bebido?");
        int tazas = sc.nextInt();

        if (tazas >=10 && tazas <=20 && finde.equals("si")){
            System.out.println("muy bien ardillita :)");
        }else if ( tazas >= 15 && tazas <= 25 && finde.equals("no") ){
            System.out.println("Te has pasado con la mantequilla e_e");
        }else {
            System.out.println("No se que hacer contigo ardilla");
        }
    }
}
