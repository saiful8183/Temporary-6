package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectTest.LoginPage;

public class logintest {

	
	
	@Test
	public void verifyLogin() {
		
		//System.setProperty("webdriver.gecko.driver",
				//"C:\\Users\\Saiful Chowdhury\\Desktop\\Drivers\\geckodriver.exe");
        WebDriver driver= new ChromeDriver();
       
     

		driver.manage().window().maximize();
    
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.saucedemo.com/");
		
		
	    LoginPage Loginswag=new LoginPage(driver);
		
		  Loginswag.typeusername();
		  Loginswag.typepassword();
		  Loginswag.clickLoginBtn();
}
}