import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkTextLocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
	   WebElement forgot=driver.findElement(By.linkText("Forgot your password?"));//full sentence
	   forgot.click();
 
		//  WebElement forgot=   driver.findElement(By.partialLinkText("pass"));//we can take only letter or one word like pass pr word
     	  //forgot.click();
//
	}

}
