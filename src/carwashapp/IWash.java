/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carwashapp;

/**
 * IWash
 * Queue 
 * @author Youcef
 * x13114557
 */
public interface IWash {
    
    public boolean isEmpty();
    
    public int size();
    
    public Object frontElement();
    
    public void enqueue(Object element);
    
    public Object dequeue();
    
    public String display();
    
    
}
