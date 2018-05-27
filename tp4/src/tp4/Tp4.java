/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adrie
 */
public class Tp4 {
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FondsExistant, InterruptedException {
        // TODO code application logic here
        
        //Create a 'Portefeuille' object by default for the test
        Portefeuille port = new Portefeuille();
        //Scanner to get the data from users
        Scanner sc = new Scanner(System.in);
    
        //Test of the method addFond
        
        //get the data of the fund to add
        System.out.println("----Test of the method 'addFond'----");
        System.out.println("Please enter the key of the fund you want to add");
        String key_f = sc.nextLine();
        System.out.println("Now enter the amount of the fund");
        double amount_f = sc.nextDouble();
        
        
        //use of the addFond method to add a fund to the portefeuille object 
        port.addFond(key_f, amount_f);
        
        
        //Test of the method addInstrument 
        
        //get the data of the fund to add
        System.out.println("----Test of the method 'addInstrument'----");
        System.out.println("Please enter the key of the instrument you want to add");
        
        Scanner scan = new Scanner(System.in);
        String key_i = scan.nextLine();
        scan.close();
        
        //Create a Fond object for the example 
        Fond fond = new Fond(10000);
        
        //use of the adFond method to add a fund to the portefeuille object 
        port.addInstrument(key_i, fond);
        
        System.out.println("----Test of the delete methods----");
        
        //delete of a Fond
        port.delFond(key_f);
        //delete of an Instrument 
        port.delInstrument(key_i);
        
        System.out.println("----Test of the sort method----");
        
        //Create several Fond to add to an Instrument object
        Fond f1 = new Fond(10000);
        Fond f2 = new Fond(50000);
        Fond f3 = new Fond(200000);
        Fond f4 = new Fond(7000);
        
        ArrayList<Fond> testFond = new ArrayList<>();
        testFond.add(f1);
        testFond.add(f2);
        testFond.add(f3);
        testFond.add(f4);
        //Create an Instrument object 
        Instrument inst = new Instrument(testFond);
        //Sort the Fond objects 
        inst.sortFonds();
        //Display the new ordered Fond objects list
        inst.display();
    
    }
    
}
