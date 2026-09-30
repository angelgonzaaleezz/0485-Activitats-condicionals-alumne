
import java.util.Scanner;

// Activitat 07 — Dividir el més gran entre el més petit
public class DivisioGranPetit {
    public static void main(String[] args) {
        // TODO: llegeix 2 números diferents
        //   Si són iguals -> "Els números han de ser diferents"
        //   Troba el més gran i el més petit
        //   Si el més petit és 0 -> "El divisor no pot ser 0"
        //   Si no, mostra el resultat de dividir el gran entre el petit
        Scanner teclat= new Scanner(System.in);
        System.out.println("Introdueix un numero: ");
        double num1 = teclat.nextDouble();
        System.out.println("Introdueix un altre numero: ");
        double num2= teclat.nextDouble();

        if(num1==num2){
            System.out.println("Han de ser numeros diferents!");
        }
        else if (num1>num2) {
            System.out.println(num1+">"+num2);
            if(num2==0){
                System.out.println("El divisor no pot ser 0.");
            }
            else{
                System.out.println(num1+"/"+num2+"="+(num1/num2));
            }
        }
        else{
            System.out.println(num1+"<"+num2);
            if(num1==0){
                System.out.println("El divisor no pot ser 0.");
            }
            else{
                System.out.println(num2+"/"+num1+"="+(num2/num1));
            }
        }

        
    }
}
