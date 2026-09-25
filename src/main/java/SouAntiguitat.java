
import java.util.Scanner;

// Activitat 15 — Sou i antiguitat
public class SouAntiguitat {
    public static void main(String[] args) {
        // TODO: llegeix el sou i els anys d'antiguitat
        //   a) sou < 500 i antiguitat >= 10 -> augment del 20%
        //   b) sou < 500 i antiguitat < 10  -> augment del 5%
        //   c) sou >= 500                   -> sense canvis
        //   Mostra el sou a pagar
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix el sou: ");
        double sou = teclat.nextDouble();
        System.out.print("Introdueix els anys d'antiguitat: ");
        int antiguitat = teclat.nextInt();
        if (sou < 500 && antiguitat >= 10) {
            sou *= 1.2;
        } else if (sou < 500 && antiguitat < 10) {
            sou *= 1.05;
        } else if (sou >= 500) {
            System.out.println("Sense canvis en el sou.");
        }
        System.out.println("El sou a pagar és: " + sou);
    }
}
