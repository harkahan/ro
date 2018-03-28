package exploration.bfs;

import common.exploration.Node;
import common.exploration.Tree;
import common.lab.Case;
import common.lab.Labyrinthe;

import java.util.LinkedList;

public class BFS {
    public LinkedList searchTree;
    public Labyrinthe lab;
    public Case start;
    public Case end;
    public Case cursor;
    public Tree tree;

    public BFS(Labyrinthe paramLab){
        this.lab = paramLab;
        this.end = lab.getEnd();
        this.start = lab.getStart();
        this.cursor = start;

        Node startNode = new Node(start);//making a new node from the starting point
        tree = new Tree(startNode);//making a new tree from the starting node
    }

    public boolean moveUp(){
        if (lab.isMovePossible(cursor.getX()-1,cursor.getY())){
            Node temp = new Node(tree.getLastNode(),"move up",tree.getLastNode().cost+1,tree.getCursor());
            tree.addNode(temp);
            cursor.setX(cursor.getX()-1);
            return true;
        }else{
            return false;
        }

    }
    public boolean moveDown(){
        System.out.println(lab.isMovePossible(cursor.getX()+1,cursor.getY()));
        System.out.println(lab.isMovePossible(cursor.getX(),cursor.getY()));

        if (lab.isMovePossible(cursor.getX()+1,cursor.getY())){
            Node temp = new Node(tree.getLastNode(),"move down",tree.getLastNode().cost+1,tree.getCursor());
            tree.addNode(temp);
            cursor.setX(cursor.getX()+1);
            return true;
        }else{
            return false;
        }
    }
    public void moveRight(){

    }
    public void moveLeft(){

    }
}
