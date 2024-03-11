package ncTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncPages.NCDashboardPage;
import ncPages.NCLoginPage;
import ncPages.NCProductsPage;
import ncPages.NCUtilities;

public class ValidateDeleteFunctionalityInProductPage {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		NCUtilities ncu = new NCUtilities(driver);
		NCLoginPage nlp = new NCLoginPage(driver);
		NCDashboardPage ndp = new NCDashboardPage(driver);
		NCProductsPage npp = new NCProductsPage(driver);

		ncu.setUp();
		nlp.enterEmail();
		nlp.enterPassword();
		nlp.clickOnLoginBtn();
		Thread.sleep(5000);
		ndp.verifyDashboard();
		ncu.clickOnCatalog();
		Thread.sleep(3000);
		ncu.clickOnProducts();
		Thread.sleep(7000);
		npp.selectProduct();
		Thread.sleep(3000);
		npp.clickOnDelete();
		Thread.sleep(5000);
		npp.clickOnYes();
		Thread.sleep(5000);
		ncu.doLogout();
		Thread.sleep(5000);
		ncu.tearDown();

	}

}
