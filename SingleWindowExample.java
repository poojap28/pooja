import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		//window handle=session id generate
		
		driver.manage().window().maximize();
		
		//getwindow handle   method will store the unique session id of opened window
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button.click();
		
		//it will store the all the opened window after clicking on button
    	Set<String> childWindow = driver.getWindowHandles();//set doesnot take duplicate value.to store the window
    	Iterator <String>i=childWindow.iterator();//iterator=iteration like for loop
		while(i.hasNext())
		{
			String childWindow1=i.next();
			System.out.println(childWindow1);
			if(!parentWindow.equalsIgnoreCase(childWindow1))
			{
				driver.switchTo().window(childWindow1);
				WebElement download=driver.findElement(By.linkText("Downloads"));
				download.click();
				driver.close();//current open window will be closed
				
			}
		}
		driver.switchTo().window(parentWindow);//to switch on parent page from child page

	}

}
