package algo;

import common.exploration.Action;
import common.lab.Case;
import common.lab.Labyrinthe;

import java.util.LinkedList;

public class Bfs {
    public Labyrinthe labi;
    public LinkedList <Case>cases;
    public Bfs(Labyrinthe lab){
        this.labi = lab;
        cases = new LinkedList<Case>();
    }

    public boolean containsCase(int x,int y){
        for (int i=0;i<cases.size();i++){
            if(cases.get(i).equalsCase(x,y)){
                return false;
            }
        }
        return true;
    }

    public void resolve(){
        Action bfs = new Action(labi);
        cases.add(bfs.start);
        while(bfs.cursor != labi.getEnd()) {
            if (labi.isUpPossible(bfs.cursor)){
                if (containsCase(bfs.cursor.getX()+1,bfs.cursor.getY())){
                    System.out.println("contains cursor up !");
                    System.out.println(cases);

                }else{
                    bfs.moveUp();
                    System.out.println("up !");
                    cases.add(bfs.cursor);
                }

            }else if(labi.isDownPossible(bfs.cursor)){
                if (containsCase(bfs.cursor.getX()-1,bfs.cursor.getY())){
                    System.out.println("contains cursor down !");
                    System.out.println(cases);
                }else{
                    bfs.moveDown();
                    System.out.println("down !");
                    cases.add(bfs.cursor);
                }
            }else if(labi.isLeftPossible(bfs.cursor)){
                if (containsCase(bfs.cursor.getX(),bfs.cursor.getY()-1)){
                    System.out.println("contains cursor left !");
                    System.out.println(cases);
                }else{
                    bfs.moveLeft();
                    System.out.println("left !");
                    cases.add(bfs.cursor);
                }
            }else if(labi.isRightPossible(bfs.cursor)){
                if (containsCase(bfs.cursor.getX()+1,bfs.cursor.getY()+1)){
                    System.out.println("contains cursor right !");
                    System.out.println(cases);
                }else{
                    bfs.moveRight();
                    System.out.println("right !");
                    cases.add(bfs.cursor);
                }
            }else{
                System.out.println("Cursor = "+bfs.cursor);
                System.out.println(cases);
                System.out.println("Erreur !");
                break;
            }
            System.out.println(cases);

        }

        bfs.moveUp();

    }
}
