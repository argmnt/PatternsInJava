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
public class Cat extends Animal {
    
    public Cat(){
    super.setName("Cat");
    super.setVoice("Meow!");
}

    @Override
    public String giveVoice() {
        System.out.println(super.getVoice());
        return getVoice();
    }
}
