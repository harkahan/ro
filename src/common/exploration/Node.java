package common.exploration;

import common.lab.Case;

/**
 * @author Florian Hondeville
 * @version 0.1
 * Class Node helps to represent a node in the search tree
 * @see Action
 * @see algo.dfs.DFS
 */
public class Node {

    public Case state;
    public Node parents;
    public String moveName;
    public int cost;
    public int depth;

    /**
     * Constructor for the first nodes of the tree
     *
     * @param state state representing the starting point in this case
     */
    public Node(Case state) {
        this.state = state;
        this.parents = null;
        this.depth = 0;
        this.moveName = "Starting point";
        this.cost = 0;
    }

    /**
     * Constructor for a new Node in the tree
     *
     * @param parents Parents node of this in the tree
     * @param move    Description for the moveName applied to this
     * @param cost    Int representing the total cost to reach this
     * @param depth   Int representing the depth of this
     */
    public Node(Node parents, String move, int cost, int depth) {
        this.parents = parents;
        this.moveName = move;
        this.cost = cost;
        this.depth = depth;
    }

    public String getName() {
        return moveName;
    }

    public String toString() {
        String tempName;
        if (this.parents == null) {
            tempName = "null";
        } else {
            tempName = this.parents.getName();
        }
        return "Node name : " + this.moveName + " [parents : " + tempName + "] cost : " + this.cost;
    }
}
