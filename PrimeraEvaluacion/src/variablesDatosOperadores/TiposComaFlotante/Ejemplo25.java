package variablesDatosOperadores.TiposComaFlotante;

import java.util.Scanner;

public class Ejemplo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el precio de cada elemento para apicarte el 15% descuento");

        double elemto1 = sc.nextDouble();

        System.out.println(elemto1-(elemto1*15/100));

    }
}
