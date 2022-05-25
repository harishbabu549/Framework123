package Flipkart.Flipkart.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart3 extends Base {

	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
	}
	
	@Test
	public void launchFlipkart() throws InterruptedException
	{
		driver.get(prop.getProperty("url"));
		WebDriverWait d=new WebDriverWait(driver,10);
		driver.findElement(By.cssSelector("input._2IX_2-.VJZDxU")).sendKeys("user@123");
		driver.findElement(By.cssSelector("input._2IX_2-._3mctLh.VJZDxU")).sendKeys("user@123");
		driver.findElement(By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL")).click();
		Thread.sleep(3000);
		String errormessage= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/span[2]/span")).getText();
		System.out.println(errormessage);
	}
	
}
