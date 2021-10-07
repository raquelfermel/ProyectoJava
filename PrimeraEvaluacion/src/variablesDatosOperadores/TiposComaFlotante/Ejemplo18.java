package variablesDatosOperadores.TiposComaFlotante;

import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String[] args) {
        System.out.println("dime la temperatura en grados centigrados");
        Scanner sc = new Scanner(System.in);
        double centigrados = sc.nextDouble();
        double reamur = centigrados*0.8;
        double fahenheit = (centigrados*9/5)+32;
        double kelvin = centigrados+273;

        System.out.println("reamur: " + reamur);
        System.out.println("fahenheit: " + fahenheit);
        System.out.println("kelvin: " + kelvin);
    }
}
