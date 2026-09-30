
import java.util.Scanner;

// Activitat 22 — Nom del mes (switch)
public class NomDelMes {
    public static void main(String[] args) {
        // TODO amb switch: llegeix un número de mes (1-12) i mostra el seu nom
        //   Controla els números fora de rang (default)

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix el numero d'un mes del 1-12: ");
        int mes=teclat.nextInt();
        switch(mes){
            case 1:
                System.out.println("Has escollit el mes nº 1: Gener!");
                break;
            case 2:
                System.out.println("Has escollit el mes nº 2: Febrer!");
                break;
            case 3:
                System.out.println("Has escollit el mes nº 3: Març!");
                break;
            case 4:
                System.out.println("Has escollit el mes nº 4: Abril!");
                break;
            case 5:
                System.out.println("Has escollit el mes nº 5: Maig!");
                break;
            case 6:
                System.out.println("Has escollit el mes nº 6: Juny!");
                break;
            case 7:
                System.out.println("Has escollit el mes nº 7: Juliol!");
                break;
            case 8:
                System.out.println("Has escollit el mes nº 8: Agost!");
                break;
            case 9:
                System.out.println("Has escollit el mes nº 9: Setembre!");
                break;
            case 10:
                System.out.println("Has escollit el mes nº 10: Octubre!");
                break;
            case 11:
                System.out.println("Has escollit el mes nº 11: Novembre!");
                break;
            case 12:
                System.out.println("Has escollit el mes nº 12: Desembre!");
                break;
            default:
                System.out.println("Opció no valida");
        }
        System.out.println("Fi del programa. ");

    }
}
