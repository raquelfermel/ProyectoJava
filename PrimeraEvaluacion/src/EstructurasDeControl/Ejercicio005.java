package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int minNum = 0;
        int maxNum = 0;

        for ( int i = 0; i < 10; i++){
            num = sc.nextInt();
            if ( i == 0 ){
                minNum=num;
                maxNum=num;
            }else if ( num>maxNum ){
                maxNum=num;
            }else{

            }
        }
    }
}
