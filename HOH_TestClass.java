package HOH_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HOH_TestClass {


    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://localhost:8091/PaymentTester.html";
        

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("vendorList")).click();
        Thread.sleep(4);
        driver.findElement(By.xpath("//option[@value='edgil']")).click();
        
        
    }
    }
