package inBuildTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

//Rule-1 Create a class for each web page
public class InBuildNCLoginPage {

	WebDriver driver;

	// Rule-2 provide all web elements information
	
	@CacheLookup
	@FindBy(id = "Email")
	WebElement email;
	
	@CacheLookup
	@FindAll({
		@FindBy(id = "Password"),
		@FindBy(name = "Password")
	})
	WebElement pws;
	
	@CacheLookup
	@FindBys({
		@FindBy(className = "buttons"),
		@FindBy(tagName = "button") 
		})
	WebElement loginBtn;

	// Rule-3 Create methods for each web elements
	public void enterEmail() {
		email.clear();
		email.sendKeys("admin@yourstore.com");
	}

	public void enterPassword() {
		pws.clear();
		pws.sendKeys("admin");
	}

	public void clickOnLoginBtn() {
		loginBtn.click();
	}

	// Rule-4 Create a constructor for each web page class with WebDriver object as
	// argument

	public InBuildNCLoginPage(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}

}
