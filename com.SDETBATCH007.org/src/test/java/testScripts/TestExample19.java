package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample19 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.id("Email")).sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
		driver.findElement(By.xpath("(//*[contains(text(),'Catalog')])[1]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Sales')])[1]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Customers')])[1]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Promotions')])[1]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Content management')]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Configuration')])[1]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'System')])[1]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Reports')])[1]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Help')])[1]")).click();
		driver.quit();

	}

}
