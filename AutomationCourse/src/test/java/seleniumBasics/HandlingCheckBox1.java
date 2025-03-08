package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckBox1 extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingCheckBox1 checkBox1=new HandlingCheckBox1();
checkBox1.initialiseBrowser();
checkBox1.handlingCheckBox1();
//checkBox1.driverCloseAndQuit();
//checkBox1.handlingRadioButton();
	}
	public void handlingCheckBox1()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox4=driver.findElement(By.xpath("//input[@value='option-4']"));
		checkbox4.click();
		System.out.println(checkbox4.isSelected());
		
		
	}
	public void handlingRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButtonElement=driver.findElement(By.xpath("//input[@value='blue']"));
		radioButtonElement.click();
	}

}
