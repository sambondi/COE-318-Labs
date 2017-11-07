/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;
/**
 *
 * @author Sam Bondi, 500686504
 */
public class Node {
    
    private static int nodeCount = -1;
    public int nodeNumber;
    
    /**
    * Constructs a node, assigning it an id number.
    */
    //Constructor
    public Node(){
        nodeCount++;
        if(nodeCount < 0){
            throw new IllegalArgumentException("Node ID cannot be negative.");
        }
        nodeNumber = nodeCount;
    }
    
    /**
    * @return the String representation of the node number.
    */
    @Override
    public String toString(){
        return ""+nodeNumber;
    }
}
