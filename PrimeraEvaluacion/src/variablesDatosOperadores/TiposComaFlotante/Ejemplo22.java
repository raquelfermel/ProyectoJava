package variablesDatosOperadores.TiposComaFlotante;

import java.util.Scanner;

public class Ejemplo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime las notas finales del primer modulo");

        double notas1 = sc.nextDouble();
        double notas2 = sc.nextDouble();
        double notas3 = sc.nextDouble();
        double notaFinal = (notas1+notas2+notas3)/3;
        System.out.println("Nota final: "+notaFinal);

        if ( notaFinal%1 >= 0.5 ){
            notaFinal+=notaFinal%1;
            System.out.println("Nota final arriba: "+notaFinal);
        }else {
            notaFinal-=notaFinal%1;
            System.out.println("Nota final abajo: "+notaFinal);
        }
    }
}
