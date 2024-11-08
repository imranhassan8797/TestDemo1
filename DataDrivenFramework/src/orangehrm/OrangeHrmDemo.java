package orangehrm;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ih879\\OneDrive\\Desktop\\SeleniumTool\\DataDrivenFramework\\src\\utilities\\datadrivenframework.properties");
		
		Properties p = new Properties();
		p.load(fis);
		
		String urlData = p.getProperty("urlData");
		String usernameData = p.getProperty("usernameData");
		String passwordData = p.getProperty("passwordData");
		
		System.out.println(urlData);
		System.out.println(usernameData);
		System.out.println(passwordData);
		//Test
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(urlData);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usernameData);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwordData);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
