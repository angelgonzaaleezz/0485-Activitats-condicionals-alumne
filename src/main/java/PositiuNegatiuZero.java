// Activitat 08 — Positiu, negatiu o zero
import java.util.Scanner;
public class PositiuNegatiuZero {
    public static void main(String[] args) {
        // TODO: llegeix un número enter i digues si és positiu, negatiu o zero
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número enter: ");
        int num = teclat.nextInt();

        if (num > 0) {
            System.out.println("El número és positiu.");
        } else if (num < 0) {
            System.out.println("El número és negatiu.");
        } else {
            System.out.println("El número és zero.");
        }
    }
}
