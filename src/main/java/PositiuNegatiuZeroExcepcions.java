// Activitat 26 — Positiu, negatiu o zero, amb control d'excepcions

import java.util.Scanner;

public class PositiuNegatiuZeroExcepcions {
    public static void main(String[] args) {
        // TODO: com l'activitat 08, però controla amb try/catch que l'usuari
        //   introdueixi un número enter vàlid
        // Activitat 08 — Positiu, negatiu o zero

int num=0;
        Scanner teclat = new Scanner(System.in);
        try{
        System.out.println("Introdueix un número enter: ");
        num = teclat.nextInt();
        }
        catch (Exception e){
            System.out.println("Introdueix un nombre enter valid.");
            return;
        }

        if (num > 0) {
            System.out.println("El número és positiu.");
        } else if (num < 0) {
            System.out.println("El número és negatiu.");
        } else {
            System.out.println("El número és zero.");
        }
    }
}

    

