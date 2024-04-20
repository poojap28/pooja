import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChexkBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		//to click on the single check box we need to find out the element and need to click on it
		
//		WebElement checkbox1=driver.findElement(By.id("checkbox1")); 
//		checkbox1.click();
////		
////		//to check the checkbox is already selected or not we need to use below logic
////		
//		if(checkbox1.isSelected())
//		{
//			System.out.println("checkbox is selected by default");
//		}
//		else
//		{
//			checkbox1.click();
//		
//		}
		
		  List<WebElement> checkboxes=driver.findElements(By.xpath("//*[@type='checkbox']"));
		  int size=checkboxes.size();
		  System.out.println(size);
		 //if u have multiple element and you want to perform operation on specific index you 
		 checkboxes.get(0).click();
		  for(int i=0;i<size;i++)
		  {
			  checkboxes.get(i).click();
		  }
		  
		  //dynamically=if hobbies values changes when we open the site 
		  for(int i=0;i<size;i++)
		  {
			  //get attribute method is used to fetch  the value of elements attribute as per given key
			  String value=checkboxes.get(i).getAttribute("value");
			  if(value.equalsIgnoreCase("hockey"))
			  {
				  checkboxes.get(i).click();
			  }
			  
		  }
		  
		  
	}

}
