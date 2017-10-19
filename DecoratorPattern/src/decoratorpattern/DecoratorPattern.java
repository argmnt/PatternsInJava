/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

/**
 *
 * @author Asus
 */
public class DecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Car car = new Lambo();
       Car car2 = new Sunroof(car);
       car2.getDescription();
       car2.cost();
    }
    
}
