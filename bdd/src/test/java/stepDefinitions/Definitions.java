package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Definitions {
	WebDriver driver;

	@Given("User should enter google.co.in")
	public void user_should_enter_google_co_in() {
		// Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");

	}

	@When("User is typing the search term {string}")
	public void user_is_typing_the_search_term(String string) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(string);

	}

	@When("Enters the return key")
	public void enters_the_return_key() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);

	}

	@Then("User should be able to see the result")
	public void user_should_be_able_to_see_the_result() {
		// Write code here that turns the phrase above into concrete actions
		boolean statusvalue;
		try {
			statusvalue = driver.findElement(By.partialLinkText("helloworld")).isDisplayed();
		} catch (Exception e) {
			statusvalue = false;
		}

		if (statusvalue) {
			System.out.println("Cucumber framework is running");
		} else {
			System.out.println("Cucumber framework is not running");
		}
	}

}
