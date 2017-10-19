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
public abstract class Decorator extends Car{
    
    public abstract String getDescription();
    public abstract double cost();
    
}
