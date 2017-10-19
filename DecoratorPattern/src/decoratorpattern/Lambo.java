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
public class Lambo extends Car {
    private String name;
    private double price;
    
    
    public Lambo(){
        this.name="Lambo car ";
        this.price=10;
    }
    
    public String getDescription(){
        System.out.println(name);
        return this.name;
    }
    public double cost(){
        return this.price;
    }
}
