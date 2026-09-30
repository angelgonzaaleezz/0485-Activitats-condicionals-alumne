// Activitat 27 — Monedes mínimes

import java.util.Scanner;

public class MonedesMinimesCondicional {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat en cèntims (comprova que sigui >= 0)
        //   Mostra la quantitat mínima de monedes de 1, 2, 5, 10, 20, 50, 100 i 200 cèntims
        //   Només mostra les línies amb quantitat > 0
         Scanner teclat=new Scanner(System.in);
System.out.println("Introdueix cenitms:");
int cent=teclat.nextInt();
int dos=cent/200;
if(dos != 0){
System.out.println(dos+" monedes de 2 euros");
}
int un=(cent%200)/100;
if(cent != 0){
System.out.println(un+" monedes d'1 euro");
}
int cincua=((cent%200)%100)/50;
if(cincua != 0){
System.out.println(cincua+" monedes de 50 cèntims");
}
int vint= (((cent%200)%100)%50)/20;
if(vint != 0){
System.out.println(vint+" monedes de 20 cèntims");
}
int deu= ((((cent%200)%100)%50)%20)/10;
if(deu != 0){
System.out.println(deu+" monedes de 10 cèntims");
}
int cinc=(((((cent%200)%100)%50)%20)%10)/5;
if(cinc != 0){
System.out.println(cinc+" monedes de 5 cèntims");
}
int duos=((((((cent%200)%100)%50)%20)%10)%5)/2;
if(duos != 0){
System.out.println(duos+" moneda de 2 cèntims");
}
int uno=(((((((cent%200)%100)%50)%20)%10)%5)%2);
if(uno != 0){
System.out.println(uno+" moneda de 1 cèntims");
}

    }
}


