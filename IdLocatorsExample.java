import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//to find the element by using id locators firstly we need to create refernce variable  of webelement interface and need to use below syntax
		
		WebElement username= driver.findElement(By.id("email"));//in by we all the locators
		
		WebElement password= driver.findElement(By.id("pass"));
		
		 WebElement  login= driver.findElement(By.id("u_0_b"));
		 
		 
		 //sendkeys method is use to enter the values in textbox
		 
		 username.sendKeys("poojapawar@28gmail.com");
		password.sendKeys("pooja28");
		 
		 //click method is used to click on any button,radio button checkbox or link
		 login.click();
		
		Thread.sleep(1000);
		driver.close();

	}

}
