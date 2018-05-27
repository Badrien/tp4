/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author Michael
 */
public class InstrumentInexistant extends Exception {

    public InstrumentInexistant() {
        System.out.println("Error, the instrument you are looking for does not exist");
    }
    
}
