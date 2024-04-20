import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1.using simple xpath method by using  tag and attributes
		
		//WebElement un=driver.findElement(By.xpath("//input[@id='email']"));
		//WebElement pass =driver.findElement(By.xpath("//input[@type='password']"));
		//WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
//		
		//2.using and condition
		
	   WebElement un= driver.findElement(By.xpath("//input[@id='email' and @class= 'inputtext'] "));//when both condition true it returns true
		WebElement pass= driver.findElement(By.xpath("//input[@id='pass' and  @tabindex='2']"));
		WebElement login= driver.findElement(By.xpath("//input[@value='Log In' and  @type='submit']"));
		
		//3.using or condition
		
//		WebElement un= driver.findElement(By.xpath("//input[@id='email' or  @class= 'inputtext'] "));//if any one condition is true it returns true
//		WebElement pass= driver.findElement(By.xpath("//input[@id='pass' or  @tabindex='11']"));
//		WebElement login= driver.findElement(By.xpath("//input[@value='Log In' or  @type='submit']"));
//		
		//4.contains method =in contain method the parameter password will be the present letter in in the word.For ex-email in email ma is present .
		//or match the letters in the words
//		WebElement un= driver.findElement(By.xpath(" //input[contains(@name,'ma')]"));
//		WebElement pass= driver.findElement(By.xpath("//input[contains(@type,'word')]"));
//		WebElement login= driver.findElement(By.xpath("//input[contains(@value,'in')]"));
//		
//		5.startswith=takes first word or letter
//		WebElement un= driver.findElement(By.xpath(" //input[starts-with(@name,'em')]"));
//		WebElement pass= driver.findElement(By.xpath("//input[starts-with(@type,'pa')]"));
//		WebElement login= driver.findElement(By.xpath("//input[starts-with(@value,'Lo')]"));
//		
//
		
		un.sendKeys("pooja");
		pass.sendKeys("pooja12");
		login.click();
		
		
//	6.using text method=to click on text we use text method .* is for full html page
//		WebElement link= driver.findElement(By.xpath("//*[text()='Agile Project']"));
//		link.click();
////		
		

	}

}
