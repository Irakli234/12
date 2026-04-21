package a7Methoden;

public class MethodenMitRueckgabewert {
    public static void main(String[] args) {
        int meineSumme = addiere(3,5);

        System.out.println(meineSumme);
            }
            //Methode mit Rückgabewert und Übergabeparametern
            private static int addiere(int summand1, int summand2) {
                //Eingabe (Übergabeparameter und lokale Variablen)
                int returnValue;

                //Verarbeitung
                returnValue = summand1+summand2;

                //Rueckgabe
                return returnValue;
               
            }
    
}
