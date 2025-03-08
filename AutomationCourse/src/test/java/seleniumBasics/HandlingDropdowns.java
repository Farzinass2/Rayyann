package seleniumBasics;

import java.nio.channels.SelectableChannel;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdowns drop= new HandlingDropdowns();
		drop.initialiseBrowser();
		drop.handlingDropDown();
		//drop.driverCloseAndQuit();
		

	}
	public  void handlingDropDown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropdown1);
		//select.selectByIndex(1);
		//select.selectByVisibleText("JAVA");
	select.selectByValue("c#");
	}

}
