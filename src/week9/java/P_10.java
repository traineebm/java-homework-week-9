package week9.java;

/**
 * Write the programme that tell you which line pass through particular stations. Just use Zone 1 stations name
 */
public class P_10<trainlines> {
    public static void main(String[] args) {

    }
    public static void stationNames() {
        //Declaring - All Zone 1 station's name:
        String stations[] = {"Aldgate,Angel,Baker St,Bank,Charing Cross,Covent Garden,Euston,Elephant & Castle, " +
                "Farringdon,Green Park,Goodge street,Holborn,Knightsbridge,Leicester Square,London Bridge," +
                " Moorgate,Oxford Circus,Piccadilly Circus,TowerHill,Victoria" };

        // Declaring Multidimensional array for all Tubelines and stations
        String[][] trainlines = new String[6][20];
        trainlines[0][0] = "Bakerloo Line";
        trainlines[0][1] = "Baker Street";
        trainlines[0][2] = "Charing Cross";
        trainlines[0][3] = "Elephant & Castle";
        trainlines[0][4] = "Oxford Circus";
        trainlines[0][5] = "Piccadilly Circus";

        trainlines[1][0] = "Central Line";
        trainlines[1][1] = "Bank";
        trainlines[1][2] = "Holborn";
        trainlines[1][3] = "Oxford Circus";

        trainlines[2][0] = "Circle Line";
        trainlines[2][1] = "Aldgate";
        trainlines[2][2] = "Baker Street";
        trainlines[2][3] = "Farringdon";
        trainlines[2][4] = "Moorgate";
        trainlines[2][5] = "Towerhill";
        trainlines[2][6] = "Victoria";

        trainlines[3][0] = "District Line";
        trainlines[3][1] = "Baker Street";
        trainlines[3][2] = "Towerhill";
        trainlines[3][3] = "Victoria";

        trainlines[4][0] = "Jubilee Line";
        trainlines[4][1] = "Baker Street";
        trainlines[4][2] = "Green park";
        trainlines[4][3] = "London Bridge";

        trainlines[5][0] = "Northern Line";
        trainlines[5][1] = "Angel";
        trainlines[5][2] = "Bank";
        trainlines[5][3] = "Charing Cross";
        trainlines[5][4] = "Euston";
        trainlines[5][5] = "Elephant & Castle";
        trainlines[5][6] = "Goodge Street";
        trainlines[5][7] = "Leicester Square";
        trainlines[5][8] = "London Bridge";
        trainlines[5][9] = "Moorgate";

        trainlines[6][0] = "Victoria Line";
        trainlines[6][1] = "Baker Street";
        trainlines[6][2] = "Euston";
        trainlines[6][3] = "Green Park";
        trainlines[6][4] = "Oxford Circus";
        trainlines[6][5] = "Victoria";

    }
    }

