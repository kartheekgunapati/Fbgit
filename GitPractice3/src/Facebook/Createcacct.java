package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Createcacct {
	
	@Test
	public void acctCreate() throws Exception {
		
		fbdetails fbd = new fbdetails();
		System.setProperty("webdriver.chrome.driver", fbd.getChrome());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(fbd.getFbUrl());
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("User1");
		driver.findElement(By.name("lastname")).sendKeys("lastname");
		driver.findElement(By.name("reg_email__")).sendKeys("user1.lastname@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ryeeyywywy@gmail.com");
		driver.quit();
	}

}
