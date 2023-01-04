package autoit;

import org.openqa.selenium.chrome.ChromeDriver;

public class auto {
	public static void main (String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.filemail.com/share/upload-file");
		Thread.sleep(3000);
		ob.findElementByCssSelector("#addBtn").click();
		Thread.sleep(3000);
		//Runtime.getRuntime().exec("D:\\Fileupload.exe");



	}

}
