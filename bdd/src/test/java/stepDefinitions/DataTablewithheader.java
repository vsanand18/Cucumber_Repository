package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTablewithheader {
	WebDriver driver;

	@Given("login page is displayed")
	public void login_page_is_displayed() {

	}

	@When("Enters the given credentials")
	public void enters_the_given_credentials(io.cucumber.datatable.DataTable dataTable) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		List<Map<String, String>> table = dataTable.asMaps(String.class, String.class);
		String Username = table.get(0).get("username");
		String Password = table.get(0).get("password");
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);

	}

	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.className("oxd-button")).click();

	}

}
