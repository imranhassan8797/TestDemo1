package orangehrmdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ih879\\OneDrive\\Desktop\\SeleniumTool\\HybriddrivenFramework\\src\\utilities\\hybriddriven.properties");
		
		Properties p = new Properties();
		p.load(fis);
		
		String urlData = p.getProperty("urlData");
		String usernameData = p.getProperty("usernameData");
		String passwordData = p.getProperty("passwordData");
		
		String usernameKey = p.getProperty("usernameKey");
		String passwordKey = p.getProperty("passwordKey");
		String loginKey = p.getProperty("loginKey");
		
		System.out.println(urlData);
		System.out.println(usernameData);
		System.out.println(passwordData);
		System.out.println(usernameKey);
		System.out.println(passwordKey);
		System.out.println(loginKey);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(urlData);
		
		Thread.sleep(2000);;
		driver.findElement(By.xpath(usernameKey)).sendKeys(usernameData);
		Thread.sleep(2000);
		driver.findElement(By.xpath(passwordKey)).sendKeys(passwordData);
		Thread.sleep(2000);
		driver.findElement(By.xpath(loginKey)).click();
		Thread.sleep(2000);
		
	}

}
