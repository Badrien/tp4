/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.ArrayList;
import static java.util.Collections.sort;
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
    
 
    
    /**
     * Method that sort the array of funds composing an instrument 
     */
    public void sortFonds()
    {
      sort(this.list);
    }
    
    
    public void display()
    {
        for(int i = 0; i < this.list.size(); i++)
        {
            System.out.println(this.list.get(i).getAmount());
        }
    }
    
}
