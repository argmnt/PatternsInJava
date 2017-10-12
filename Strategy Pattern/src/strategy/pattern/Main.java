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
public class Main {
    public static void main(String [] args)
	{
           
            Human v1 = new Woman("Ayse",20);  
            v1.setSleepBehaviour(new SnortSleep());
            v1.performSleep();
            
            
	}

}
