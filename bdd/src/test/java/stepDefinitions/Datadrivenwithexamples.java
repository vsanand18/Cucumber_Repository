package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.When;

public class Datadrivenwithexamples {
	WebDriver driver;

	@When("the user enters the given credentials {string} {string}")
	public void the_user_enters_the_given_credentials(String string, String string2) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
		driver.findElement(By.className("oxd-button")).click();
	}

}
