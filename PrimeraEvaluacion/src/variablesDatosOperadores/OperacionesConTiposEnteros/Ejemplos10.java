package variablesDatosOperadores.OperacionesConTiposEnteros;

import java.util.Scanner;

public class Ejemplos10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe dos tiempos diferentes en formato horas minutos y segundos para que se calcule el tiempo transcurrido");
        int numHora = sc.nextInt();
        int numMinutos = sc.nextInt();
        int numSegundos = sc.nextInt();
        System.out.println("primer tiempo " + numHora +":"+numMinutos+":"+numSegundos);
        int numHora2 = sc.nextInt();
        int numMinutos2 = sc.nextInt();
        int numSegundos2 = sc.nextInt();
        System.out.println("segundo tiempo " + numHora2 +":"+numMinutos2+":"+numSegundos2);
        //descomponer primer tiempo
        int calcHoras = numHora*3600;
        int calcMinutos = numMinutos*60;
        int calcSegundos = numSegundos;
        int totalSec = calcHoras+calcMinutos+calcSegundos;
        //descomponer segundo tiempo
        int calcHoras2 = numHora2*3600;
        int calcMinutos2 = numMinutos2*60;
        int calcSegundos2 = numSegundos2;
        int totalSec2 = calcHoras2+calcMinutos2+calcSegundos2;
        //calculo de segundos entre dos tiempos
        int tiempotranscurrido= totalSec2-totalSec;
        int horasTranscurridas = tiempotranscurrido/3600;
        int minutosTranscurridos = (tiempotranscurrido%3600)/60;
        int segundosTranscurridos = (tiempotranscurrido%3600)%60;

        System.out.println("Ha pasado " + horasTranscurridas + " horas " + minutosTranscurridos +" minutos " + segundosTranscurridos + " segundos");

    }
}
