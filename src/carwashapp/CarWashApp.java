/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carwashapp;

/**
 * CarWashApp
 * Queue 
 * @author Youcef
 * x13114557
 */
public class CarWashApp {

    /**
     * @param args the command line arguments
     */
    
    // A Queue should be used as a solution to solve this problem
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        IWash q = new MyWash();
                
        
        WashGUI gui = new WashGUI();
        gui.setVisible(true);
    }
    
}
