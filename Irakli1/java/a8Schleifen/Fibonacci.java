package a8Schleifen;

public class Fibonacci {

    public static void main(String[] args) {

        //Eingabe

        int Endwert = 10;
        printFibonucci(Endwert);

    }
    public static void printFibonucci(int Endwert){

        int a = 0;
        int b = 1;
        int next = 0;
        System.out.println("Fibonacci Reihenfolge:\t"+ a +" , " + b);

        while (b <=Endwert) {
            next = a+b;

            if (next>Endwert) {
             break; 
            
        }

        System.out.println(", "+next);

        a=b;
        b=next;
       
        }
        System.out.println("\t");
    }


}