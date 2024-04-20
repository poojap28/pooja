import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotsExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		//firstly we are creating reference of Takescreenshot interface
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//calling getsScreenshot  as method to create image
		File srcFile=ts.getScreenshotAs(OutputType.FILE);//we take screenshot by this method
		
		//move the file into new distination folder
		File destFile=new File("E:\\Images\\error.png");//we store it.
		
		//we will copy the screenshot into destination folder
		Files.copy(srcFile, destFile);
		
		

	}

}
