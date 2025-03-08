package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void handlingWebCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageFieldElement=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageFieldElement.sendKeys("farzina");
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showmessagebutton.isDisplayed());
		System.out.println(showmessagebutton.isEnabled());
		showmessagebutton.click();
		messageFieldElement.clear();
		System.out.println(showmessagebutton.getCssValue("background-color"));
		System.out.println(messageFieldElement.getTagName());
		WebElement yourmessagElement=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(yourmessagElement.getText());
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands web=new WebElementCommands();
		web.initialiseBrowser();
		web.handlingWebCommands();
		web.driverCloseAndQuit();
	}

}
