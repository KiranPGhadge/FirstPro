package actitimetest1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actitimeLogo.ActitimeHomePage;

import actitimeLogo.ActitimeLoginPage;

public class ActitimeTest2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver92\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.setActitimeUsername();
		login.setActitimePassword();
		login.verifyActitimeLoginButton();

		Thread.sleep(2000);
		ActitimeHomePage home = new ActitimeHomePage(driver);
	    home.VerifyActitimeLogo();
		home.VerifyActitimeLogoutButton();
		Thread.sleep(2000);
		driver.close();


	}

}
