/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverLogLevel;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.WebElement;

/**
 *
 * @author student
 */
public class UnitTest1 {
   
    public UnitTest1() throws InterruptedException {
      
        	// Create a new instance of the Firefox driver
		
		String exePath = "C:\\Unit Testing\\Drivers\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
                
        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		//Wait for 5 Sec
		Thread.sleep(5);
		
        // Close the driver
        driver.quit();
        
        
             
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        
        
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        
        
        
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     
         
         String exePath = "C:\\Unit Testing\\Drivers\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
      driver.get("http://www.store.demoqa.com");
     System.out.println("Successfully opened the website www.Store.Demoqa.com");
     driver.quit();
     
     
     }
     @Test
     public void comparisonfbTitle() throws InterruptedException{
     String exePath = "C:\\Unit Testing\\Drivers\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
                
                driver.get("https://www.facebook.com");
                
                String actualTitle = driver.getTitle();
                
            assertEquals("Facebook - Log In or Sign Up", actualTitle);
                
                Thread.sleep(5);
                driver.quit();
                
     
     
     
     }
          @Test
     public void comparisonFBloginButton() throws InterruptedException{
     String exePath = "C:\\Unit Testing\\Drivers\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
                
                driver.get("https://www.facebook.com");
                
                String actualTitle = "u_0_o";
                
            
                WebElement test = driver.findElement(By.id("u_0_o"));
                assertEquals(actualTitle, test.getAttribute("id"));
                Thread.sleep(5);
                driver.quit();
               
     
     
     
     }
     
}
