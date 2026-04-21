package a9Arrays;

public class MethodenmitArrays {

    public static void main(String[] args) {

        String[][] meinPLan = initStdplan();
        ausgabe(meinPLan);
    }

    private static void ausgabe(String[][] plan) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(plan[j][i] + "\t");

            }
            System.out.println();
        }
    }

    private static String[][] leeren(String[][] plan) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                plan[j][i] = "-";

            }
            System.out.println();
        }
        return plan;
    }

    private static String[][] initStdplan() {
        String[][] plan = new String[6][10];
        plan = leeren(plan);
        plan[0][0] = "Zeit:";
        plan[1][0] = "Mo";
        plan[2][0] = "Di";
        plan[3][0] = "Mi";
        plan[4][0] = "Do";
        plan[5][0] = "Fr";

        plan[0][1] = "7:55";
        plan[0][2] = "8:40";
        plan[0][3] = "9:40";
        plan[0][4] = "10:25";
        plan[0][5] = "11:30";
        plan[0][6] = "12:15";
        plan[0][7] = "13:00";
        plan[0][8] = "13:45";
        plan[0][9] = "14:30";

        plan[1][1] = "Sp";
        plan[1][2] = "Sp";
        plan[1][3] = "It-Gpe";
        plan[1][4] = "It-Gpe";
        plan[1][5] = "It-Gpe";
        plan[1][6] = "It-Gpe";
        plan[1][7] = "E";
        

        plan[2][1] = "Ggk";
        plan[2][2] = "Ggk";
        plan[2][3] = "It-Ti";
        plan[2][4] = "It-Ti";
        plan[2][5] = "Eth";
        plan[2][6] = "Eth";
       
        plan[3][1] = "Wil";
        plan[3][2] = "Wil";
        plan[3][3] = "Sp";
        plan[3][4] = "Sp";
        plan[3][5] = "Ph";
        plan[3][6] = "Ph";
        

        plan[4][1] = "E";
        plan[4][2] = "E";
        plan[4][3] = "Mat";
        plan[4][4] = "Mat";
        plan[4][5] = "D";
        plan[4][6] = "Pause";
        plan[4][7] = "S";
        plan[4][8] = "S";

        plan[5][1] = "Mat";
        plan[5][2] = "Mat";
        plan[5][3] = "D";
        plan[5][4] = "D";
        plan[5][5] = "Ch";
        plan[5][6] = "Ch";
        

        return plan;

    }

}
