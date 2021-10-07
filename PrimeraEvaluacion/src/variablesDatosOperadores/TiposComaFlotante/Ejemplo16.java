package variablesDatosOperadores.TiposComaFlotante;

import java.util.Scanner;

public class Ejemplo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el lado de un cuadrado, y te calculo el perimetro ;-)");
        double lado = sc.nextDouble();
        double area = lado*4;
        System.out.println("el perimetro es: " + area);
    }
}
