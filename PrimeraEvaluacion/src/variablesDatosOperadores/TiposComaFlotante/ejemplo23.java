package variablesDatosOperadores.TiposComaFlotante;

import java.util.Scanner;

public class ejemplo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero y un porcentaje");
        double num = sc.nextDouble();
        double portcen = sc.nextDouble();
        System.out.println(num + " mas el" + portcen + "% es " + (num+(num*portcen)/100));
        System.out.println(num + " menos el " + portcen + "% es " + (num-(num*portcen)/100));

    }
}
