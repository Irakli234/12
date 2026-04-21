package a5Typecasting;
public class MeinTypeCasting {

    
        public static void main(String[] args) {
            
            int z1 = 5;
            double z2 = 3.7;
            double summe;
            int summe2;
    
            //Fall 1
            summe = z1+z2; //int-> double Umwandlung -> es gibt keinen Informationsverlust -> automatisch
            System.out.println(summe);
            System.out.println(z1);
    
            //Fall 2
            summe2 = (int) (z1+z2); //Typecasting von double auf int -> Informationsverlust
            System.out.println(summe2);
    
            //double
            int z3 = 5;
            double z4 = (double) z3;
            System.out.println(z3);
            System.out.println(z4);
    
            //char
            char buchstabeA = 'A';
            String meinbuchstabe = new String("abc"); 
    }
}