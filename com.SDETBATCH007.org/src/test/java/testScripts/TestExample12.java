package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExample12 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Sales')])[1]")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//p[contains(text(),' Orders')]")).click();
		WebElement country = driver.findElement(By.id("BillingCountryId"));
		Select selection = new Select(country);
		List<WebElement> allcountry = selection.getOptions();
		System.out.println(" all county count is  ?" + allcountry.size());
		Thread.sleep(1300);
		selection.selectByVisibleText("Botswana");
		Thread.sleep(1200);
		selection.selectByIndex(100);
		Thread.sleep(1200);
		selection.selectByValue("19");
		Thread.sleep(1200);
		driver.quit();

	}

}
