package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample17 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indiabix.com/");
		driver.findElement(By.xpath("(//*[contains(text(),'Current Affairs')])[4]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//a[text()='16'])[1]")).click();
		Thread.sleep(1500);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//*[contains(text(),'Arithmetic')])[2]")).click();
		driver.findElement(By.partialLinkText("Arithmetic")).click();
		Thread.sleep(1500);
		driver.quit();
	}

}
