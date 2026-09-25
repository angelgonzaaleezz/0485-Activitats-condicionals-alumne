
import java.util.Scanner;

// Activitat 16 — Descompte per trams
public class DescompteTrams {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat N i resta-li el descompte segons el tram
        //   N < 500          -> 5%
        //   500 <= N < 1000  -> 8%
        //   1000 <= N <= 5000 -> 15%
        //   N > 5000         -> 25%
        //   Mostra el resultat
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix una quantitat: ");
        double N = teclat.nextDouble();
        if (N < 500) {
            N = N - (N * 0.05);
        } else if (N >= 500 && N < 1000) {
            N = N - (N * 0.08);
        } else if (N >= 1000 && N <= 5000) {
            N = N - (N * 0.15);
        } else if (N > 5000) {
            N = N - (N * 0.25);
        }
        System.out.println("Quantitat amb descompte: " + N);
            
    }
}
