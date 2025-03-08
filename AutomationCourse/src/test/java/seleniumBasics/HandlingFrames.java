package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingFrames handlingFrames=new HandlingFrames();
handlingFrames.initialiseBrowser();
handlingFrames.handligFrames();
handlingFrames.driverCloseAndQuit();
	}
	public void handligFrames()
	{
		driver.navigate().to("https://demoqa.com/frames\r\n");
		List<WebElement>iFrames=driver.findElements(By.tagName("iframe"));
		System.out.println(iFrames.size());
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame("frame1");
		WebElement frametextElement=driver.findElement(By.id("sampleHeading"));
		System.out.println(frametextElement.getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
	}

}
