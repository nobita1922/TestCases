package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestExample22 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		driver.get("https://www.amazon.in/");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='nav-main']/div[1]/a")))).click();
		driver.findElement(By.xpath("//*[@id='hmenu-content']/ul/li[2]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
