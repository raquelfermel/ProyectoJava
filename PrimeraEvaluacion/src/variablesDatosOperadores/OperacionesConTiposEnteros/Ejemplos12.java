package variablesDatosOperadores.OperacionesConTiposEnteros;

import java.util.Scanner;

public class Ejemplos12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe un número de tres cifras");
        String num = sc.nextLine();
        String newNum = "";

        for ( int i = num.length()-1; i >=0 ; --i ){
            newNum+=num.charAt(i);
        }
        System.out.println(newNum);
    }
}
