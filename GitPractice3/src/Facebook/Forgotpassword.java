package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Forgotpassword {
	
	
	@Test
	public void fbForgot() throws Exception {
		fbdetails fbd = new fbdetails();
		System.setProperty("webdriver.chrome.driver", fbd.getChrome());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(fbd.getFbUrl());
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys(fbd.getUserName());
		driver.quit();
		
	}

}
