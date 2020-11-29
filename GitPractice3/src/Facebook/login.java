package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	
	@Test
	public void fblogin() throws Exception {
		
		fbdetails fbd = new fbdetails();
		System.setProperty("webdriver.chrome.driver", fbd.getChrome());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(fbd.getFbUrl());
		driver.findElement(By.name("email")).sendKeys(fbd.getUserName());
		driver.findElement(By.name("pass")).sendKeys(fbd.getPassWord());
		driver.quit();
			
	}

}
