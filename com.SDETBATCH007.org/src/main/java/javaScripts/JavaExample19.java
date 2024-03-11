package javaScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExample19 {
	public static void main(String[] args) throws Exception {  // FOR LOOP
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Catalog')])[1]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Products')])[1]")).click();
		Thread.sleep(5000);
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr"));
		int rowcount = row.size();
		System.out.println("all rows count is " + rowcount);
		Thread.sleep(5000);
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr[1]/td"));
		int columncount = column.size();
		System.out.println("all column count is " + columncount);
		Thread.sleep(5000);
		for (int r = 1; r <= rowcount; r++) {
			for (int c = 1; c <= columncount; c++) {
				String val = driver
						.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();
				System.out.print(val + "  ");
			}
			System.out.println();
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
