import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//IDLOCATORS
//		WebElement username=driver.findElement(By.id("email"));
//		WebElement pass=driver.findElement(By.id("pass"));
//		WebElement login=driver.findElement(By.name("login"));
//	
//		username.sendKeys("Neelavati pawar");
//		pass.sendKeys("neelavati_p");
//    	login.click();

		
	//Name  Locator
//		WebElement username=driver.findElement(By.name("email"));
//		username.sendKeys("Neelavati pawar");
//		
//		WebElement pass=driver.findElement(By.name("pass"));
//		pass.sendKeys("neelavati_p");
//		
//		WebElement login=driver.findElement(By.name("login"));
//		login.click();
//		
		
		
		
		
		//classNamelocators
//       WebElement username=  driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
//		
//		WebElement password=  driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
//		
//		username.sendKeys("Neelavati pawar");
//		password.sendKeys("neelavati_p");
//		
//		WebElement login=driver.findElement(By.className("login"));
//		login.click();
		
		 
		
	}

}
