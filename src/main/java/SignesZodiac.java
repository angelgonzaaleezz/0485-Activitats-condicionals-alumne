// Activitat 24 — Signes del zodíac (switch)

import java.util.Scanner;

public class SignesZodiac {
    public static void main(String[] args) {
        // TODO:
        //   a) Mostra el llistat dels 12 signes amb el seu número
        //   b) Demana un número per teclat
        //   c) Amb un switch, mostra la categoria (Foc, Terra, Aire o Aigua)
        //   Si el número no correspon a cap signe: "ERROR: <número> no associat a cap signe."
        Scanner teclat = new Scanner(System.in);
        System.out.println("|  --------------------------------------------- |");
        System.out.println("|  1. Àries   |   2. Capricorn   |   3. Balança  |");
        System.out.println("|  -----------+------------------+-------------- |");
        System.out.println("|  4. Cranc   |   5. Lleó        |   6. Taure    |");
        System.out.println("|  -----------+------------------+-------------- |");
        System.out.println("|  7. Aquari  |   8. Escorpió    |   9. Sagitari |");
        System.out.println("|  -----------+------------------+-------------- |");
        System.out.println("|  10. Verge  |   11. Bessons    |   12. Peixos  |");
        System.out.println("|  --------------------------------------------- |");
        System.out.println("Introdueix el numero d' un signe del zodiac: ");
        int signe=teclat.nextInt();
        switch(signe){
            case 1:
                System.out.println("Has escollit Àries, de tipus Foc!");
                break;
            case 2:
                System.out.println("Has escollit Capricorn, de tipus Terra!");
                break;
            case 3:
                System.out.println("Has escollit Balança, de tipus Aire!");
                break;
            case 4:
                System.out.println("Has escollit Cranc, de tipus Aigua!");
                break;
            case 5:
                System.out.println("Has escollit Lleó, de tipus Foc!");
                break;
            case 6:
                System.out.println("Has escollit Taure, de tipus Terra!");
                break;
            case 7:
                System.out.println("Has escollit Aquari, de tipus Aire!");
                break;
            case 8:
                System.out.println("Has escollit Escorpió, de tipus Aigua!");
                break;
            case 9:
                System.out.println("Has escollit Sagitari, de tipus Foc!");
                break;
            case 10:
                System.out.println("Has escollit Verge, de tipus Terra!");
                break;
            case 11:
                System.out.println("Has escollit Bessons, de tipus Aire!");
                break;
            case 12:
                System.out.println("Has escollit Peixos, de tipus Aigua!");
                break;
            default:
                System.out.println("Error: "+signe+" no correspon a cap signe...");
        }
        System.out.println("Fi del programa. ");
    }
}
