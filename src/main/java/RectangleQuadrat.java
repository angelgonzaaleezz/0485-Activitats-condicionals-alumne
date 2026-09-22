// Activitat 06 — Rectangle o quadrat

import java.util.Scanner;

public class RectangleQuadrat {
    public static void main(String[] args) {
        // TODO: llegeix el costat gran i el costat petit d'un rectangle
        //   Mostra el perímetre (costatGran*2 + costatPetit*2) i l'àrea (costatGran*costatPetit)
        //   Digues si és un quadrat (els dos costats iguals) o no

int cg;
int cc;
int op;
Scanner teclat= new Scanner(System.in);

System.out.println("Introdueix costat gran:");
cg= teclat.nextInt();

System.out.println("Introdueix costat petit:");
cc= teclat.nextInt();

op=cg*2+cc*2;

System.out.println("Perimetre: " +op);


op=cg*cc;

System.out.println("Area: " +op);

if(cg==cc){
    System.out.println("Aixó es un cuadrat.");
}
else{
    System.out.println("Aixó es un rectangle.");
}

    }
}
