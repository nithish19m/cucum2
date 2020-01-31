package CaseStudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class payment {
	WebDriver driver;

@When("chrome is being navigated")
public void chrome_is_being_navigated() {
    System.out.println("Chrome is launched");
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\Selenium drivers\\chromedriver.exe");
    driver=new ChromeDriver();
}
@When("launching TestMeApp")
public void launching_TestMeApp() {
	System.out.println("When lauching TestMeApp");
    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
}

@When("SignIn is clicked")
public void signin_is_clicked() {
    System.out.println("Sign is clicked");
    driver.findElement(By.linkText("SignIn")).click();
    
}

@When("Username and password is entered")
public void username_and_password_is_entered() {
	   driver.findElement(By.name("userName")).sendKeys("lalitha");
	   driver.findElement(By.name("password")).sendKeys("Password123");
}

@When("Login is clicked")
public void login_is_clicked() {
	   driver.findElement(By.name("Login")).click();
}

@When("the product is entered and found")
public void the_product_is_entered_and_found() {
	driver.findElement(By.name("products")).sendKeys("head");
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}

@When("proceed to cart without a product")
public void proceed_to_cart_without_a_product() {
	String a=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText();
	Assert.assertFalse(a,false);
}

@Then("TestMeApp wont display cart icon")
public void testmeapp_wont_display_cart_icon() {
     System.out.println("TestMe doesnt display cart icon");
}



}
