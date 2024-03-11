package ncPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ncPages.NCDashboardPage;
import ncPages.NCLoginPage;
import ncPages.NCUtilities;

public class ValidateNCLogin {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();

		NCLoginPage nlp = new NCLoginPage(driver);
		NCDashboardPage ndp = new NCDashboardPage(driver);
		NCUtilities ncu = new NCUtilities(driver);

		ncu.setUp();
		nlp.enterEmail();
		nlp.enterPassword();
		nlp.clickOnLoginBtn();
		Thread.sleep(5000);
		ndp.verifyDashboard();
		ncu.doLogout();
		Thread.sleep(5000);
		ncu.tearDown();

	}

}
