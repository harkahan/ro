package common.exploration;

import java.util.LinkedList;

public class Tree {
    LinkedList <Node> tree;
    int cursor;

    public Tree(Node startingPoint){
        tree = new LinkedList<>();
        tree.add(startingPoint);
        cursor =0;
    }

    public void addNode(Node nodeToAdd){
        tree.add(nodeToAdd);
        cursor +=1;
    }
    public int getCursor(){
        return cursor;
    }
    public Node getLastNode(){
        return tree.get(cursor);
    }


    public String toString(){
        String res ="";
        for (int i=0;i<=cursor;i++){
            res += tree.get(i)+"\n";
        }
        return res;
    }
}
