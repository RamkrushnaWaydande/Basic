package Basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc_2 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		WebElement ele = driver.findElement(By.id("pickfiles"));
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/ScPractise.png");
		FileUtils.copyFile(temp, dest);
		

	}

}
