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
public class FondsExistant extends Exception {
    
    public FondsExistant()
    {
        System.out.println("The fund you are currently trying to create, already exist");
    }
}
