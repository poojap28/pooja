import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleValueDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruits=driver.findElement(By.id("fruits"));
		Select select =new Select(fruits); 
		
		//to check if we can select the multiple value from the dropdown we can use is multiple
		if( select.isMultiple())
		{
		select.selectByIndex(0);
		select.selectByValue("apple");
		select.selectByValue("orange");
		}
		
//		select.deselectByIndex(0);
//		select.deselectByVisibleText("apple");
//		select.deselectByValue("orange");
		select.deselectAll();
		

	}

}
