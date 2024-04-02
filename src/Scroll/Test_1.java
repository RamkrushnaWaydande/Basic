package Scroll;


	
		// TODO Auto-generated method stub
		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebDriver.Navigation;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebElement;

		class purchase2
		     

		{
			public static void main(String[] args) throws InterruptedException
			{
				{
					 System.err.println("launch the browser");

					 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
					 WebDriver driver = new ChromeDriver();
					 driver.manage().window().maximize();
				    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		          driver.get("http://40.80.91.220/SDUU_LIVE_TEST/Default.aspx");
		          
		          driver.findElement(By.xpath("//*[@id=\"Login1_UserName\"]")).sendKeys("c1439");

		 		 driver.findElement(By.xpath("//*[@id=\"Login1_Password\"]")).sendKeys("passwd@1");
		   
		 		 driver.findElement(By.xpath("//*[@id=\"Login1_LoginButton\"]")).click();
		 		 
		 		  // Create JavascriptExecutor instance  
		         JavascriptExecutor js = (JavascriptExecutor) driver;
		            
		         driver.findElement(By.className("rpExpandHandle")).click();
		          driver.findElement(By.id("RAD_SPLITTER_PANE_CONTENT_MenuPane"));
		         
		         // Scroll down the page by 1000 pixels
		         js.executeScript("window.scrollBy(0,8000)");
		         
		         js.executeScript(" js.executeScript.scrolltop500");

	}

}
		}
