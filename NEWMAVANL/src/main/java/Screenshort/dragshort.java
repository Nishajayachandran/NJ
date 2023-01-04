package Screenshort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragshort {
	
	@Test(groups = "three")
	public void kl() throws InterruptedException, IOException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	       driver.get("https://jqueryui.com/droppable/");
	       File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(f, new File("C:\\Users\\ADMIN\\eclipse-workspace\\NEWMAVANL\\screenshort\\b.png"));
	  
	  driver.switchTo().frame(0);
	  Actions ac= new Actions(driver);
	  
	 WebElement ele1 = driver.findElement(By.id("draggable"));
	 WebElement ele2 = driver.findElement(By.id("droppable"));
	 ac.dragAndDrop(ele1, ele2).build().perform();
	 File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(f1, new File("C:\\Users\\ADMIN\\eclipse-workspace\\NEWMAVANL\\screenshort\\c.png"));
	 Thread.sleep(2000);
	 driver.quit();


}
}
