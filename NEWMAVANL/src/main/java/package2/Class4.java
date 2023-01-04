package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class4 {
	@Test(groups = "two")
	public void navi() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/index.php");
		
		  //control+a => selection
		  //control+c=> copy
		  //control+v=> pasting
		  //tab key => move to the next element
		  
		 WebElement ele = driver.findElement(By.id("user"));
		 Actions ac= new Actions(driver);
		 ac.click(ele).sendKeys("hi").build().perform();
		 
		 //Control+a
		 ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		 
		//Control+c
	    ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	    
	    //tab
	    ac.sendKeys(Keys.TAB).build().perform();
	    

		//Control+v
	    ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(3000);
        driver.quit();

	}

}
