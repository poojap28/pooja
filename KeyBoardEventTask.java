import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		WebElement current=driver.findElement(By.id("currentAddress"));
		WebElement permanent=driver.findElement(By.id("permanent Address"));
		
		Actions action=new Actions(driver);
		
		//enter the values in current address tab
		current.sendKeys("Pune");
		
		//we will select the all values in current address 
		//action.keyDown(Keys.CONTROL);
      // action.sendKeys("a");
       
       //keyup method will use to release the given key
     //  action.keyUp(Keys.CONTROL);
     //  action.build().perform();
       
       //now we will copy the entire address
  //     action.keyDown(Keys.CONTROL);
  //     action.sendKeys("c");
  //    action.keyUp(Keys.CONTROL);
  //    action.build().perform();
      
      //we  will switch to thw next element twe will use tab key
  //    action.sendKeys(Keys.TAB);
  //    action.build().perform();
      
      //last we will paste the address in permanent adress tab
      
 //     action.keyDown(Keys.CONTROL);
 //     action.sendKeys("v");
  //    action.keyUp(Keys.CONTROL);
   //   action.build().perform();
      
	}

}
