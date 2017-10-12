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
public abstract class Human {
    private String Name;
    private int age;
    SleepInterFace sleepBehaviour;
    
    public Human(String Name, int age){
        this.Name=Name;
        this.age=age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    abstract void performSleep();

  

    public void setSleepBehaviour( SleepInterFace a) {
        this.sleepBehaviour = a;
    }

    

}