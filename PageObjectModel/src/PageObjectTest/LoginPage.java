package PageObjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{

	WebDriver driver;
	
	
	

	By username=By.id("user-name");
	By password=By.id("password");
	By loginbtn=By.className("submit-button btn_action");
	
	
	
	public LoginPage(WebDriver driver)
	{
	this.driver	=driver;
	
	}
	
	
	public void typeusername() {
		
		driver.findElement(username).sendKeys("standard_user");
	}
	
	public void typepassword() {
	driver.findElement(password).sendKeys("secret_sauce");
	
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginbtn).click();	
		
	
}

}
	
