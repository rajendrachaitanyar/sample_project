package ccri;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ccri {

	@Test(priority=1)
	public void upload_date_checking() throws InterruptedException, FileNotFoundException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://ccri.ekaplus.com/");
		driver.findElement(By.xpath(".//*[contains(@name,'userName')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'userName')]")).sendKeys("ITManager");
		driver.findElement(By.xpath(".//*[contains(@name,'pwd')]")).clear();
		driver.findElement(By.xpath(".//*[contains(@name,'pwd')]")).sendKeys("ITManager9090");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[contains(@class,'btn  btn-success btn-block btn-custom')]")).click();
		driver.findElement(By.xpath("//*[@id=\'button-1044-btnIconEl\']")).click();
		driver.findElement(By.xpath("//*[@id=\'ekasmartplt-button-1067-btnInnerEl\']")).click();
		//driver.findElement(By.xpath(".//*[contains(@id,'textfieldreset-1096-bodyEl')]/div/div/input")).sendKeys("disease identification"+Keys.ENTER);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\'textfieldreset-1096-bodyEl\']")).sendKeys("addzd");
		driver.findElement(By.xpath(".//*[contains(@id,'textfieldreset-1096-bodyEl')]/div/div/input")).sendKeys("disease identification"+Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[contains(@id,'gridview-1076-record-97')]/tbody/tr/td/div/span")).click();
		
		
		Thread.sleep(3000);
		//*[contains(@id,'gridcolumn-1204-titleEl')]
		//WebElement date=driver.findElement(By.xpath("//*[@id=\'gridcolumn-1202\']"));
		//*[contains(text(),'UPDATED DATE')]
		//*[contains(@id,'gridcolumn-1431')]
		WebElement date=driver.findElement(By.xpath(".//*[contains(@id,'gridcolumn-1202')]"));
		Actions a=new Actions(driver);
		a.click(date).build().perform();
		Thread.sleep(3000);
		a.click(date).build().perform();
		Thread.sleep(3000);
		
		System.out.println("The Latest image uploaded date is "+driver.findElement(By.xpath(".//*[contains(@class,'x-grid-cell x-grid-td x-grid-cell-gridcolumn-1202 x-unselectable')]/div")).getText());
		
		/*String sample= driver.findElement(By.xpath(".//*[contains(@class,'x-grid-cell x-grid-td x-grid-cell-gridcolumn-1202 x-unselectable')]/div")).getText();
		String result="The Latest image uploaded date is " + sample;
		
		PrintStream fileOut = new PrintStream("D:\\Softwares\\sample.txt");
		System.setOut(fileOut);
		System.out.println(result);*/
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[contains(@id,'button-1027')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\'menuitem-1043-textEl\']")).click();
	    Thread.sleep(3000);
	    driver.quit();
	    
	    //a.moveToElement(date).doubleClick().build().perform();
		//driver.findElement(By.xpath(".//*[contains(@id,'gridcolumn-1379')]/div[2]"));
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'menuitem-1271-textEl\']")).click();*/
	}
	
	@Test(priority=2)
	public void resgitration_pageload_checking() throws InterruptedException, FileNotFoundException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://ccri.ekaplus.com/registration/");
		Thread.sleep(3000);
		System.out.println("The Registration page successfully loaded and achieved expected result and the action is "+driver.findElement(By.xpath("//*[@id=\'emailId-inputEl\']")).isDisplayed());		
/*
		boolean asd = driver.findElement(By.xpath("//*[@id=\'emailId-inputEl\']")).isDisplayed();
		String result="The Registration page successfully loaded and achieved expected result and the action is " + asd;
		
		PrintStream fileOut = new PrintStream("D:\\Softwares\\sample.txt");
		System.setOut(fileOut);
		System.out.println(result);*/
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	
	
}
