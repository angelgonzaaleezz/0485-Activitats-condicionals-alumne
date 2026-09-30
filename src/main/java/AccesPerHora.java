
import java.util.Calendar;

// Activitat 05 — Accés per hora
// Ajuda: fes servir java.util.Calendar per saber l'hora actual
//   Calendar calendar = Calendar.getInstance();
//   int hour = calendar.get(Calendar.HOUR_OF_DAY);
public class AccesPerHora {
    public static void main(String[] args) {
        // TODO: mostra "Pots accedir" únicament si ja han passat les 8 del matí

        Calendar calendar = Calendar.getInstance();
        System.out.println("Verificant acces...");
        int hora= calendar.get(Calendar.HOUR_OF_DAY);
        if(hora>=8){
            System.out.println("Tens acces.");

        }
        else{
            System.out.println("No tens acces.");
        }
    
    }
}
