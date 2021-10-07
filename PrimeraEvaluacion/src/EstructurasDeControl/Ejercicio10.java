package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe números y te los ordeno");

        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
            // 100 50 1
        if ( num>num2 && num>num3 && num2>num3){
            System.out.println("primer if - " + num +" "+ num2 + " " + num3);
            //50 100 1
        }else if ( num2>num && num2>num3 && num>num3) {
            System.out.println("segundo if - " + num2 +" "+ num + " " + num3);
            //1 50 100
        }else if (num3>num2 && num3>num && num2>num){
            System.out.println("tercer if - " + num3 +" "+ num2 + " " + num);
        }else{
            System.out.println("algo esta mal");
        }
    }
}
