package variablesDatosOperadores.TiposComaFlotante;

import java.util.Scanner;

public class Ejemplo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el precio de un producto y su IVA");

        double pVenta = sc.nextDouble();
        double iva = sc.nextDouble();
        double cantidad = sc.nextDouble();

        System.out.println("el precio a abonar es "+((pVenta*cantidad)+(pVenta*iva)/100) + "€");

    }
}
