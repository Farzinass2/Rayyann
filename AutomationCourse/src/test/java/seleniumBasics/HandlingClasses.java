package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingClasses extends Base {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		HandlingClasses handlingClasses=new HandlingClasses();
		handlingClasses.initialiseBrowser();
		handlingClasses.verifyRightClick();
		try {
			handlingClasses.verifyKeyBoardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		handlingClasses.verifyMouseHover();
		handlingClasses.verifyDragAndDrop();
		//handlingClasses.driverCloseAndQuit();

	}
	public void verifyRightClick()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmessagElement=driver.findElement(By.id("button-one"));
		Actions actions=new Actions(driver);
		actions.contextClick(showmessagElement).build().perform();
	}
public void verifyMouseHover()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement mousElement=driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(mousElement).build().perform();
	
}
public void verifyDragAndDrop()
{
	driver.navigate().to("https://demoqa.com/droppable");
	WebElement dragElement=driver.findElement(By.id("draggable"));
	WebElement dropElement=driver.findElement(By.id("droppable"));
	Actions actions=new Actions(driver);
	actions.dragAndDrop(dragElement, dropElement).build().perform();
}
public void verifyKeyBoardActions() throws AWTException
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_T);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_T);
	
}
}

