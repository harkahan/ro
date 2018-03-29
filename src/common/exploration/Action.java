package common.exploration;

import common.exploration.Node;
import common.exploration.Tree;
import common.lab.Case;
import common.lab.Labyrinthe;

import java.util.LinkedList;

public class Action {
    public LinkedList searchTree;
    public Labyrinthe lab;
    public Case start;
    public Case end;
    public Case cursor;
    public Tree tree;

    public Action(Labyrinthe paramLab) {
        this.lab = paramLab;
        this.end = lab.getEnd();
        this.start = lab.getStart();
        this.cursor = start;

        Node startNode = new Node(start);//making a new node from the starting point
        tree = new Tree(startNode);//making a new tree from the starting node
    }

    public boolean moveUp() {
        if (lab.isMovePossible(cursor.getX() - 1, cursor.getY())) {
            Node temp = new Node(tree.getLastNode(), "move up", tree.getLastNode().cost + 1, tree.getCursor());
            tree.addNode(temp);
            cursor.setX(cursor.getX() - 1);
            return true;
        } else {
            return false;
        }
    }

    public boolean moveDown() {
        if (lab.isMovePossible(cursor.getX() + 1, cursor.getY())) {
            Node temp = new Node(tree.getLastNode(), "move down", tree.getLastNode().cost + 1, tree.getCursor());
            tree.addNode(temp);
            cursor.setX(cursor.getX() + 1);
            return true;
        } else {
            return false;
        }
    }

    public boolean moveRight() {
        if (lab.isMovePossible(cursor.getX(), cursor.getY() + 1)) {
            Node temp = new Node(tree.getLastNode(), "move right", tree.getLastNode().cost + 1, tree.getCursor());
            tree.addNode(temp);
            cursor.setY(cursor.getY() + 1);
            return true;
        } else {
            return false;
        }
    }

    public boolean moveLeft() {
        if (lab.isMovePossible(cursor.getX(), cursor.getY() - 1)) {
            Node temp = new Node(tree.getLastNode(), "move left", tree.getLastNode().cost + 1, tree.getCursor());
            tree.addNode(temp);
            cursor.setY(cursor.getY() - 1);
            return true;
        } else {
            return false;
        }
    }
}
