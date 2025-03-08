package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckBox extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingCheckBox handling=new HandlingCheckBox();
		handling.initialiseBrowser();
		handling.handlingCheckBox();
		//handling.handlingRadioButton();
		//handling.driverCloseAndQuit();

	}
	public void handlingCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox1=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox1.click();	
		System.out.println(checkbox1.isSelected());
	}
	public void handlingRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");	
		WebElement radioButtonElement=driver.findElement(By.xpath("//input[@value='green']"));
		radioButtonElement.click();
		}
	} 

