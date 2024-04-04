package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orange {
WebDriver driver;

	@Given("when the user is on the login page")
	public void when_the_user_is_on_the_login_page() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}
	@When("user should enter the username and password")
	public void user_should_enter_the_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	    
	}
	@When("user should click on the login button")
	public void user_should_click_on_the_login_button() {
		driver.findElement(By.className("oxd-button")).click();
	}
	@Then("user should be navigate to the home page")
	public void user_should_be_navigate_to_the_home_page() {
		driver.findElement(By.partialLinkText("Dashboard"));
	   
	}



}
