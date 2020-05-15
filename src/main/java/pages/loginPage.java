package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Browser;
import utility.constants;

public class loginPage extends Browser {

	public loginPage(WebDriver driver) {
		this.driver = driver;

	}

	// Verify User logged-In
	public void verifyLoginSuccessful() throws Exception {
		submitLogin();

	}

	public void submitLogin() throws Exception {

		WebElement userName = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("login"));

        Thread.sleep(2000);
	
		userName.sendKeys(constants.Username);
		password.sendKeys(constants.Password);
		login.click();
	}

}
