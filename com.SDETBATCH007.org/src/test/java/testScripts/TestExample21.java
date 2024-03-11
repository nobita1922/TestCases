package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestExample21 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("button")))).click();
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath("(//div[@class='row'])[1]/div/div[1]/div/div/div[1]/div/button[1]"))))
				.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath("//div[@id='configuration-steps-card']/div[1]/div/button[1]"))))
				.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[@class='row']/div/div[2]/div/div/div[1]/div[2]"))))
				.click();
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[@class='row']/div/div[2]/div/div/div[1]/div[2]"))))
				.click();
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[@id='nopcommerce-common-statistics-card']/div[1]/div[2]/button"))))
				.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='inner']/following-sibling::a")))).click();
		driver.navigate().back();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[@class='inner'])[2]/following-sibling::a")))).click();
		driver.navigate().back();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[@class='inner'])[3]/following-sibling::a")))).click();
		driver.navigate().back();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[@class='inner'])[4]/following-sibling::a")))).click();
		driver.navigate().back();
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[@id='nopcommerce-common-statistics-card']/div[1]/div[2]/button"))))
				.click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Logout']")))).click();
		driver.quit();

	}

}
