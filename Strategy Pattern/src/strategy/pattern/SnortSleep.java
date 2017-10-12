/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 *
 * @author Asus
 */
public class SnortSleep implements SleepInterFace {

    @Override
    public void sleep() {
         System.out.println("Snorting Sleep has executed.");
    }
    
    
    
}
