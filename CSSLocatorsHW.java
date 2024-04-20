import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorsHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//1.by using tag and classname	
//		WebElement username=driver.findElement(By.cssSelector("input.inputtext"));
//		username.sendKeys("Neelavati pawar");
//		
//	//2.by using tag and id
//		WebElement pass=   driver.findElement(By.cssSelector("input#pass"));
//		pass.sendKeys("neelavati_p");
//		
	//3.by using tag and attribute
//		WebElement un=driver.findElement(By.cssSelector("input[type='text'][name='email']"));
//		un.sendKeys("Neelavati pawar");
		
		
//		
		//5.by using tag id and attribute [not working]
//		 //uses tag id(#) and atrributes(square brackets)
//		  WebElement login = driver.findElement(By.cssSelector("button#u_0_5_/i[type='submit'][value='1']"));
//		  login.click();
		
		//6.by using starts with-it will find the locators based on the starting character
//		WebElement un =driver.findElement(By.cssSelector("input[name^='ema']"));//if not given complete word then too it works like ema
//		un.sendKeys("pooja");
//		
		
		

	}

}
