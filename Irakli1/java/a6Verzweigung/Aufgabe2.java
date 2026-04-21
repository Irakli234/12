public class Aufgabe2 {
    public static void main(String[] args) {
        //Eingabe
        String name = "rfggfdfghfghzh";
        String message;

        //Verarbeitung
        if(name.length()<3) {
            message="Ihr Name ist zu kurz";

        } 
        else if (name.length()>20) {
            message ="Ihr Name ist zu lang";
            
        }
        else if (name.contains("1")) {
            message ="Bitte keine Ziffern im Namen verwenden";
            
        }
        else {
            message="Hallo "+name;
        }

        //Ausgabe
        System.out.println(message);
    }
    
}
