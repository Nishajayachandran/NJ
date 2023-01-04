package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Classs3 {
	@Test(groups = "two")
	public void kl() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	       driver.get("https://jqueryui.com/droppable/");
	  
	  //webelements=> present inside a frame
	  // switch your control to that frame
	  // index, name or id
	  
	  driver.switchTo().frame(0);
	  Actions ac= new Actions(driver);
	  
	 WebElement ele1 = driver.findElement(By.id("draggable"));
	 WebElement ele2 = driver.findElement(By.id("droppable"));
	 ac.dragAndDrop(ele1, ele2).build().perform();
	 
	 Thread.sleep(2000);
	 driver.quit();

	}

}
