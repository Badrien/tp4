/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author micha
 */
public class Display {
    
    public Portefeuille p;
    public Display(Portefeuille g) {
        p = g;
    }
    
   
    public void displayFonds(String k) 
    {
        try {
            p.searchFond(k);
            double amount = p.mapFonds.get(k).getAmount();
            HashMap<String, Integer> map;
            map = new HashMap<String, Integer>();
            int total = 0;
            int temp = 0;
            
            for(Map.Entry<String, Instrument> mapentry : p.mapInstruments.entrySet())
            {
                total = 0;
                for (int i = 0; i < mapentry.getValue().list.size(); i++) 
                {
                    temp = 0;
                    if(mapentry.getValue().list.get(i).key == k)
                    {
                        total ++;
                        temp ++;
                    }
                    if(total!=0)
                    {
                        map.put(mapentry.getKey(), temp);
                    }
                }

            }
            System.out.println("Répartition du fond n°"+k);
            for(Map.Entry<String, Integer> mapentry : map.entrySet())
            {
                int pc = (mapentry.getValue()/total)*100;
                System.out.println(pc+"%"+" sur l'instrument n°"+mapentry.getKey());
            }
            
        } catch (FondsInexistant e) {
            System.out.println("Ce fond n'existe pas");
        }
    }
    
    public void displayInstruments()
    {
        System.out.println("--------------- Infos sur l'instrument ---------------");
        
        for(Map.Entry<String, Instrument> mapentry : p.mapInstruments.entrySet())
        {
            double total = 0;
            System.out.println("La clé de cet instrument est : " + mapentry.getKey());
            System.out.println("Il possède " + mapentry.getValue().list.size() + "fonds");
            for (int i = 0; i < mapentry.getValue().list.size(); i++) 
            {
                total += mapentry.getValue().list.get(i).getAmount();
            }
            System.out.println("La somme de ses fonds est : " + total);
        }
    }
}
