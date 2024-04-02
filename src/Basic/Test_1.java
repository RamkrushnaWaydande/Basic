package Basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_1 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//		ChromeDriver driver=new ChromeDriver(option);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		File tempfile = logo.getScreenshotAs(OutputType.FILE);
		File destfile = new File ("./TS/Logo1.png");
		FileUtils.copyFile(tempfile, destfile);
		
		
		
		
	}

}
