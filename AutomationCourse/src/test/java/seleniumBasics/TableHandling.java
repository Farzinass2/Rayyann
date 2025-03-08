package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TableHandling handling=new TableHandling();
handling.initialiseBrowser();
handling.tableHandling();
//handling.driverCloseAndQuit();
	}
public void tableHandling()
{
	driver.navigate().to("https://money.rediff.com/indices/nse");
	WebElement showmore1=driver.findElement(By.xpath("//a[@id='showMoreLess']"));
	showmore1.click();
	WebElement fullTablElementCommands=driver.findElement(By.xpath("//table[@id='dataTable']"));
	System.out.println(fullTablElementCommands.getText());
	WebElement tableRoWebElement=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]"));
	System.out.println(tableRoWebElement.getText());
	}
}
