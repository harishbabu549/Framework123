package Flipkart.Flipkart.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Base {
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\My workspace\\Flipkart.com\\src\\test\\java\\Flipkart\\Flipkart\\com\\data.properties");
		prop.load(fis);
		
		//String browsername =System.getProperty("browser");
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Apps\\Selenium Latest\\Chrome Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Apps\\Selenium Latest\\Gecko driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Apps\\Selenium Latest\\Edge driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browsername.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver",
					"D:\\Apps\\Selenium Latest\\Opera Driver\\operadriver_win64\\operadriver.exe");
			OperaOptions options=new OperaOptions();
			options.addArguments("headless");			
			driver = new OperaDriver(options);
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

}
