import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		driver.manage().window().maximize();
		
		//4.doubleclick-it will double click on the given webelement
		Actions action=new  Actions(driver);
		
		//WebElement button=driver.findElement(By.xpath("//*[@id=\"post-body-7297556448793668582\"]/div[1]/button"));
		//action.doubleClick(button).perform();
		
		//5.drag and drop method
		
		WebElement draganddrop=driver.findElement(By.linkText("Drag and Drop"));
		draganddrop.click();
		
		WebElement drag=driver.findElement(By.id("dragdiv"));
		WebElement drop=driver.findElement(By.id("dropdiv"));
		//action.dragAndDrop(drag, drop).perform();
		action.dragAndDropBy(drag, 100, 100).perform();


	}

}
