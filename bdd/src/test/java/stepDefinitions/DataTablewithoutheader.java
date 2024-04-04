package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTablewithoutheader {
	WebDriver driver;

	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enters the credentials")
	public void user_enters_the_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<String> table = dataTable.asList(String.class);
		String name = table.get(0);
		String password = table.get(1);
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@When("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.className("oxd-button")).click();

	}

}
