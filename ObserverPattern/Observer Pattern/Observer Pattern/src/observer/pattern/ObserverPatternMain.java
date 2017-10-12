/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.pattern;

/**
 *
 * @author Asus
 */
public class ObserverPatternMain {

    public static void main(String[] args) {
        Server s1 = new Server();
        Client c1 = new Client(s1);
        Client c2 = new Client(s1);
        c1.setVisible(true);
        s1.setVisible(true);
        c2.setVisible(true);
        
    }
    
}
