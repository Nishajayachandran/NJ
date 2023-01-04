package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2 {
	@Test(groups = "one")
	public void hi() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		
		List<WebElement> l = (List<WebElement>) driver.findElements(By.xpath("//*[@name='cars' and @type='radio']"));
		for(WebElement x:l)
		{
			x.click();
			Thread.sleep(2000);
		}
		Thread.sleep(3000);
		driver.quit();
		

	}

}
