package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Propertyfile pdata = new Propertyfile();
	public WebDriverutilities driverutilities = new WebDriverutilities();
	
	@BeforeMethod
	public void openApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getData("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException {
		//ITestResult is an interface we cannot create object but we can use reference variable
		int status = res.getStatus();
		String name = res.getName();
		
		if(status == 2) {
			Screenshot s = new Screenshot();
			s.getScreenshot(driver, name);
		}
		driver.quit();
	}
}
