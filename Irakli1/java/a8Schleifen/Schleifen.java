package a8Schleifen;
import java.util.Scanner;
public class Schleifen {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int zahl = random.nextInt(100) + 1, eingabe, abstand;
   
    do {
        System.out.print("Rate eine Zahl zwischen 1 und 100: ");
        eingabe = scanner.nextInt();
        abstand = Math.abs(zahl - eingabe);
        System.out.println(abstand == 0 ? "Gewonnen!" : (abstand <= 10 ? "Heiß!" : "Kalt!"));
    } while (abstand != 0);
   
    scanner.close();

    System.out.println("Du hast den Zahl erraten!");
}
}
