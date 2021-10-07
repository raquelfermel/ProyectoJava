package variablesDatosOperadores.TiposComaFlotante;

import java.util.Scanner;

public class Ejemplo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime tu sueldo base");
        double sBase = sc.nextDouble();
        double extra = sBase*10/100;

        System.out.println("Dime cuantas ventas has realizado estes mes");
        double ventas = sc.nextDouble();
        System.out.println("este mes cobras: " + (sBase + (extra*ventas)));

    }
}
