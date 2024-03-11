package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rule-1 Create a class for a Web Page
public class NCProductsPage {

	WebDriver driver;

	// Rule-2 Provide the Web Elements information
	By productsCheckbox = By.xpath("//table[@id='products-grid']/tbody/tr[1]/td[1]/input");
	By deleteBtn = By.id("delete-selected");
	By yesBtn = By.xpath("//button[contains(text(), 'Yes')]");

	// Rule-3 Create the methods for each web elements
	public void selectProduct() {
		driver.findElement(productsCheckbox).click();
	}

	public void clickOnDelete() {
		driver.findElement(deleteBtn).click();
	}

	public void clickOnYes() {
		driver.findElement(yesBtn).click();
	}
	
	//Rule-4 Create the constructor for each page class with WebDriver object as argument
	public NCProductsPage(WebDriver d){
		this.driver = d;
	}

}
