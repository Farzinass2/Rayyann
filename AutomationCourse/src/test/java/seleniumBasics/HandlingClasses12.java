package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingClasses12 extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingClasses12 handling=new HandlingClasses12();
handling.initialiseBrowser();
handling.verifyrightClick();
handling.verifyMouseHover();
handling.dragAndDrop();
try {
	handling.keyboardActions();
} catch (AWTException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
handling.driverCloseAndQuit();
	}
	public void verifyrightClick()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessaElement=driver.findElement(By.id("button-one"));
		Actions actions=new Actions(driver);
		actions.contextClick(showMessaElement).build().perform();
		
	}
public void verifyMouseHover()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement mousElement=driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(mousElement).build().perform();
}
public void dragAndDrop()
{
	driver.navigate().to("https://demoqa.com/droppable");
	WebElement dragElement=driver.findElement(By.id("draggable"));
	WebElement dropElement=driver.findElement(By.id("droppable"));
	Actions actions=new Actions(driver);
	actions.dragAndDrop(dragElement, dropElement).build().perform();
	
}
public void keyboardActions() throws AWTException
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_T);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_T);
}
}
