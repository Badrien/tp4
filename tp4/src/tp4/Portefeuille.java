/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

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
        this.mapFonds = null;
        this.mapInstruments = null;
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
    
    
    public ArrayList<Fond> rechercheInstrument(String cle) throws InstrumentInexistant
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
        
        if(this.mapFonds.containsKey(k))
        {
            throw new FondsExistant();
        }
        else
        {
            Fond f = new Fond(a);
            this.mapFonds.put(k, f);   
        }
    }
    
    public void addInstrument(String k, Fond f)
    {
        
    }
    
    
    
}
