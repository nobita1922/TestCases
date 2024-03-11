package ncTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import inBuildTestCases.InBuildNCLoginPage;
import ncPages.NCUtilities;

public class ValidateNCLoginWithInBuiltPOM {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		NCUtilities ncu = new NCUtilities(driver);
		InBuildNCLoginPage inlp = new InBuildNCLoginPage(driver);

		ncu.setUp();
		Thread.sleep(5000);
		inlp.enterEmail();
		inlp.enterPassword();
		inlp.clickOnLoginBtn();
		Thread.sleep(5000);
		ncu.doLogout();
		Thread.sleep(5000);
		ncu.tearDown();

	}

}
