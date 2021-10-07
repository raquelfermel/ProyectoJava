package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio007 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Eres inocente(true) o culpable(false)");
        boolean verdad = sc.nextBoolean();

        if (verdad){
            System.out.println("Ah! eres inocente");
        }else  {
            System.out.println("eres culpable !! a la horca!!");
        }

    }
}
