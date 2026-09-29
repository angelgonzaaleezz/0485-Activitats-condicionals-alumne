
import java.util.Scanner;

// Activitat 01 — Febre
public class Febre {
    public static void main(String[] args) {
        // TODO: llegeix la temperatura (real, per teclat) i digues si hi ha febre
        //   Si temperatura > 37 -> "Tens febre, has d'anar cap a casa a descansar!!"
        //   Si no -> un altre missatge (per exemple, que pot quedar-se)

        Scanner teclat= new Scanner(System.in);

        System.out.println("Introdueix la teva temperatura: ");
        double temp= teclat.nextDouble();

        if(temp>37.0){
            System.out.println("Tens febre, marxa cap a casa a descansar.");

        
        }
        else{
            System.out.println("Estas fresc com un enciam, a currar!");
        }
    }
}
