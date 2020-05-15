package functionality;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.Browser;
import utility.TestBase;
import pages.loginPage;

public class loginPageTest extends TestBase {

	private WebDriver driver;
	private Browser b = new Browser();


	@Parameters({ "browser", "environment", "os" })
	@BeforeClass
	public void setUp(String browser, String environment, String OS) throws Exception {

		// Here we are launching the driver and browser
		driver = b.setUp(browser, environment, OS);
		// Here we are launching the login window
		launchApplication();

		
	}

	
	@Test 
	public void LoginPageScenarioTest() throws Exception {
		loginPage LP = new loginPage(driver);
		LP.verifyLoginSuccessful();
	}

	

	@AfterClass
	public void teardown() throws Exception {

		// After logout we will quite the browser
		b.quitBrowser();
		// As it takes time quit the browser we will wait for 3 seconds
		Thread.sleep(3000);

	}

}
