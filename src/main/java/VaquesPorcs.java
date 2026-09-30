
import java.util.Scanner;

// Activitat 03 — Vaques i porcs
public class VaquesPorcs {
    public static void main(String[] args) {
        // TODO: llegeix el número de vaques i de porcs
        //   Calcula el percentatge de cada un sobre el total i mostra'ls
        //   Digues quin dels dos percentatges és més gran (o si empaten)
    Scanner teclat=new Scanner(System.in);

    System.out.println("Introdueix numero de vaques: ");
    double vaques= teclat.nextInt();

    System.out.println("Introdueix numero de porcs: ");
    double porcs= teclat.nextInt();
    
    double total =vaques + porcs;

double pvaq= (vaques/total)*100;
double ppor= (porcs/total)*100;

    System.out.println("Percentatge de vaques: "+ pvaq + "%");
    System.out.println("Percentatge de porcs: "+ ppor + "%");

    if (pvaq>ppor){
System.out.println("Percentatge de vaques > Percentatge de porcs");
    }
    else if (pvaq==ppor){
System.out.println("Percentatge de vaques = Percentatge de porcs");
    }
    else  {
System.out.println("Percentatge de vaques < Percentatge de porcs");
    }

    
    
    
    
    
    }
}
