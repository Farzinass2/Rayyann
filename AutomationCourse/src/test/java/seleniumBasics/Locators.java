package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.By.ByXPath;

public class Locators extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locators=new Locators();
		locators.initialiseBrowser();
		locators.handlingLocators();
		locators.driverCloseAndQuit();

	}
public void handlingLocators()
{
driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
driver.findElement(By.id("single-input-field"));
driver.findElement(By.className("form-control"));
driver.findElement(By.tagName("button"));
driver.findElement(By.name("author"));
driver.findElement(By.linkText("Simple Form Demo"));
driver.findElement(By.partialLinkText("Radio Buttons"));
driver.findElement(By.cssSelector("button[id='button-one']"));
driver.findElement(By.xpath("//input[@id='single-input-field']"));
driver.findElement(By.xpath("//input[@id='value-a']"));
driver.findElement(By.xpath("//button[@id='button-two']"));
driver.findElement(By.xpath("//button[text()='Show Message']"));
driver.findElement(By.xpath("//button[text()='Get Total']"));
driver.findElement(By.xpath("//button[@type='button' and @id='button-two' ]"));
driver.findElement(By.xpath("(//button[@type='button' or @id='button-one' ])[3]"));
driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
}
}
//absolute xpath-html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input