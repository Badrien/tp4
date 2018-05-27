/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author adrie
 */
public class Instrument {
    
    public ArrayList<Fond> list;
    public String key;
    
    
    /**
     * Default constructor initialize the funds list at null
     */
    public Instrument()
    {
        this.list = new ArrayList<>();
    }
    
    public Instrument(ArrayList<Fond> i)
    {
        this.list = i;
    }
    
    public void addFonds(Fond f)
    {
        this.list.add(f);
    }
    
    public class FondComparator implements Comparator<Fond>
    {
        @Override
        public int compare(Fond o1, Fond o2) {
            return o1.compareTo(o2);
        }
        
    }
    
    /**
     * Method that sort the array of funds composing an instrument 
     */
    public void sortFonds()
    {
        this.list.sort(new FondComparator());
    }
    
    
    public void display()
    {
        for(int i = 0; i < this.list.size(); i++)
        {
            System.out.println(this.list.get(i).getAmount());
        }
    }
    
}
