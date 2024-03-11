package javaScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExample22 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Catalog')])[1]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Products')])[1]")).click();
		Thread.sleep(5000);
		List<WebElement> allinputs = driver.findElements(By.xpath("//input"));

		for (WebElement input : allinputs) {
			String val = input.getAttribute("name");
			System.out.println(val);
		}
		driver.quit();

	}

}
