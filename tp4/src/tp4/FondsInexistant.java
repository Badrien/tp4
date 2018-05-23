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
public class FondsInexistant extends Exception {
    
    public FondsInexistant()
    {
        System.out.println("Error, the fund, you are looking for does not exist");
    }
}
