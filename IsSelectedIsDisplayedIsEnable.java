import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedIsDisplayedIsEnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		
		 boolean result=username.isDisplayed();
		 boolean result1=username.isEnabled();//enable =we can input the data or not
		 System.out.println(result);
		 System.out.println(result1);
		 
		 boolean result2=password.isDisplayed();//this is for password
		 boolean result3=password.isEnabled();
		 System.out.println(result2);
		 System.out.println(result3);
		 
		 //isdisplayed method is used to validate element is present or not 
         //isenable method is used to validate element is enabled or disable.
		 
		 if(username.isDisplayed() && username.isEnabled())
		 {
			 username.sendKeys("pooja");
		 }
		 else 
		 {
			 System.out.println("username is not displayed");
		 }
		if(password.isDisplayed() && password.isEnabled())	
		{
			password.sendKeys("pooja28");
		}
		else
		{
			System.out.println("password not displayed");
		}
		 
		WebElement checkbox =driver.findElement(By.id("persist_box"));
		
		//is selected method is use to validate checkbox or radio button is already selected or not
		boolean result5=checkbox.isSelected();
		 System.out.println(result5);
		
	}

}
