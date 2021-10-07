package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        if (year%4 == 0){
            System.out.println("parece que este año es bisiesto");
        }
    }
}
