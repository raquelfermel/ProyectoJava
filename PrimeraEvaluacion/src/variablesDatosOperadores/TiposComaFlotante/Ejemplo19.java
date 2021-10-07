package variablesDatosOperadores.TiposComaFlotante;

import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe dos pares de numeros");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double distancia = Math.sqrt( Math.pow((x2-x1),2) + Math.pow( (y2-y1),2 ) );
        System.out.println("la distancia entre el punto A("+x1+","+y1+") y el punto B("+x2+","+y2+") = " + distancia);

    }
}
