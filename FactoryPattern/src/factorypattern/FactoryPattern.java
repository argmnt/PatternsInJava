/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author Asus
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal a = factory.getAnimal("CAT");
        a.giveVoice();
    }
    
}
