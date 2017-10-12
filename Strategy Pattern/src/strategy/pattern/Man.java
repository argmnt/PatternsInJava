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
public class Man extends Human {
    public Man(String Name, int age) {
        super(Name,age);
    }

    @Override
    void performSleep() {
        super.sleepBehaviour.sleep();
    }
}
