package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExample13 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(),'Sales')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),' Orders')]")).click();
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.id("BillingCountryId"));
		Select selection = new Select(country);
		selection.selectByIndex(5);
		Thread.sleep(3000);
		selection.selectByValue("100");
		selection.selectByVisibleText("Congo (Democratic Republic of the)");
		Thread.sleep(3000);
		List<WebElement> allcountry = selection.getOptions();				
		for (WebElement singleOption : allcountry) {
			String countrynames = singleOption.getText();
			System.out.println(countrynames);
		}
		driver.quit();

	}

}
