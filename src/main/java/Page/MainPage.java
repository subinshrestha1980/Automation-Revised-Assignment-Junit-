package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class MainPage {

	WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
		
	}

	public void loginTest1() throws InterruptedException {

		WebElement First_Name = driver.findElement(By.name("data"));
		WebElement Add1 = driver.findElement(By.cssSelector("input[value='Add']"));
		First_Name.sendKeys("Subin Shrestha");
		Add1.click();
		Thread.sleep(2000);

		WebElement Second_Name = driver.findElement(By.name("data"));
		WebElement Add2 = driver.findElement(By.cssSelector("input[value='Add']"));
		Second_Name.sendKeys("Shamim Bhai");
		Add2.click();
		Thread.sleep(2000);

		WebElement Third_Name = driver.findElement(By.name("data"));
		WebElement Add3 = driver.findElement(By.cssSelector("input[value='Add']"));
		Third_Name.sendKeys("Salman Khan");
		Add3.click();
		Thread.sleep(2000);

		WebElement Fourth_Name = driver.findElement(By.name("data"));
		WebElement Add4 = driver.findElement(By.cssSelector("input[value='Add']"));
		Fourth_Name.sendKeys("Biplove");
		Add4.click();
		Thread.sleep(2000);

		WebElement Fifth_Name = driver.findElement(By.name("data"));
		WebElement Add5 = driver.findElement(By.cssSelector("input[value='Add']"));
		Fifth_Name.sendKeys("Prakash");
		Add5.click();
		Thread.sleep(2000);

		WebElement AllCheckboxclick = driver.findElement(By.name("allbox"));
		AllCheckboxclick.click();
	}
	
	public void toggleAll() {
		WebElement checkforToggle=  driver.findElement(By.name("allbox"));
		WebElement checkforToggleRemove =  driver.findElement(By.cssSelector("input[value='Remove']"));
		checkforToggle.click();
		checkforToggleRemove.click();
	}
	
	public void AllCheckBox() {

		List<WebElement> allCheck = driver.findElements(By.xpath("//input[@type='checkbox']"));

		System.out.println("No of check box= " + allCheck.size());
		System.out.println("---------------------------------");

		for (WebElement checkbox : allCheck) {

			if (!checkbox.isSelected()) { // ! not equal to true) then click
				checkbox.click();
				System.out.println("Check box are empty:");
				
			} else {
				System.out.println("Check Box are checked");
				
			}
		}
	}

	public void removeCheckbox() {
		WebElement check = driver.findElement(By.name("allbox"));
		WebElement checkSelect = driver.findElement(By.name("todo[2]"));
		WebElement checkRemove = driver.findElement(By.cssSelector("input[value='Remove']"));
		check.click();
		checkSelect.click();
		System.out.println("---------------------------------");
		if(!checkSelect.isSelected())
			check.click();
		System.out.println("Box is Checked: " + checkSelect.isSelected());
		
		checkRemove.click();
	
	}
	public void toggleAllRemove() {
		WebElement toggleCheck =driver.findElement(By.name("allbox"));
		WebElement toggleRemove = driver.findElement(By.cssSelector("input[value='Remove']"));
		toggleCheck.click();
		System.out.println("---------------------------------");
		if(toggleRemove.isEnabled())
		System.out.println("Remove Button is Enable: " + toggleRemove.isEnabled());
		toggleRemove.click();
		
	}
}
//	public void single_check_Box() {
//		List<WebElement> check1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
//
//		// Same group of check boxes will have same 'Names'/Class names,
//		// hence we need to use findElements method and store the list of WebElements.
//
//		boolean bval = !false; // Create a variable which will have boolean value True/False
//		bval = check1.get(0).isSelected(); // Will return True if box is selected.
//
//		if (bval == true) {
//			check1.get(0).click(); // If the first check box is selected by default, this will select Second check
//									// basxcox
//			System.out.println("FIRST Box is Checked");
//		} else if (bval == true) {
//			check1.get(1).click(); // If the first check box is not selected by default, the first will be selected
//			System.out.println("Second Box is Checked");
//		} else if (bval == true) {
//			check1.get(2).click();
//			System.out.println("Third Box is Checked");
//		} else if (bval == true) {
//			check1.get(3).click();
//			System.out.println("Fourth Box is Checked");
//		} else {
//			check1.get(4).click();
//			System.out.println("Fifth Box is Checked");
//		}
//			


