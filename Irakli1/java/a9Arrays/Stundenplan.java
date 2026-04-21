package a9Arrays;

public class Stundenplan {
    public static void main(String[] args) {
       
                String[][]stdPlan = new String[6][10];
                stdPlan[0][0]= "Zeit:";
                stdPlan[1][0]= "Mo";
                stdPlan[2][0]= "Di";
                stdPlan[3][0]= "Mi";
                stdPlan[4][0]= "Do";
                stdPlan[5][0]= "Fr";
        
                stdPlan[0][1]= "7:55";
                stdPlan[0][2]= "8:40";
                stdPlan[0][3]= "9:40";
                stdPlan[0][4]= "10:25";
                stdPlan[0][5]= "11:30";
                stdPlan[0][6]= "12:15";
                stdPlan[0][7]= "13:00";
                stdPlan[0][8]= "13:45";
                stdPlan[0][9]= "14:30";
        
        
                stdPlan[1][1]= "Sp";
                stdPlan[1][2]= "Sp";
                stdPlan[1][3]= "It-Gpe";
                stdPlan[1][4]= "It-Gpe";
                stdPlan[1][5]= "It-Gpe";
                stdPlan[1][6]= "It-Gpe";
                stdPlan[1][7]= "E";
                stdPlan[1][8]= "Aus";
        
                stdPlan[2][1]= "Ggk";
                stdPlan[2][2]= "Ggk";
                stdPlan[2][3]= "It-Ti";
                stdPlan[2][4]= "It-Ti";
                stdPlan[2][5]= "Eth";
                stdPlan[2][6]= "Eth";
                stdPlan[2][7]= "Aus";
                stdPlan[2][8]= "Aus";
        
                stdPlan[3][1]= "Wil";
                stdPlan[3][2]= "Wil";
                stdPlan[3][3]= "Sp";
                stdPlan[3][4]= "Sp";
                stdPlan[3][5]= "Ph";
                stdPlan[3][6]= "Ph";
                stdPlan[3][7]= "Aus";
                stdPlan[3][8]= "Aus";
        
                stdPlan[4][1]= "E";
                stdPlan[4][2]= "E";
                stdPlan[4][3]= "Mat";
                stdPlan[4][4]= "Mat";
                stdPlan[4][5]= "D";
                stdPlan[4][6]= "Pause";
                stdPlan[4][7]= "S";
                stdPlan[4][8]= "S";
        
                stdPlan[5][1]= "Mat";
                stdPlan[5][2]= "Mat";
                stdPlan[5][3]= "D";
                stdPlan[5][4]= "D";
                stdPlan[5][5]= "Ch";
                stdPlan[5][6]= "Ch";
                stdPlan[5][7]= "Aus";
                stdPlan[5][8]= "Aus";
                
               
                
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print(stdPlan[j][i] + "\t");
                        
                    }
        
                    System.out.println();
                    
                }
        
            }
        
            
    
}
