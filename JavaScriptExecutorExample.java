import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		//1.firstly we need to create reference variable of javascript executor interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//2.in javascript executor interface we have to methods executescript and executeAsync
		driver.findElement(By.name("uid")).sendKeys("pooja");
		driver.findElement(By.name("password")).sendKeys("pawar123");
		
		WebElement login= driver.findElement(By.name("btnLogin"));
		
//		//we will use the below javascript to click on login button
//		js.executeScript("arguments[0].click();", login);
//		
//		//we will 
//		js.executeScript("alert(' User or Password is not valid');");
//		
		
		//we will use below script to get all the details of webpages like title,domain name
		
//		String domainName=js.executeScript("return document.domain;").toString();
//		System.out.println(domainName);
//		
//		String title=js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		String url=js.executeScript("return document.URL;").toString();
//		System.out.println(url);
//		
//		//we will use script to launch the new url
//		
//		js.executeScript("window.location='https://demo.guru99.com/test/facebook.html'");
		
		


	}

}
