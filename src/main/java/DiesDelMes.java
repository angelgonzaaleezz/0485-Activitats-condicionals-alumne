// Activitat 23 — Dies del mes (switch amb casos agrupats)

import java.util.Scanner;

public class DiesDelMes {
    public static void main(String[] args) {
        // TODO amb switch (pots agrupar casos, per exemple: case 1: case 3: ...):
        //   Mesos de 31 dies, de 30 dies, i febrer (28 dies)
        //   Controla els números fora de rang (default)
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix el numero d'un mes del 1-12: ");
        int mes=teclat.nextInt();
        switch(mes){
            case 1 , 3 , 5 , 7 , 8 , 10 , 12 -> //he investigat quina forma habia per agrupar cases de forma optima.
            System.out.println("Aquest mes te 31 dies!");
            case 4 , 6 , 9 , 11 ->
            System.out.println("Aquest mes te 30 dies!");
            case 2 ->
                System.out.println("Aquest mes te 28 dies!");
            default ->
                System.out.println("Opció no valida.");

        }
        System.out.println("Fi del programa.");
    }
}
