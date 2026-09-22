
import java.util.Scanner;

// Activitat 04 — Nota d'una UF (mitjana ponderada)
public class NotaUF {
    public static void main(String[] args) {
        // TODO: llegeix la nota d'activitats i la nota de proves
        //   La nota final = activitats * 0.10 + proves * 0.90
        //   Mostra la nota final i digues si s'ha aprovat (>= 5) o no
Scanner teclat=new Scanner(System.in);
System.out.println("Introdueix nota d'activitats: ");
double na= teclat.nextDouble();
System.out.println("Introdueix nota de proves: ");
double np= teclat.nextDouble();

double nf= (na*0.1)+(np*0.9);

System.out.println("La teva nota es: "+nf);
if(nf>5){
    System.out.println("Has aprobat!");
}
else{
    System.out.println("Has suspés.");
}

    }
}
