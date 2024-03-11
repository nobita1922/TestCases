package ncPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rule-1 create a class for a web page
public class NCUtilities {

	WebDriver driver;
	
	// Rule-2 provide web elements information
	By catalog = By.xpath("(//p[contains(text(), 'Catalog')])[1]");
	By products = By.xpath("(//p[contains(text(), 'Products')])[1]");
	By logout = By.linkText("Logout");

	// Rule-3 create the methods for each web elements
	public void clickOnCatalog() {
		driver.findElement(catalog).click();
	}

	public void clickOnProducts() {
		driver.findElement(products).click();
	}

	public void doLogout() {
		driver.findElement(logout).click();
	}
	
	public void setUp() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	//Rule-4 Create the constructor for each page class with WebDriver object as argument
	public NCUtilities(WebDriver d) {
		this.driver = d;
	}

}
