// Activitat 18 — Endevina el número
// Ajuda: java.util.Random -> random.nextInt(10) + 1  (número entre 1 i 10)

import java.util.Random;
import java.util.Scanner;

public class EndevinaNumero {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 10
        //   Demana a l'usuari que l'endevini
        //   Si l'encerta, felicita'l; si no, digues quin número era
Scanner teclat = new Scanner(System.in);
        Random numero = new Random();
        int numa = numero.nextInt(1,11);

        System.out.print("Endevina el número entre 1 i 10: ");
        int numeroUsuari = teclat.nextInt();
       

        if (numeroUsuari == numa) {
            System.out.println("Ole! Has encertat el número.");
        } else {
            System.out.println("Nanai de la xina, el número correcte era: " + numa);
        }

    }
}
