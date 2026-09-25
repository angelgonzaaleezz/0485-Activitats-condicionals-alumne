// Activitat 11 — Preu d'una entrada de cinema
// Ajuda: per llegir una lletra amb Scanner
//   char lletra = teclat.next().charAt(0);

import java.util.Scanner;

public class PreuEntradaCinema {
    public static void main(String[] args) {
        // TODO: l'entrada normal val 5€
        //   Un 10% més en cap de setmana (pregunta L=laborable o C=cap de setmana)
        //   Un 15% de descompte addicional amb Carnet Jove (pregunta S/N)
        //   Mostra el preu final

    Scanner teclat = new Scanner(System.in);
    System.out.print("Laborable o cap de setmana? (L/C): ");
    char tipus = teclat.next().charAt(0);
    System.out.print("Tens Carnet Jove? (S/N): ");
    char carnet = teclat.next().charAt(0);
    double preu = 5;
    if (tipus == 'C'|| tipus == 'c') {
        preu=preu * 1.10;

    }
    if (carnet == 'S'|| carnet == 's') {
        preu=preu * 0.85;
    }
    if (carnet == 'N' || carnet == 'n') {
        preu=preu * 1;

    }
    if (tipus == 'L' || tipus == 'l') {
        preu=preu * 1;

    }
    if (tipus != 'L' && tipus != 'l' && tipus != 'C' && tipus != 'c') {
        System.out.println("Tipus d'entrada no vàlid.");
        return;
    }
    if (carnet != 'S' && carnet != 's' && carnet != 'N' && carnet != 'n') {
        System.out.println("Resposta no vàlida per Carnet Jove.");
    }

    System.out.println("El preu final és: " + preu + " €");

}
}
