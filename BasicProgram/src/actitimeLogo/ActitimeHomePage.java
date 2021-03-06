package actitimeLogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeHomePage {
	private WebElement logo;
	private WebElement logout;
	WebDriver driver;

	// Initialization

	public ActitimeHomePage(WebDriver driver) {
		this.driver = driver;
		logo = driver.findElement(By.xpath("//img[@height='61']"));
		logout = driver.findElement(By.xpath("//a[@id='logoutLink']"));

	}

	public void VerifyActitimeLogo() {
		boolean res = logo.isDisplayed();
		if (res == true) {
			System.out.println("Test Scenario is Passed" + res);
		} else {
			System.out.println("Test Scenario is Failed" + res);
		}
	}

	public void VerifyActitimeLogoutButton() {
		logout.click();
	}


}
