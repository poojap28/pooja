import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demo.guru99.com/test/facebook.html");
//		
//        //2.close()-->to close the current url
//		driver.close();
//		
//		//3.to get current opened url title we use title
//		 String title=driver.getTitle();
//		 System.out.println("title");
//		 
//		 //4.to get the sorce code of the current page
//		  String  source= driver.getPageSource();
//		  System.out.println("source");
//		  
//		  //5.to get the open url
//		 String  url= driver.getCurrentUrl();
//		 System.out.println("url");
//		 
//		 //6.to get the quit
//		 driver.quit();
		
		
		//css locator
		//tag and class name
	//	WebElement un =driver.findElement(By.cssSelector("input.inputtext"));
	//	un.sendKeys("poojapawar");
		
		//tag and id
	//	WebElement pass=driver.findElement(By.cssSelector("input#pass"));
	//	pass.sendKeys("pooja12");
		
		//tag and attribute
		WebElement un=driver.findElement(By.cssSelector("input[type='text'][name='email']"));
		un.sendKeys(" pooja_23");
		 
		WebElement pass=driver.findElement(By.cssSelector("input[type='password'][name='pass']"));
		pass.sendKeys("pooja_12");
		
		//

	}

}
