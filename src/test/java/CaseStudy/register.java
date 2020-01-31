package CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class register {
	WebDriver driver;
	@When("chrome is navigated")
	public void chrome_is_navigated() {
		System.out.println("Lauches and navigates the chrome browser");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\Selenium drivers\\chromedriver.exe");
        driver=new ChromeDriver();
	}

	@When("testmeapp is launched")
	public void testmeapp_is_launched() {
	         driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
	         System.out.println("Navigates the application");
	}

	@When("you signup")
	public void you_signup() {
	   driver.findElement(By.linkText("SignUp")).click();
	   
	}

	@When("you fill up the registration details")
	public void you_fill_up_the_registration_details() {
		driver.findElement(By.name("userName")).sendKeys("nithish19m");
		driver.findElement(By.name("firstName")).sendKeys("nithish");
		driver.findElement(By.name("lastName")).sendKeys("vathul");
		driver.findElement(By.name("password")).sendKeys("nithish123");
		driver.findElement(By.name("confirmPassword")).sendKeys("nithish123");
		driver.findElement(By.name("firstName")).sendKeys("nithish");
		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("mjnithish@gmail.com");
		driver.findElement(By.name("mobileNumber")).sendKeys("7904660585");
		driver.findElement(By.name("dob")).sendKeys("11/19/1997");
		driver.findElement(By.name("address")).sendKeys("Madhavaram milk colony");
		Select sel=new Select(driver.findElement(By.name("securityQuestion")));sel.selectByVisibleText("What is your Birth Place?");
		driver.findElement(By.name("answer")).sendKeys("Chennai");
		driver.findElement(By.name("Submit")).click();
		
		
	}

	@Then("you register")
	public void you_register() {
	    System.out.println("Registered successfully");
	}

	@Then("close the application")
	public void close_the_application() {
	    driver.close();
	}



}
