/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author adrie
 */
public class Fond implements Comparable<Fond> {
    
    private double amount;
    private String key;
    
    
    /**
     * Default constructor 
     */
    public Fond()
    {
        this.amount = 0;
    }
    
    
    /**
     * Constructor that initialize the amount
     * @param a 
     */
    public Fond(double a)
    {
        this.amount = a;
    }
    
    public double getAmount()
    {
        return this.amount;
    }
    
    
    public boolean equals(Fond f)
    {
        return f.getAmount() == this.amount;
    }

    @Override
    public int compareTo(Fond o) 
    {
        if(this.amount > o.getAmount())
            return 1;
        else if(this.equals(o))
            return 0;
        else
            return -1;
    }
}
