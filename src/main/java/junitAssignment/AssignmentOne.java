package junitAssignment;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;


public class AssignmentOne {

	WebDriver driver;
	@Before
	public void launchBrowser () {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://techfios.com/test/101/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		@Test
		public void loginTest() throws InterruptedException, IOException {
			
			driver.findElement(By.name("data")).sendKeys("Subin Shrestha");
			driver.findElement(By.cssSelector("input[value='Add']")).click();
			Thread.sleep(8000);
			
			driver.findElement(By.name("data")).sendKeys("Shamim Bhai");
			driver.findElement(By.cssSelector("input[value='Add']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.name("data")).sendKeys("Salman Khan");
			driver.findElement(By.cssSelector("input[value='Add']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.name("data")).sendKeys("Biplove");
			driver.findElement(By.cssSelector("input[value='Add']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.name("data")).sendKeys("Prakash");
			driver.findElement(By.cssSelector("input[value='Add']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.name("allbox")).click();
			takeScreenshotAtEndOfTest(driver);
			
			driver.findElement(By.name("allbox")).click();
			driver.findElement(By.name("todo[2]")).click();
			driver.findElement(By.cssSelector("input[value='Remove']")).click();
			takeScreenshotAtEndOfTest(driver);
			
			driver.findElement(By.name("allbox")).click();
			driver.findElement(By.cssSelector("input[value='Remove']")).click();
			takeScreenshotAtEndOfTest(driver);
			
			//Assert.assertEquals(message, expected, actual);
		}
		public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
			TakesScreenshot ts = ((TakesScreenshot) driver);// create an object and it is an interface
			SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss"); // create object for the date
			Date date = new Date(); // import it from java.util
			String label = formatter.format(date);
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			String currrentDir = System.getProperty("user.dir");
			FileUtils.copyFile(sourceFile, new File(currrentDir + "/screenshots/" + label + ".png")); 
}
}

