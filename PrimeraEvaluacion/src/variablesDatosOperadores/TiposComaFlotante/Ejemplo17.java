package variablesDatosOperadores.TiposComaFlotante;

import java.util.Scanner;

public class Ejemplo17 {
    public static void main(String[] args) {
        int base = 2;
        int altura = 2;
        int calTriangulo = (base*altura)/2;

        float baseF = 2;
        float alturaF = 2;
        float calTrianguloF = (baseF*alturaF)/2;

        System.out.println("el area en int es: " + calTriangulo + " el area en float es: " + calTrianguloF);
    }
}
