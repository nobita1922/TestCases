package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rule-1 create a class for a web page
public class NCDashboardPage {
	
	WebDriver driver;
	
	//Rule-2 Provide the web elements information
	By dashboard = By.xpath("//h1[contains(text(), 'Dashboard')]");
	
	//Rule-3 Create methods for each web elements
	public void verifyDashboard() {
		boolean val = driver.findElement(dashboard).isDisplayed();
		if(val==true) {
			System.out.println("Login Success");
		}
		else {
			System.out.println("Login Failed");
		}
	}
	
	//Rule-4 Create the constructor for each page class with WebDriver object as argument
	public NCDashboardPage(WebDriver d){
		this.driver = d;
	}
	
	
}
