/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.ArrayList;

/**
 *
 * @author adrie
 */
public class Instrument {
    
    ArrayList<Fond> list;
    
    
    /**
     * Default constructor initialize the funds list at null
     */
    public Instrument()
    {
        this.list = null;
    }
    
    public Instrument(ArrayList<Fond> i)
    {
        this.list = i;
    }
    
    public void addFonds(Fond f)
    {
        this.list.add(f);
    }
    
    
    
}
