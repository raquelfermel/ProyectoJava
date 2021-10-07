package variablesDatosOperadores.OperacionesConTiposEnteros;

import java.util.Scanner;

public class Ejemplos9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el tiempo en segundos que quieres pasar a horas");
        int num1 = sc.nextInt();
        int horas = num1/3600;
        int minutos = (num1%3600)/60;
        int segundos = (num1%3600)%60;

        System.out.println("horas: " + horas);
        System.out.println("minutos: " + minutos);
        System.out.println("segundos: " + segundos);
    }
}
