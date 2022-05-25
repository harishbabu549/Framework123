package Flipkart.Flipkart.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart2 extends Base {

	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
	}
	
	@Test
	public void launchFlipkart() throws InterruptedException
	{
		driver.get(prop.getProperty("url"));
		WebDriverWait d=new WebDriverWait(driver,10);
		//click on create account
		d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.partialLinkText("New to Flipkart?"))));
		driver.findElement(By.partialLinkText("New to Flipkart?")).click();
		//entering mobile number
		driver.findElement(By.cssSelector("input._2IX_2-.VJZDxU")).sendKeys("9844638582");
		//click on continue
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//entering random otp
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/input")).sendKeys("123334");
		//entering password
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/input")).sendKeys("Flipkart@123");
		//click on sign up
		driver.findElement(By.cssSelector("button._2KpZ6l._2HKlqd _3AWRsL")).click();
		
	}
	
}
