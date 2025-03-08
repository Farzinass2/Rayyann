package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
public WebDriver driver;
	public static void main(String[] args) {
		Base base=new Base();
		base.initialiseBrowser();
		base.driverCloseAndQuit();
		// TODO Auto-generated method stub

	}
	public void initialiseBrowser()
	{
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		//driver=new EdgeDriver();
		driver.get("https://selenium.qabible.in");
		driver.manage().window().maximize();
	}
	public void driverCloseAndQuit()
	{
		//driver.close();
		driver.quit();
	}

}