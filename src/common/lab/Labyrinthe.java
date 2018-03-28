package common.lab;


/**
 * Labyrinthe class that create a lab with function to set it up
 *
 * @author Florian Hondeville
 * @version 0.3
 * In lab : O is type empty room
 * 1 is type wall
 * 3 is Start
 * 4 is End
 */
public class Labyrinthe {
    int[][] lab;
    Case start;
    Case end;

    /**
     * @param x X size for lab
     * @param y Y size for lab
     *          The lab is X*Y sized
     */
    public Labyrinthe(int x, int y) {
        lab = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                lab[i][j] = 0;
            }
        }
    }

    public void setWall(int x, int y) {
        this.lab[x][y] = 1;
    }

    public void setStart(int x, int y) {
        this.lab[x][y] = 3;
        start = new Case(x, y, "start");
    }

    public void setEnd(int x, int y) {
        this.lab[x][y] = 4;
        end = new Case(x, y, "end");
    }

    public int[][] getArrayFromLab() {
        return this.lab;
    }

    public Case getStart() {
        return start;
    }

    public Case getEnd() {
        return end;
    }

    /**
     * Methods that return true if its possible to moveName at position X,Y
     *
     * @param x X position for the moveName
     * @param y Y position for the moveName
     * @return true if tis possible to moveName, else return false
     */
    public boolean isMovePossible(int x, int y) {
        if (x >= 0 && y >= 0) {
            return lab[x][y] != 1;
        } else {
            return false;
        }

    }
}