package seleniumBasics;

import java.nio.channels.SelectableChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown1 extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingDropdown1 handlingDropdown1=new HandlingDropdown1();
handlingDropdown1.initialiseBrowser();
handlingDropdown1.handlingDropdown1();
handlingDropdown1.driverCloseAndQuit();
	}
public void handlingDropdown1()
{
	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement dropDownElement=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
	dropDownElement.click();
	Select select=new Select(dropDownElement);
	//select.selectByIndex(1);
	//select.selectByVisibleText("Python");
	select.selectByValue("sql");
}
}
