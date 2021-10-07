package variablesDatosOperadores.BooleanYOperadoresLogicos;

import java.util.Scanner;

public class Ejemplo32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println(num < 10 && num > 0);

    }
}
