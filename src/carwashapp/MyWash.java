/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carwashapp;

import java.util.ArrayList;

/**
 * MyWash
 * Queue 
 * @author Youcef
 * x13114557
 */
public class MyWash implements IWash{
    //use an Arraylist for queue data storage
    
    ArrayList<String> theWash;
    
    //Class Constructor
    public MyWash(){
        //Initialise the ArrayList
        theWash = new ArrayList<String>();
    }
    
    //This method will give a true or false response
    public boolean isEmpty()
    {
        return theWash.isEmpty();
    }
    
    //return int value of the number of vehicles stred in our Queue
    public int size()
    {
        return theWash.size();
    }
    
    //get the vehicle at the front of the queue
    public Object frontElement()
    {
        return theWash.get(0);
    }
    
    //add a vehicle to the end of the queue
    public void enqueue(Object element)
    {
        theWash.add((String)element);
    }
    
    //remove and return the object at the front of the queue
    public Object dequeue()
    {
        return theWash.remove(0);
    }
    
    public String display()
    {
        String tmp = "";
        
        for(int i=0; i<theWash.size(); i++)
        {
            tmp = tmp + theWash.get(i) + "\n";
        }
        return tmp;
    }
    
}
