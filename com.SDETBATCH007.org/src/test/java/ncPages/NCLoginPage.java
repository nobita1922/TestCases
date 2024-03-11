package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rule-1 create a class for a webpage
public class NCLoginPage {

	WebDriver driver;
	

	// Rule-2 provide the web elements information

	By email = By.id("Email");
	By pws = By.name("Password");
	By loginBtn = By.tagName("button");

	// Rule-3 Create methods for each web elements based on element type
	public void enterEmail() {
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("admin@yourstore.com");
	}

	public void enterPassword() {
		driver.findElement(pws).clear();
		driver.findElement(pws).sendKeys("admin");
	}

	public void clickOnLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
	//Rule-4 create constructor for each page class with WebDriver object as argument
	public NCLoginPage(WebDriver d){
		this.driver = d;
	}
}
