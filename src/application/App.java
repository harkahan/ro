package application;

import common.lab.Labyrinthe;
import common.lab.ShowLab;
import exploration.bfs.BFS;

public class App {

    static Labyrinthe lab1 = new Labyrinthe(6, 5);


    public static void main(String[] args) {
        lab1.setWall(1, 2);
        lab1.setWall(1, 4);

        lab1.setWall(2, 0);
        lab1.setWall(2, 2);
        lab1.setWall(2, 4);

        lab1.setWall(3, 0);
        lab1.setWall(3, 2);

        lab1.setWall(4, 2);
        lab1.setWall(4, 3);

        lab1.setStart(1, 0);
        lab1.setEnd(3, 4);


        ShowLab sl = new ShowLab(lab1);
        sl.show();

        BFS exploration = new BFS(lab1);

        exploration.moveUp();
        exploration.moveRight();
        exploration.moveRight();
        exploration.moveRight();

        System.out.println(exploration.tree.toString());
        //exploration.moveUp();
        //exploration.moveUp();

    }
}
