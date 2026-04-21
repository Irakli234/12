import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {
        

    //Eingabe
    Scanner sc = new Scanner(System.in);
    System.out.println("Gib dem Monat ein:");
    int monat = sc.nextInt();
    
    System.out.println("Gib den Jahr ein:");
    int jahr = sc.nextInt();

    int tageimMonat= 0;

    //Verarbeitung
    switch (monat) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            tageimMonat = 31;
            break;
    
        case 4:
        case 6:
        case 9:
        case 11:
            tageimMonat = 30;
            break;

        case 2:
        if (jahr%4==0) {
            tageimMonat = 29;
            
        } 
        else if (jahr%400==0) {
            tageimMonat = 29;
            } 
        else if (jahr%100!=0) {
            tageimMonat = 29;
            
        }
        else {
            tageimMonat = 28;
        }
        break;
        default:
        System.out.println("Ungültiger Monat");
        break;
        }


        //Ausgabe
        if (monat==2) {
            System.out.println("Der Monat "+monat+" im Jahr "+jahr+" hat "+tageimMonat+" Tage." );
            
        }
        else {
            System.out.println("Der Monat "+monat+" hat "+tageimMonat+" Tage.");
        }
  
        sc.close();
    
    





    }
    
}
