package variablesDatosOperadores.TiposComaFlotante;

import java.util.Scanner;

public class ejemplo20 {
    public static void main(String[] args) {
        System.out.println("escribe cuatro números");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();

        double suma = num1 + num2 + num3 + num4;
        double media = suma/4;

        System.out.println("la suma total es: " + suma);
        System.out.println("la media total es: " + media);

    }
}
