
import java.util.Scanner;

// Activitat 20 — Login amb usuari i contrasenya
public class LoginUsuariPassword {
    public static void main(String[] args) {
        // Informació secreta
 String username = "cponts";
 String password = "qw34T1234";

        // TODO: demana username i password per teclat
        //   Digues si són correctes o no

    Scanner teclat= new Scanner(System.in);

    System.out.println("Ingresa usuari: ");
    String user=teclat.next();

     System.out.println("Ingresa password: ");
    String pass=teclat.next();

if(user.equals(username)){
    if(pass.equals(password)){
        System.out.println("TOT CORRECTE.");
    
    }
    else{
        System.out.println("CONTRASENYA INCORRECTA");
    }
}
else{
    System.out.println("USUARI INCORRECTE");
}

    }
}
