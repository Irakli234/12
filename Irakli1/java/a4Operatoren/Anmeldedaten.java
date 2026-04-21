package a4Operatoren;

import java.util.Scanner;

public class Anmeldedaten {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Name:\t");
        String name = s.next();

        System.out.println("Nachname:\t");
        String nachname = s.next();

        System.out.println("Alter:\t");
        int alter = s.nextInt();

        System.out.println("Telefonnummer:\t");
        int nummer = s.nextInt();

        System.out.println("E-mail-Adresse:\t");
        String email = s.next();

        System.out.println("Straße:\t");
        String straße = s.next();

        System.out.println("Hausnummer:\t");
        int hausnummer = s.nextInt();
        
        System.out.println("Postleitzahl:\t");
        int Postleitzahl = s.nextInt();

        System.out.println("Stadt:\t");
        String stadt = s.next();

        System.out.println("Name:\t"+name);
        System.out.println("Nachname:\t"+nachname);
        System.out.println("Alter:\t"+alter);
        System.out.println("Telefonnummer:\t"+nummer);
        System.out.println("E-mail-Adresse:\t"+email);
        System.out.println("Straße, Hausnummer:\t"+straße+", "+hausnummer);
        System.out.println("Postleitzahl:\t"+Postleitzahl);


        

    

       

    }
    
}
