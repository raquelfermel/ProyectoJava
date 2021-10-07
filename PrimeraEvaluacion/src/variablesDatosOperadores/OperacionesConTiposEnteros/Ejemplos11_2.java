package variablesDatosOperadores.OperacionesConTiposEnteros;

import java.util.Scanner;

public class Ejemplos11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número de dos cifras");
        String num = sc.nextLine();
        System.out.println("El número al reves es: " + num.charAt(1) + num.charAt(0) );

    }
}
