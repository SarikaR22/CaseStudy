
package stepDefs;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hooks {
	/*
	 * @Before(order = 1,value="@regression") public void setUpFirst() { // Code to
	 * set up preconditions before scenarios
	 * System.out.println("Setting up first..."); }
	 * 
	 * @Before(order = 2,value="@smoke") public void setUpSecond() { // Additional
	 * setup before scenarios System.out.println("Setting up second..."); }
	 * 
	 * @After(order = 1,value="@regression") public void tearDownFirst() { // Code
	 * to clean up after scenarios System.out.println("Tearing down first..."); }
	 * 
	 * @After(order = 2,value="@smoke") public void tearDownSecond() { // Additional
	 * cleanup after scenarios System.out.println("Tearing down second..."); }
	 */
	
	@BeforeAll
	public static void before_all() {
		System.out.println("Before All ");
	}

    @Before(value="@chrome")
    public void setUp1() {
    System.out.println("Setting up browser from hooks ");
  	TestBase.initDriver("chrome");
    
       
    }
    
    @Before(value="@regression")
    public void setUp2() {
        // Code to set up preconditions before each scenario
    	System.out.println("***********************************");
        System.out.println("Setting up before scenario is regression");
    }

    @After
    public void tearDown() {
        // Code to clean up after each scenario
        System.out.println("Tearing down after scenario...");
        System.out.println("***********************************");
    }



}
