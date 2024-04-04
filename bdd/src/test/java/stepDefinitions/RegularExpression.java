package stepDefinitions;

import io.cucumber.java.en.Given;

public class RegularExpression {
	
	@Given("i have {int} pen")
	public void i_have_pen(Integer int1) {
	   System.out.println(int1);
	}
	@Given("my percentage is {double}")
	public void my_percentage_is(Double double1) {
	   System.out.println(double1);
	}
	@Given("my id is {string}, {string} and {string}")
	public void my_id_is_and(String string, String string2, String string3) {
	   System.out.println(string +" "+ string2 +" "+ string3);
	}



}
