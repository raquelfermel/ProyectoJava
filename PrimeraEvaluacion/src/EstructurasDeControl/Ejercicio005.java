package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int minNum = 0;
        int maxNum = 0;

        for ( int i = 0; i < 10; i++){
            num = sc.nextInt();
            if ( i==0 || num <= minNum ){
                minNum=num;
            }else{
                maxNum=num;
            }
        }
        System.out.println("numero  menor: " + minNum);
        System.out.println("numero  mayor: " + maxNum);
    }
}
