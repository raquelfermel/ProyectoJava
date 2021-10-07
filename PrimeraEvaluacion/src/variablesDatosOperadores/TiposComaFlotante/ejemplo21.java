package variablesDatosOperadores.TiposComaFlotante;

import java.util.Scanner;

public class ejemplo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime las notas de las tres evaluaciones");
        Double[] notas = new Double[3];
        notas[0] = sc.nextDouble();
        notas[1] = sc.nextDouble();
        notas[2] = sc.nextDouble();

        Double media = (notas[0]+notas[1]+notas[2])/notas.length;
        System.out.println("La media es: " + media);
    }
}
