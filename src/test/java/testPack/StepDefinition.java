package testPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	
	@Given("^the user enter the login page$")
	public void the_user_enter_the_login_page(DataTable table)   {
		List<String> url = table.asList(String.class);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url.get(0));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

	@When("^the user enters the username and password$")
	public void the_user_enters_the_username_and_password(DataTable table)   {
		List<String> cre = table.asList(String.class);
		 driver.findElement(By.id("email")).sendKeys(cre.get(0));
		 driver.findElement(By.id("pass")).sendKeys(cre.get(1));
	}

	@And("^clicks the login$")
	public void clicks_the_login()   {
		driver.findElement(By.id("u_0_b")).click();
	}
	@Then("^the user home page$")
	public void the_user_home_page() {
		String a = driver.getCurrentUrl();
	System.out.println(a);
	}
}
