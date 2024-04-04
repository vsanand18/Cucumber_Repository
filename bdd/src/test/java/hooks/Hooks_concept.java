package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks_concept {
	//https://toolsqa.com/cucumber/tagged-hooks-in-cucumber/
	//To run tagged hooks use -> @Before("@tag") 
	//can also use tags ("@tag1", "tag2")
	@Before(order = 1)
public void before() {
	System.out.println("Zero comes before one");
}
	//To run tagged hooks use -> @After("@tag")
	//can also use tags ("@tag1", "tag2")
	@After(order = 1)
public void after() {
	System.out.println("four comes after three");	
}
	@Before(order = 0)
	public void before2() {
		System.out.println("first");
	}
	@After(order = 0)
	public void after2() {
		System.out.println("last");
	}
}
