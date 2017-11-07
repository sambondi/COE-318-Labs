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
import java.util.ArrayList;

public class Circuit {
    
    //Code to make Circuit object a "singleton".
    private static Circuit instance = null;
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new  Circuit();
        }
    return instance;
    }
    
    public static ArrayList<Resistor> resistors = new ArrayList<>();
    
    //Constructor
    private Circuit() {} //Yes, the constructor is PRIVATE!
    
    public void add(Resistor r){
        resistors.add(r);
    }
    
    @Override
    public String toString(){
        String result = "";
        
        for(Resistor r : resistors){
            result = result + r.toString() + "\n";
        }
        
        return result;
    }
    
    //checking output
    /*
    public static void main(String[] args){
        Node node_uno = new Node();
        Node node_due = new Node();
        Resistor r1 = new Resistor(30, node_uno, node_due);
        
        Node node_tre = new Node();
        Node node_quattro = new Node();
        Resistor r2 = new Resistor(150, node_tre, node_quattro);
        
        System.out.println(instance.toString());
    }
    */
}
