package variablesDatosOperadores.TiposComaFlotante;

import java.util.Scanner;

public class Ejemplo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dime tus calificaciones de tus tres parciales");
        double mediaParcial = ((sc.nextDouble() + sc.nextDouble() + sc.nextDouble())/3)*55/100;
        System.out.println("calificacion del examen final");
        double exaFinal = sc.nextDouble()*30/100;
        System.out.println("calificacion del trabajo final");
        double tFinal = sc.nextDouble()*15/100;

        System.out.println("media de parciales: " +mediaParcial+ "\n nota del examen: "+exaFinal+"\n nota trabajo final: "+tFinal);
        System.out.println("Nota media: " + mediaParcial + exaFinal + tFinal);




    }
}
