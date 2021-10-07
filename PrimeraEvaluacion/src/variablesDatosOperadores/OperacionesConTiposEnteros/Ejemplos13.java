package variablesDatosOperadores.OperacionesConTiposEnteros;

import java.util.Scanner;

public class Ejemplos13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la cantidad de euros");
        int num = sc.nextInt();

        int bilCien = num/100;//2 - 32
        int bilVeinte = (num%100)/20;//1- 12
        int bilDiez = ((num%100)%20)/10;//1
        int monedas = ((num%100)%20)%10;

        System.out.println(bilCien + " Billete de 100 ");
        System.out.println(bilVeinte + " Billete de 20 ");
        System.out.println(bilDiez + " Billetes de 10 ");
        System.out.println(" y sobran " + monedas );



    }
}
