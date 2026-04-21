import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        //Eingabe

        
        Scanner s = new Scanner(System.in);

        System.out.print("Ganze Zahl:");
        int gz =s.nextInt();

        System.out.print("Kommazahl:");
        double kz = s.nextDouble();

        //VERARBEITUNG


        //AUSGABE
        System.out.println("Zahl:\t"+gz);
        System.out.println("Kommazahl:\t"+kz); 
        
    }
}