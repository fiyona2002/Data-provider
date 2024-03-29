package Bank.Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Unit test for simple App.
 */
public class AppTest {
	WebDriver driver;
	@Test (enabled=false)
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","d:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.setBinary("d:\\Users\\User\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
	    WebElement p=driver.findElement(By.name("q"));
	    p.sendKeys("VIT");
	    p.submit();
	}
	@Test()
	public void validateLogin()
	{
		System.setProperty("webdriver.chrome.driver","d:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//ChromeOptions options= new ChromeOptions();
		//options.setBinary("d:\\Users\\User\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	    WebElement u=driver.findElement(By.name("user-name"));
	    u.sendKeys("standard_user");
	    WebElement p=driver.findElement(By.name("password"));
	    p.sendKeys("secret_sauce");
	    WebElement l=driver.findElement(By.name("login-button"));
	    l.click();
		String expectedURL="https://www.saucedemo.com/inventory.html";
		String actualURL=driver.getCurrentUrl();
		System.out.println("Actual URL"+actualURL);
		Assert.assertEquals(expectedURL,actualURL);
	}
	
	@Test(enabled=false)
	public void validatecoursera()
	{
		System.setProperty("webdriver.chrome.driver","d:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.coursera.org/");
		driver.manage().window().maximize();

        // Inspect the search box for various attributes
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='premium_dropdown_mastertracks']//span[2]")));
		element.click();

		
		//driver.findElement(By.xpath("//a[@id='premium_dropdown_mastertracks']//span[2]")).click();
        

        // Close the browser
        driver.quit();
    }
	
	@Test(enabled=false)
	public void Test() throws InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","d:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//ChromeOptions options= new ChromeOptions();
	//options.setBinary("d:\\Users\\User\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	driver=new ChromeDriver();
    driver.get("https://www.edureka.co/");
    driver.manage().window().maximize();
    WebElement button = driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/span"));
    button.click();
    driver.findElement(By.id("si_popup_email")).sendKeys("fiyonashah.sae.it@gmail.com");
    driver.findElement(By.id("si_popup_passwd")).sendKeys("Fiyona@123");
    driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/form/button")).click();
    Thread.sleep(5000);
    driver.navigate().to("https://learning.edureka.co/my-profile");
    //Thread.sleep(7000);
    
    WebElement personalEdit = driver.findElement(By.id("personal_details"));
    personalEdit.click();
    Thread.sleep(7000);
    //driver.findElement(By.id("wzrk-cancel")).click();
    driver.navigate().to("https://learning.edureka.co/new-onboarding/userdetails?fromProfile=true&tab=userDetails");
    WebElement personalDetials = driver.findElement(By.id("fullName"));
    personalDetials.clear();
    personalDetials.sendKeys("Fiyona");
    
    driver.findElement(By.xpath("//mat-tab-body/div[@class='mat-tab-body-content ng-trigger ng-trigger-translateTab']/div[@class='stepper-section']/div[@class='step-item']/div[@class='step-content']/div[@class='step-content-item']/div[2]/ngx-select-dropdown[1]/div[1]/button[1]/span[2]"));
    driver.findElement(By.tagName("li")).click();
    //driver.findElement(By.xpath("//span[normalize-space()='Advertising / PR / MR / Event Management']")).click();
    //driver.findElement(By.xpath("//button[@type='button']//span[contains(text(),'Afghanistan-AFT-Asia/Kabul')]")).click();
    //driver.findElement(By.xpath("//div[@class='add-prefered-time-block']//div[2]//div[1]//ngx-select-dropdown[1]//div[1]//button[1]//span[1]")).click();
    //driver.findElement(By.xpath("//div[@class='add-prefered-time-block']//div[2]//div[2]//ngx-select-dropdown[1]//div[1]//button[1]//span[1]")).click();
    //driver.findElement(By.xpath("//div[3]//div[1]//ngx-select-dropdown[1]//div[1]//button[1]//span[1]")).click();
    //driver.findElement(By.xpath("//div[3]//div[2]//ngx-select-dropdown[1]//div[1]//button[1]//span[1]")).click();
    
    //driver.navigate().to("https://learning.edureka.co/my-profile");	
    WebElement designation = driver.findElement(By.id("designation"));
    designation.clear();
    designation.sendKeys("Software Testing");
    driver.findElement(By.className("btn btn-default btn-lg btn-save btn_save pull-right")).click();
    Thread.sleep(1000);
    //driver.navigate().to("https://learning.edureka.co/my-profile");	
    
    driver.findElement(By.xpath("//img[@class='user_image']")).click();    
    driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
    
    
    //driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-onboarding-user-details[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/button[1]")).click();
    //Thread.sleep(5000);
    //driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-profile-main[1]/app-header[1]/header[1]/nav[1]/div[1]/div[3]/ul[1]/li[6]/div[1]/ul[1]/li[9]/a[1]")).click();
    //driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[3]/a[1]")).click();
    //Thread.sleep(5000);
    
    driver.navigate().to("https://www.edureka.co/blog/");
    driver.quit();
	}
	
	
	
	
}
    
