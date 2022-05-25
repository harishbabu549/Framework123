package Flipkart.Flipkart.com;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart4 extends Base
{

	
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = initializeDriver();
	}
	
	@Test
	public void launchFlipkart() throws InterruptedException
	{
		//org.openqa.selenium.StaleElementReferenceException
		//org.openqa.selenium.ElementNotInteractableException
		//org.openqa.selenium.ElementNotClickableException
		driver.get(prop.getProperty("url"));
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
		
	 //WebElement heading=driver.findElement(By.xpath("//*[@id=\'container\']/div/div[3]"));
		
		WebElement ec =  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div"));
		List<WebElement> links= ec.findElements(By.cssSelector("[href*='https://www.flipkart.com/']"));
		System.out.println(links.size());
		/*for(WebElement x:links)
		{
			x.click();
			Thread.sleep(3000);
		}*/
	}
	
}
