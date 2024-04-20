import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndClearMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		 WebElement un= driver.findElement(By.id("email"));
		un.sendKeys("pooja");
		 
		 //to clear the populated text in textbox we need to use clear method
		 un.clear();
		 
		 //to fetch the value of particular element we can use gettext method
		 WebElement text=driver.findElement(By.tagName("h1"));
		 
		 String value =text.getText();
		 System.out.println(value);
		 
		

	}

}
