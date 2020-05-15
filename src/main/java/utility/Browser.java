package utility;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser extends TestBase {

	/* Set up method to lunch browser */
	public WebDriver setUp(String browser, String environment, String OS) throws Exception {

		Random t = new Random();
		Thread.sleep(t.nextInt(15) * 1000);

		if (environment.equalsIgnoreCase("Local")) {

			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "src/test/resources/BrowserDrivers/geckodriver_0.18.exe");
				driver = new FirefoxDriver();
				// driver.manage().window().maximize();
			}

			else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "src/test/resources/BrowserDrivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();

			}

			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src/test/resources/BrowserDrivers/chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("TestEnvSetup.launchBrowser() driver " + driver);
			}
		}
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(90, TimeUnit.SECONDS);

		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}

	/*
	Tear down method to quit browser after test execution
	*/
	public void quitBrowser() throws Exception 
	  {  
		    try
	        {
		    	//Thread.sleep(5000);
		    	//driver.close();
	            Thread.sleep(3000);
	            driver.quit();
	        }
	        catch(Exception e)
	        {
	        }
		   
	  }
}
