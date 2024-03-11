package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExample11 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(5000);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("(//p[contains(text(), 'Catalog')])[1]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//p[contains(text(), 'Products')])[1]")).click();

		Thread.sleep(5000);

		WebElement category = driver.findElement(By.id("SearchCategoryId"));

		Select selection = new Select(category);

		List<WebElement> allOptions = selection.getOptions();

		System.out.println("All Options Count is : "+allOptions.size());

		selection.selectByVisibleText("Electronics");

		Thread.sleep(3000);

		selection.selectByIndex(14);

		Thread.sleep(3000);

		selection.selectByValue("1");

		Thread.sleep(7000);

		driver.quit();

	}

}
