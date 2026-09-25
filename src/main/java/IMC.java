// Activitat 13 — Índex de massa corporal (IMC)

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        // TODO: llegeix l'altura en cm i el pes en kg
        //   IMC = pes / (altura_en_metres al quadrat)
        //   Classificació OMS: <18.5 Pes insuficient, <25 Pes normal, <30 Sobrepès, >=30 Obesitat
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix l'altura en cm: ");
        double alt = teclat.nextDouble();
        System.out.print("Introdueix el pes en kg: ");
        double pes = teclat.nextDouble();
        double imc = pes / (alt/100 * alt/100);
        System.out.println("L'IMC és: " + imc);
        if (imc < 18.5) {
            System.out.println("Pes insuficient.");
        } else if (imc < 25) {
            System.out.println("Pes normal.");
        } else if (imc < 30) {
            System.out.println("Sobrepès.");
        } else {
            System.out.println("Obesitat.");
        }
    }
}
