package seleniumBasics;

public class HandlingNavigationCommand extends Base{

	public static void main(String[] args) {
		
HandlingNavigationCommand navigate =new HandlingNavigationCommand();
navigate.initialiseBrowser();
navigate.handlingNavigationCommands();
navigate.driverCloseAndQuit();
	}
	public void handlingNavigationCommands()
	{
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	

}
