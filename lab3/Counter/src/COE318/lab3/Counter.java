/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COE318.lab3;

/**
 *
 * @author Sam Bondi 500686504
 */
public class Counter {
    //Instance variables here
    int m, d, temp = 0;
    Counter l;
    
    public Counter(int modulus, Counter left) {
        m = modulus;
        l = left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return this.m;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return this.l;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return this.temp;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.temp = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        if(this.l == null){
            if(temp < m-1){
               temp++;
            }else{
               temp = 0;
            }  
        }else{
            if(temp < m-1){
               temp++;
            }else{
                temp = 0;
                l.temp++;
            }
        }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if(this.l == null){
            return temp;
        }else{
            return temp+(l.temp*m);
        }
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}

