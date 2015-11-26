/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carwashapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Youcef
 */
public class CarTest {
    
    public CarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        WashGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
        
        IWash q;
        q= new MyWash();
        //add or remove enqueue to have something in the queue and return a true test.
        if(q.isEmpty()){
        assertTrue(q.isEmpty());
        }
        else{
            
            throw new RuntimeException("Queue is not empty");
        }
    }
    
    private void assertTrue(boolean empty) {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
