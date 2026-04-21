public class Aufgabe1 {
    public static void main(String[] args) {
        //Eingabe
        int Zahl = 12;
        int Teiler = 3;
        String message ="";
        //Verarbeitung
        if (Zahl%Teiler == 0) {
            message = Zahl+" ist durch "+Teiler+" ohne Rest Teilbar";
        }
        else{
            message = Zahl+" ist nicht durch "+Teiler+"ohne Rest Teilbar";
            
        }

        //Ausgabe
        System.out.println(message);
        
    }
    
}
