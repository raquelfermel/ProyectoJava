package variablesDatosOperadores.OperacionesConTiposEnteros;

import java.util.Scanner;

public class Ejemplos11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero de dos digitos");
        String num = sc.nextLine();
        System.out.println( "el segundo numero es " + num.charAt(0));
    }
}
