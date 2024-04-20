import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement country=driver.findElement(By.name("country"));
		Select select=new Select(country);//to select the the values from dropdown list
		//create a object for select class
		
//		//1.select by visible text
//		select.selectByVisibleText("CHINA");
//		
//		//2.select by value
//		select.selectByValue("ALGERIA");
//		
//		//3.select by index
//		select.selectByIndex(6);
//		
		

	}

}
