package Bank.Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExcel {
	WebDriver driver;
	  
	 @Test(dataProvider="testdata")
	 public void DemoProject(String username, String password) throws InterruptedException
	 {
	System.setProperty("webdriver.chrome.driver","d:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
			
	 driver.get("https://www.saucedemo.com/");
	  
	 driver.findElement(By.name("user-name")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 driver.findElement(By.name("login-button")).click();
	  
	 Thread.sleep(5000);
	 
	 String expectedURL="https://www.saucedemo.com/inventory.html";
		String actualURL=driver.getCurrentUrl();
		System.out.println("Actual URL"+actualURL);
		Assert.assertEquals(expectedURL,actualURL);
	  
	 //Assert.assertTrue(driver.getTitle().matches("Find a Flight: Mercury Tours:"), "Invalid credentials");
	 //System.out.println("Login successful");
	 }
	  
	 @AfterMethod
	 void ProgramTermination()
	 {
	 driver.quit();
	 }
	 
	@DataProvider(name="testdata")
	 public Object[][] TestDataFeed()
	 {
	  
	 ReadExcelFile config = new ReadExcelFile("D:\\logindata.xlsx");
	  
	 int rows = config.getRowCount(0);
	  
	 Object[][] credentials = new Object[rows][2];
	 
	for(int i=0;i<rows;i++)
	 {
	 credentials[i][0] = config.getData(0, i, 0);
	 credentials[i][1] = config.getData(0, i, 1);
	 }
	  
	 return credentials;
	 }
	}

