package Flipkart.Flipkart.com;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart extends Base {

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
	}
	
	@Test
	public void launchFlipkart()
	{
		driver.get(prop.getProperty("url"));
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
