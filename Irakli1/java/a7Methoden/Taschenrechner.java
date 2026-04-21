package a7Methoden;

import java.util.Scanner;

public class Taschenrechner {

    public static double addiere(double a, double b){
       return a+b;
   }
   public static double subtrahiere(double a, double b){
       return a-b;
   }
   public static double multipliziere(double a, double b){
       return a*b;
   }
   public static double division(double a, double b){
       if (b==0){
           System.out.println("Nenner darf nicht 0 sein");
           throw new IllegalArgumentException("Nenner darf nicht 0 sein");
       }
       return a/b;
   }
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
               System.out.println("Wählen Sie eine Operation");
               System.out.println("1. Addieren");
               System.out.println("2. Subtrahieren");
               System.out.println("3. Multiplizieren");
               System.out.println("4. Dividieren");
               int auswahl = scanner.nextInt();
               System.out.println("Geben Sie die erste Zahl ein");
               double zahl1 = scanner.nextDouble();
               System.out.println("Geben Sie die zweite Zahl ein");
               double zahl2 = scanner.nextDouble();


               double ergebnis = 0;
               switch (auswahl) {
                   case 1:
                       ergebnis = addiere(zahl1, zahl2);
                       System.out.println(ergebnis);
                       break;
                   case 2:
                   ergebnis = subtrahiere(zahl1, zahl2);
                   System.out.println(ergebnis);
                       break;
                   case 3:
                   ergebnis = multipliziere(zahl1, zahl2);
                   System.out.println(ergebnis);
                       break;
                   case 4:
                   ergebnis = division(zahl1, zahl2);
                   System.out.println(ergebnis);
                       break;
                   default:
                   System.out.println("Versuchen Sie es erneut");
                   return;
               }

               System.out.println("Ergebnis:"+ergebnis);
               }
}



        






    

