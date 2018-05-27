/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;


/**
 *
 * @author adrie
 */
public class Portefeuille {
    
    Map<String, Fond> mapFonds;
    Map<String, Instrument> mapInstruments;
    
    
    /**
     * Default constructor 
     */
    public Portefeuille()
    {
        this.mapFonds = new Hashtable();
        this.mapInstruments = new Hashtable();
    }
    
    public double searchFond(String k) throws FondsInexistant
    {
        if(!this.mapFonds.containsKey(k))
        {
            throw new FondsInexistant();
        }
        else
            return this.mapFonds.get(k).getAmount();
    }
    
    
    public ArrayList<Fond> searchInstrument(String cle) throws InstrumentInexistant
   {
       
       if(this.mapInstruments.containsKey(cle))
       {
           return(mapInstruments.get(cle).list);
       }
       else
       {
           throw new InstrumentInexistant();
       }
   }
    
    
    public void addFond(String k, double a) throws FondsExistant 
    {
        try{
            this.searchFond(k);
            throw new FondsExistant(); 
        }
        catch(FondsInexistant e)
        {
            Fond f = new Fond(a);
            this.mapFonds.put(k, f);
            System.out.println("Fond succesfully added");
        }
    }
    
    /**
     *
     * @param k
     * @param f
     * Add an instrument if it does not already exist
     */
    public void addInstrument(String k, Fond f) 
    {
        try
        {
           this.searchInstrument(k);
           
        }
        catch(InstrumentInexistant e)
        {
            //Create an instrument 
            Instrument i = new Instrument();
            
            //Call to the function that add funds to an instrument 
            i.addFonds(f);
            
            //Add the instrument to the map of the "portefeuille"
            this.mapInstruments.put(k, i);
        }
    }
    
    public void delFond(String k)
    {
        try{
            double a = this.searchFond(k);
            this.mapFonds.remove(k, a);
            System.out.println("The funds have been correctly deleted");
            
        }
        catch(FondsInexistant e)
        {
            e.getMessage();
        }
    }
    
    
    public void delInstrument(String k)
    {
        try{
            ArrayList<Fond> a = this.searchInstrument(k);
            for(int i = 0; i < a.size(); i++)
            {
                a.remove(i);
            }
            this.mapInstruments.remove(k);
            System.out.println("The instrument have been correctly deleted");
            
        }
        catch(InstrumentInexistant e)
        {
            e.getMessage();
        }
    }
    
    
    
}
