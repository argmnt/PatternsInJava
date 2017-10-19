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
public class Sunroof extends Decorator {
    private String description;
    private double price;
    Car car;
    
    public Sunroof(Car car ){
        this.description="Sunroof car";
        this.price=3;
        this.car=car;
    }
    
    public String getDescription(){
        System.out.println(car.getDescription()+"  " + description );
        return this.description +  " Sunroof";
    }
    
    public double cost(){
        System.out.println(this.price+ car.cost()   );
        return this.price+ car.cost();
    }
}
