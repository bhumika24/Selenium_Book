import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Main {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhumika S\\.eclipse\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bookswagon.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='New Arrivals']")).click();
	
		driver.findElement(By.id("ddlSort")).click();
		
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Box Sets']")).click();
//    	WebElement findElement2 = driver.findElement(By.xpath("//a[@data-id='32832903']"));
		
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
		driver.findElement(By.xpath("//div[@class='btn topbtn']")).click();
		
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Best sellers']")).click();
		WebElement findElement = driver.findElement(By.id("ddlSort"));
		Select choose = new Select(findElement);
		choose.selectByIndex(3);
//////		choose.selectByValue("Product_discount desc");
//////		
		choose.selectByVisibleText("Price - High to Low");
//////		List<WebElement> options = choose.getOptions();
//////		for (WebElement webElement : options) {
//////    	String text = webElement.getText();
//////	    System.out.println(text);
//////			
//////	}
//////		choose.getFirstSelectedOption();
//////		choose.getAllSelectedOptions();
////		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Request a Book']")).click();
		driver.findElement(By.id("ctl00_phBody_RequestBook_txtISBN")).sendKeys("9798212182805");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$phBody$RequestBook$txtAuthor")).sendKeys("Jeneva Rose");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$phBody$RequestBook$txtEmailReq")).sendKeys("user@outlook.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='ctl00$phBody$RequestBook$txtTitle']")).sendKeys("You Shouldn't Have Come Here");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='ctl00$phBody$RequestBook$txtQty']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='ctl00$phBody$RequestBook$txtQty']")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='ctl00$phBody$RequestBook$txtPhone']")).sendKeys("9876543210");
		
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Award Winners']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		a.click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='Fault in Our Stars']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("inputbar")).sendKeys("Peace with Buddha");
		Thread.sleep(1000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Explain..']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='cboxClose']")).click();
		
		
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_PAGE_DOWN);
		r2.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r2.keyPress(KeyEvent.VK_PAGE_DOWN);
		r2.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r2.keyPress(KeyEvent.VK_PAGE_DOWN);
		r2.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Career']")).click();
		
		Robot r3 = new Robot();
		r3.keyPress(KeyEvent.VK_PAGE_DOWN);
		r3.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r3.keyPress(KeyEvent.VK_PAGE_DOWN);
		r3.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r3.keyPress(KeyEvent.VK_PAGE_DOWN);
		r3.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		driver.findElement(By.id("ctl00_phBody_ContactUs_txtFirstName")).sendKeys("Sundhar");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_phBody_ContactUs_txtEmail")).sendKeys("user@outlook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_phBody_ContactUs_txtAddress")).sendKeys("#14 sundhar niliya 5th cross jayanagara mysore.");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_phBody_ContactUs_txtPhone")).sendKeys("99882341121");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_phBody_ContactUs_txtSubject")).sendKeys("requesting");
		Thread.sleep(2000);
		
		WebElement findElement1 = driver.findElement(By.id("ctl00_phBody_ContactUs_ddlSubjectType"));
		Thread.sleep(2000);
		
		Select choose1 = new Select(findElement1);
        choose1.selectByIndex(3);
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_phBody_ContactUs_txtDescription")).sendKeys("need information about the book");
        Thread.sleep(2000);
	
       

        driver.findElement(By.xpath("//a[text()='Affiliate']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='About the Programme']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Payments']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Terms & Conditions']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Bookswagon Home']")).click();
        Thread.sleep(1000);
        
//       driver.findElement(By.xpath("//a[text()='Sitemap']")).click();
//      Thread.sleep(1000);
//        driver.findElement(By.xpath("//a[text()='Pre-order']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@class=\"btn-red\"]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[text()='close']")).click();
//       Thread.sleep(1000);
        
     driver.findElement(By.xpath("//a[contains(@href, 'https://www.youtube.com/channel/UCrJ4T5_wqMb_eZWtC-staVQ')]")).click();
	 Thread.sleep(2000);
	 Set w = driver.getWindowHandles();
     // window handles iterate
     Iterator t = w.iterator();
     String ch = (String) t.next();
     String pw = (String) t.next();
     // switching child window
     driver.switchTo().window(pw);
     driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Selenium Course");
     Thread.sleep(2000);
     Robot robot3 = new Robot();
	 robot3.keyPress(KeyEvent.VK_ENTER);
	 robot3.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(2000);
//     System.out.println("Child window title "+ driver.getTitle());
    
    // switching parent window
     Thread.sleep(2000);
     driver.switchTo().window(pw);
//     System.out.println("Parent window title: "+ driver.getTitle());
     driver.close();
		
		}

}
