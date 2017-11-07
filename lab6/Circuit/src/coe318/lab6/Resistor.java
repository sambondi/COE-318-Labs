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
public class Resistor {
    
    private static int resistorCount = 0;
    private int resistorNumber;
    private Node[] nodes;
    private Node n1, n2;
    private double r;
    
    /**
    * Constructs a resistor between nodes 1 and 2 with a given resistance.
    * 
    * @param resistance Resistance of the resistor.
    * @param node1 First node resistor connects to.
    * @param node2 Second node resistor connects to.
    */
    //Constructor
    public Resistor(double resistance, Node node1, Node node2){
        resistorCount++;
        resistorNumber = resistorCount;
            if(resistorNumber < 0){
                throw new IllegalArgumentException("Cannot have negative resistor ID.");
            }
        n1 = node1;
        n2 = node2;
            if(n1.nodeNumber < 0 || n2.nodeNumber < 0){
                throw new IllegalArgumentException("Cannot have negative node ID.");
            }
        r = resistance;
            if(r < 0){
                throw new IllegalArgumentException("Cannot have negative resistance.");
            }
        nodes = getNodes();
        
        Circuit cir = Circuit.getInstance();
        cir.resistors.add(this);
    }
    
    /**
    * @return An array of nodes where the first element is the first node specified in the constructor and the second element is the second node.
    */
    public Node[] getNodes(){
        Node[] nodes = new Node[2];
        
        nodes[0] = n1;
        nodes[1] = n2;
        
        return nodes;
    }
    
    /**
    * @return the String representation of the nodes array.
    */
    @Override
    public String toString(){
        return "R"+resistorNumber+" "+nodes[0]+" "+nodes[1]+" "+r;
    }
}
