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
public class Exclusive extends Decorator{
    private String description;
    private double price;
    Car car;
    
    public Exclusive(){
        this.description="Exclusive car";
        this.price=5;
    }
    
    public String getDescription(){
        System.out.println(car.getDescription()+"  " + description );
        return this.description +  " Exclusive";
    }
    
    public double cost(){
        return this.price+ car.cost();
    }
}
