import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorsExample {//css loactors are dynamic ,dynamic means which is user created

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
//		//1.by using tag and class name
//		//tag and classname use dot
//		
//		 WebElement un= driver.findElement(By.cssSelector("input.inputtext"));
//		 
//		 //2.by using tag and id
//		  WebElement pass= driver.findElement(By.cssSelector("input#pass"));
//		 
 //        un.sendKeys("poojapawar@28");
//	     pass.sendKeys("pooja123");
//		 
		 //3.by using tag and attribute
		//uses square brackets
		
 //  	 WebElement un=  driver.findElement(By.cssSelector("input[type='text'][name='email']"));//multiple attributes can also be used
//		 
//		 //4.by using tag,class and attributes
//		 //for tag=input.inputtxt and attributes =square brackects
//		 
 //   	 WebElement pass=  driver.findElement(By.cssSelector("input.inputtext[type='password'][tabindex='2']"));
//		 
 //   	 un.sendKeys("pooja");
 //   	 pass.sendKeys("pooja123");
//		 
//		 //5.by using tag id and attribute
//		 //uses tag id(#) and atrributes(square brackets)
//		  WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type='submit'][value='Log In']"));
		  
//		  login.click();
		
		//6.by using starts with-it will find the locators based on the starting character
//		WebElement un =driver.findElement(By.cssSelector("input[name^='ema']"));//if not given complete word then too it works like ema
//		un.sendKeys("pooja");
//		
//		//7.by  using ends with = it will find the locators by ending character
//		WebElement pass= driver.findElement(By.cssSelector("input[type$='word']"));//if not given complete word then too it works like in password giving word
//		pass.sendKeys("pooja");
//		
//		
//		 //8.by using the contains-it will find the locators based on character which is present or not
//		WebElement login=driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
//		login.click();

	}

}
