package a3Konstanten;

public class KonstanteMitInterface implements Physik {

    public static void main(String[] args) {

        //Kraftberechnung

        //Eingabe

        double kraft;       //kg*m/s² = N

        double masse = 15;  // kg

        //Verarbeitung

        kraft = masse * ERDFALLBESCHLEUNIGUNG;

        //Ausgabe

        System.out.println("Kraft: " + kraft + " N");

        System.out.println(LADUNG_ELEKTRON + " C");

    }

} 