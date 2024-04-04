package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks {
	

	@Given("one comes first")
	public void one_comes_first() {
	    System.out.println("one comes first");
	}
	@When("two comes after one")
	public void two_comes_after_one() {
	 System.out.println("two comes after one");   
	}
	@Then("three after two")
	public void three_after_two() {
	    System.out.println("three after two");
	}



}
