package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eres inocente(si) o culpable(no)");
        String verdad = sc.nextLine();
        if (verdad.equals("si")){
            System.out.println("Ah! eres inocente");
        }else  {
            System.out.println("eres culpable !! a la horca!!");
        }
    }
}
