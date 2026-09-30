
import java.util.Scanner;

// Activitat 25 — Operacions aritmètiques amb control d'excepcions
public class OperacionsExcepcions {
    public static void main(String[] args) {
        // TODO: llegeix 2 números enters i mostra suma, resta, multiplicació i divisió
        //   Controla amb try/catch que l'usuari introdueixi números vàlids
        //   Controla que el segon operand no sigui 0 abans de dividir
        int sum=0;
        int res=0;
        int mult=0;
        int div=0;
        int num1=0;
        int num2=0;
        Scanner teclat= new Scanner(System.in);
        try{
        System.out.println("Introdueix un numero enter: ");
        num1=teclat.nextInt();
        System.out.println("Introdueix un altre numero enter: ");
        num2=teclat.nextInt();
        }
        catch (Exception e){
            System.out.println("Error: Introdueix un numero enter.");
            return;
        }
        
        
            sum = num1+num2;
            res = num1-num2;
            mult = num1*num2;
            try {
            div = num1/num2;
        } catch (Exception e) {
            System.out.println("Error: No es pot dividir entre 0!");
            return;
        }
        System.out.println("Suma:" + num1 + "+" + num2 + "=" + sum);
        System.out.println("Resta:" + num1 + "-" + num2 + "=" + res);
        System.out.println("Multiplicació:" + num1 + "*" + num2 + "=" + mult);
        System.out.println("Divisió:" + num1 + "/" + num2 + "=" + div);
    }
}
