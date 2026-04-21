package a4Operatoren;

import java.util.Scanner;

public class Getrankeautomat{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner()

        //Eingabe
        double Preis=1.97;
        double bezahlt=9.99;
        int anzahlGetränke=2;

        double Kosten=Preis*anzahlGetränke;
        double Rückgeld=bezahlt-Kosten;
        double rueckgeldincent=0;

        int anz2Euro = 0;
        int anz1Euro = 0;
        int anz50cent = 0;
        int anz20cent = 0;
        int anz10cent = 0;
        int anz5cent = 0;
        int anz2cent = 0;
        int anz1cent = 0;

        //Verarbeitung
        Kosten=Preis*anzahlGetränke;
        Rückgeld=bezahlt-Kosten;

        //Rückgeld in cent Umrechnen
        rueckgeldincent=Rückgeld*100;

         //Anzahl 2 Euro münzen bestimmen
         anz2Euro=(int) rueckgeldincent / 200;
         rueckgeldincent=(int) rueckgeldincent % 200;

         anz1Euro=(int) rueckgeldincent / 100;
         rueckgeldincent=(int) rueckgeldincent % 100;

         anz50cent=(int) rueckgeldincent / 50;
         anz50cent=(int) rueckgeldincent % 50;

         anz20cent=(int) rueckgeldincent / 20;
         anz20cent=(int) rueckgeldincent % 20;

         anz10cent=(int) rueckgeldincent / 10;
         anz10cent=(int) rueckgeldincent % 10;

         anz5cent=(int) rueckgeldincent / 5;
         anz5cent=(int) rueckgeldincent % 5;

         anz2cent=(int) rueckgeldincent / 2;
         anz2cent=(int) rueckgeldincent % 2;

         anz1cent=(int) rueckgeldincent / 1;
         anz1cent=(int) rueckgeldincent % 1;

         


        
        //Ausgabe
        System.out.println("Bezahlt:"+bezahlt+"Euro");
        System.out.println("Kosten:"+Kosten+"Euro");
        System.out.println("Rückgeld:"+Rückgeld+"Euro");
        System.out.println("2 Euro Münzen:"+anz2Euro);
        System.out.println("1 Euro Münzen:"+anz1Euro);
        System.out.println("50 cent Münzen:"+anz50cent);
        System.out.println("20 cent Münzen:"+anz20cent);
        System.out.println("10 cent Münzen:"+anz10cent);
        System.out.println("5 cent Münzen:"+anz5cent);
        System.out.println("2 cent Münzen:"+anz2cent);
        System.out.println("1 cent Münzen:"+anz1cent);
        
        //Rückgeld in cent Umrechnen
        rueckgeldincent=Rückgeld*100;

        
        

        
    }




}


    
