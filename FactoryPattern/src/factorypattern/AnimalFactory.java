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
public class AnimalFactory {
    public Animal getAnimal(String animal){
        if(animal== null){
            return null;
        }
        else if(animal.equalsIgnoreCase("CAT")){
            return new Cat();
        }
        else if(animal.equalsIgnoreCase("DOG")){
            return new Dog();
        }
        return null;
    }
}