// for (WebElement lookingforcheckbox : mainpageText) {
//
//				
//
//				System.out.println(abc);

//				if (lookingforcheckbox.getText().equalsIgnoreCase("Kathmandu")) {
//
//					System.out.println("Element Present: " + abc);

//				} else {
// System.out.println("Element Not Present");
// System.out.println("================================================");
//
//	}
//			}

//		takeScreenshotAtEndOfTest(driver);
//		
//		driver.findElement(By.name("allbox")).click();
//		driver.findElement(By.name("todo[2]")).click();
//		driver.findElement(By.cssSelector("input[value='Remove']")).click();
//		takeScreenshotAtEndOfTest(driver);
//		
//		driver.findElement(By.name("allbox")).click();
//		driver.findElement(By.cssSelector("input[value='Remove']")).click();
//		takeScreenshotAtEndOfTest(driver);
//		
//		//Assert.assertEquals(message, expected, actual);
//	}
//	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
//		TakesScreenshot ts = ((TakesScreenshot) driver);// create an object and it is an interface
//		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss"); // create object for the date
//		Date date = new Date(); // import it from java.util
//		String label = formatter.format(date);
//		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//		String currrentDir = System.getProperty("user.dir");
//		FileUtils.copyFile(sourceFile, new File(currrentDir + "/screenshots/" + label + ".png")); 
//}
//	
//
//	public void verifyEnteredName(String enterName) {
//		
//		List<WebElement> mainpageText = driver.findElements(By.xpath("//div/a/span"));
//
//		for (WebElement lookingforKathmandu : mainpageText) {
//
//			String abc = lookingforKathmandu.getText();
//
//			// System.out.println(abc);
//
//			if (lookingforKathmandu.getText().equalsIgnoreCase("Kathmandu")) {
//
//				System.out.println("Element Present: " + abc);
//
//			} else {
//				// System.out.println("Element Not Present");
//				// }
//			}
//		}
//	}
//
//	public void duplicate_validationPage() throws InterruptedException {
//
//		MainPage loginvalidation = PageFactory.initElements(driver, MainPage.class);
//
//		loginvalidation.AddCategory_Cell("Kathmandu");
//		loginvalidation.AddCategory_CellButton();
//		Assert.assertEquals(Duplicate_Validation.getText(), "Kathmandu", "Kathmandu Not Found");
//		System.out.println("The category you want to add already exists: " + Duplicate_Validation.getText());
//		driver.navigate().back();

//		Assert.assertEquals(Month_DropDownValidation.getText(), "Jan", "January month Not Found");
//		System.out.println("Month:"  + Month_DropDownValidation);

//		List<WebElement> mainpageText = driver.findElements(By.tagName("span"));
//		System.out.println("This List of Web Element is :" + mainpageText.size());;
//		
//				
//		if(mainpageText.size()>1)
//		{
//			mainpageText.get(0).click();
//			String text =mainpageText.get(0), getText();
//			System.out.println("The clicked element is: " +text));
//
//			if (text.equalsIgnoreCase("This is Add Category"));
//			{
//				System.out.println("Element Kathmandu Found !");
//			}
//			else {
//				System.out.println("Element not Found ! SOORY!!");
//			}
//		}
//	}

//		String abc= driver.findElement(By.xpath("//div[3]/a[47]/span")).getText();
//		System.out.println(abc);
//		
//		String before_xpath = "//div[3]/a[";
//		String after_xpath = "]/span";
//
//		for (int i = 1; i <= 60; i++) {
//			// @findBy(how=How.XPATH, using ="before_xpath" +i+"after_xpath").getText();
//			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
//			// Assert.assertEquals(name, enterName, "Entered name doesnot exist");
//			System.out.println(name);
//
//			if (name.contains(enterName)) {
//				System.out.println("entered name exist");
//				driver.findElement(By.xpath("//div[3]/a[" + i + "]/span")).getText();
//
//				System.out.println(AddCategory.getText());
//				Assert.assertEquals(Validation.getText(), "Kathmandu", " Kathmandu not found");
