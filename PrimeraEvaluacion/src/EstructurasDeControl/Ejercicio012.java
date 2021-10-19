package EstructurasDeControl;

import java.time.Clock;
import java.util.Scanner;

public class Ejercicio012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime cuanto cuesta el kilo de uva en € ");
        double kiloUva = sc.nextDouble();
        System.out.println("que tipo de uva quieres comprar A o B");
        String tipoUva = sc.nextLine();
        System.out.println("que tamaño quieres ? 1 o 2");
        int tamanoUva = sc.nextInt();
        double precioFinal = 0;

        if ( tipoUva.equals("A")){
            if ( tamanoUva == 1){
                precioFinal = (kiloUva * 100 + 20)/100;
            }else if ( tamanoUva == 2 ){
                precioFinal = (kiloUva * 100 + 30)/100;
            }else {
                System.out.println("Solo tamaño 1 o 2 listillo");
            }
        }else if( tipoUva.equals("B") ){
            if ( tamanoUva == 1){
                precioFinal = (kiloUva * 100 - 20)/100;
            }else if ( tamanoUva == 2 ){
                precioFinal = (kiloUva * 100 - 30)/100;
            }else {
                System.out.println("Solo tamaño 1 o 2 listillo");
            }
        }else {
            System.out.println("Solo tipo A o B listillo");
        }

        System.out.println("tienes que pagar: " + precioFinal);

    }
}
