package common.lab;

/**
 * ShowLab class that create a showable object from a Labyrinthe
 *
 * @author Florian Hondeville
 * @version 0.1
 */
public class ShowLab {
    int[][] lab;
    String[][] ress;

    /**
     * Constructor for a ShowLab, convert Labyrinthe patern to a grpahicaly showable object
     * This convert each case value by a character
     *
     * @param paramLab Labyrinthe to create a ShowLab from
     */
    public ShowLab(Labyrinthe paramLab) {
        lab = paramLab.getArrayFromLab();

        ress = new String[lab.length][lab[1].length];
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                switch (lab[i][j]) {
                    case 0:
                        ress[i][j] = " ";
                        break;
                    case 1:
                        ress[i][j] = "X";
                        break;
                    case 3:
                        ress[i][j] = "E";
                        break;
                    case 4:
                        ress[i][j] = "S";
                        break;

                }
            }
        }
        this.lab = lab;
    }

    /**
     * show() function that print the lab
     */
    public void show() {
        String res = "";
        for (int a = 0; a < ress.length; a++) {
            for (int b = 0; b < ress[a].length; b++) {
                res += "|";
                res += ress[a][b];
            }
            res += "|";
            res += "\n";
        }
        System.out.println(res);
    }
}
