package variablesDatosOperadores.OperacionesConTiposEnteros;

import java.util.Scanner;

public class Ejemplos8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe la cantidad de minutos quequieres que convierta a horas");
        int minutos = sc.nextInt();
        int horas = minutos/60;
        int minutosRestantes = minutos%60;
        System.out.println(minutos+" son "+horas+ " y " + minutosRestantes + " minutos");
    }
}
