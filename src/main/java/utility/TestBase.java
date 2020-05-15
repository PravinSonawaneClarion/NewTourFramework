package utility;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

public class TestBase {

	// Here we have declared the static variables which are required in all of the
	// test pages
	public static WebDriver driver;
	public static boolean state;
	public static Properties prop;

	// Here we will get the path of current directory
	// public String projectPath = System.getProperty("user.dir");

	// Here path for CSV files are stored
	// private final String CSV_FILE_PATH_MEMBER_NAME = projectPath +
	// "//TestData//FOCOS_Bulk_Charge_Entry.csv";

	
	
	/**
	 * @name : launchApplication
	 * @Purpose: Method to launch the application login window 
	 * @access: public
	 * @param: None
	 * @return: None
	 */
	public void launchApplication() throws InterruptedException, IOException {
		 
		try { 
			// Here we will goto URL which is present in constant properties files 
			driver.get(constants.ApplicationURL);
			driver.manage().window().maximize();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.err.println("Exception occurred : ");  
			e.printStackTrace(); 
		}
	}
	



}
