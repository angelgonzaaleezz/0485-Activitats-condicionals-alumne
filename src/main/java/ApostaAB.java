// Activitat 19 — Aposta A o B
// Ajuda: java.util.Random -> random.nextInt(10) + 1

import java.util.Random;
import java.util.Scanner;

public class ApostaAB {
    public static void main(String[] args) {
        // TODO: genera dos números aleatoris A i B (no els mostris encara)
        //   Pregunta per qui aposta l'usuari (A o B); guanya el número més alt
        //   Mostra els dos valors i si ha guanyat o perdut l'aposta
        Scanner teclat = new Scanner(System.in);
        Random numero = new Random();
        int A = numero.nextInt(1,11);
        int B = numero.nextInt(1,11);
        System.out.print("Aposta pel número A o B: ");
        char aposta = teclat.next().charAt(0);
        if (aposta=='A' || aposta=='a') {
            if (A > B) {
                System.out.println("Has guanyat! El número A és més gran que el número B.");
                System.out.println("El número A era: " + A);
                System.out.println("El número B era: " + B);
            } else if (A < B) {
                System.out.println("Has perdut! El número A és més petit que el número B.");
                System.out.println("El número A era: " + A);
                System.out.println("El número B era: " + B);
            } else {
                System.out.println("Empat! Els números A i B són iguals.");
                System.out.println("El número A era: " + A);
                System.out.println("El número B era: " + B);
            }
        } else if (aposta=='B' || aposta=='b') {
            if (B > A) {
                System.out.println("Has guanyat! El número B és més gran que el número A.");
                System.out.println("El número A era: " + A);
                System.out.println("El número B era: " + B);
            } else if (B < A) {
                System.out.println("Has perdut! El número B és més petit que el número A.");
                System.out.println("El número A era: " + A);
                System.out.println("El número B era: " + B);
            } else {
                System.out.println("Empat! Els números A i B són iguals.");
                System.out.println("El número A era: " + A);
                System.out.println("El número B era: " + B);
            }
        } else {
            System.out.println("Opció no vàlida. Si us plau, aposta pel número A o B.");
        }
    }
}
