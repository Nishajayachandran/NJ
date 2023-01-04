package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mavanfirstcoding {
	//file => project  => mavan  project => create a simple => groupid , artifaceid =finish
	// right click on project => package => class=> test cases
	//mvnrepositort.com
	//selenium hq server standane 	=> selenium java=> 3.41.59 => copy the code
	@Test (groups= "one")
	public void fg()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// Visiting website
		driver.get("https://berrythought.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
