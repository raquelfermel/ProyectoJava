package variablesDatosOperadores.BooleanYOperadoresLogicos;

import java.util.Scanner;

public class Ejemplo34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        System.out.println(num!=num2 && num!=num3);
    }
}
