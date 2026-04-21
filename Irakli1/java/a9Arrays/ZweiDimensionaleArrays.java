public class ZweiDimensionaleArrays {

    public static void main(String[] args) {

        String[][] meinPlan = initStdPLan();
        ausgabeStdPlan(meinPlan);

        System.out.println(meinPlan[0].length);

    }

    public static void ausgabeStdPlan(String[][] plan) {
        String[][] copy = plan.clone();
        int anzZeilen = copy[0].length;
        int anzSpalten = copy.length;

        // äussere Schleife Zeilen
        for (int zeile = 0; zeile < anzZeilen; zeile++) {

            // Innere Schleife spalten einer Zeile ausgeben
            for (int spalte = 0; spalte < anzSpalten; spalte++) {
                System.out.print(copy[spalte][zeile] + "\t");
            }
            // Zeilenumbruch für nächste Zeile
            System.out.println();
        }
    }

    public static String[][] initStdPLan() {
        String[][] stdPlan = new String[6][15];
        stdPlan[0][0] = "Zeit";
        stdPlan[1][0] = "Mo";
        stdPlan[2][0] = "Di";
        stdPlan[3][0] = "Mi";
        stdPlan[4][0] = "Do";
        stdPlan[5][0] = "Fr";

        stdPlan[0][1] = "07:55";
        stdPlan[0][2] = "08:40";
        stdPlan[0][3] = "09.25";
        stdPlan[0][4] = "09:40";
        stdPlan[0][5] = "10:25";
        stdPlan[0][6] = "11:10";
        stdPlan[0][7] = "12:15";
        stdPlan[0][8] = "13:00";
        stdPlan[0][9] = "13:45";
        stdPlan[0][10] = "14:25";
        stdPlan[0][11] = "15:10";
        stdPlan[0][12] = "15:25";
        stdPlan[0][13] = "16:10";
        stdPlan[0][14] = "16:55";

        return stdPlan;

    }
}