
import java.util.Random;
import java.util.Scanner;

// Activitat 21 — Pedra, paper o tisora
// Ajuda: java.util.Random -> random.nextInt(3)  (0 pedra, 1 paper, 2 tisora)
public class PedraPaperTisora {
    public static void main(String[] args) {
        // TODO: l'ordinador tria a l'atzar pedra, paper o tisora
        //   L'usuari entra la seva opció per teclat
        //   Mostra què ha tret l'ordinador i qui guanya (tisores>paper>pedra>tisores)
        Scanner teclat=new Scanner(System.in);
        Random numero =new Random();

        System.out.println("Introdueix Pedra, Paper o Pissores:");
        String esc=teclat.next();
        int numa = numero.nextInt(1,4);
    //1=tissores
    //2=pedra
    //3=paper
        if(esc.equalsIgnoreCase("Paper")){
            if(numa == 1){
                System.out.println("Has perdut, jo havia tret tissores JA JA JA");
            }
            else if(numa == 2){
                System.out.println("Has guanyat, jo havia tret pedra :(");
            }
            else{
                System.out.println("Hem empatat, tornem a jugar!");
            }
        }
        if(esc.equalsIgnoreCase("Pedra")){
            if(numa == 1){
                System.out.println("Has guanyat, jo havia tret tissores :(");
            }
            else if(numa == 3){
                System.out.println("Has perdut, jo havia tret paper JA JA JA");
            }
            else{
                System.out.println("Hem empatat, tornem a jugar!");
            }
            }
            if(esc.equalsIgnoreCase("Tissores")){
            if(numa == 3){
                System.out.println("Has guanyat, jo havia tret paper :(");
            }
            else if(numa == 2){
                System.out.println("Has perdut, jo havia tret pedra JA JA JA");
            }
            else{
                System.out.println("Hem empatat, tornem a jugar!");
            }
        
        
    }
}
}

