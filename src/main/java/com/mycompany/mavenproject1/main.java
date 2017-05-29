/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



/**
 *
 * @author student
 */
public class main {
    
    
   public static void main(String[] args) throws InterruptedException
    {
                String exePath = "C:\\Unit Testing\\Drivers\\chromedriver.exe";
                Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("profile.default_content_setting_values.notifications", 2);
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("prefs", prefs);
                
                
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver(options);
                JavascriptExecutor jse = (JavascriptExecutor)driver;
                WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.facebook.com");
                
                String actualTitle = driver.getTitle();
    
                
                if (actualTitle.contentEquals("Facebook - Log In or Sign Up"))
                {
                    driver.findElement(By.id("email")).sendKeys("");
                    driver.findElement(By.id("pass")).sendKeys("");
                    TimeUnit.SECONDS.sleep(1);
                    driver.findElement(By.id("u_0_o")).submit();
                    System.out.println("Test Passed!");
                }
                else{
                    System.out.println("test is failed");
                    driver.close();
                    return;
                }
                int x = 0;
                while (x < 2){
                    jse.executeScript("scroll(0, 100000);");
                
                    x++;
                    TimeUnit.SECONDS.sleep(1);
                
                }
               
                
                try{
     
                    jse.executeScript("scroll(0, 0);");
                    List<WebElement> click = driver.findElements(By.xpath("//*[@class='comment_link _5yxe']"));
                
               
               
                    List<WebElement> Names = driver.findElements(By.xpath("//*[@class=' UFICommentActorName']"));
              
                    System.out.println(Names.size() + "This is how many elements in Names");
             
                    List<WebElement> comments = driver.findElements(By.xpath("//*[@class='UFICommentBody']"));
             
                
                
               for(WebElement el : click)
                {
                    if(!el.getText().isEmpty())
                       
                    {
                      //System.out.println(el.getText()); 
                       System.out.println("Attempting to click " + el.getText());
                       jse.executeScript("return arguments[0].scrollIntoView(0, document.documentElement.scrollHeight-10);", el);
                       TimeUnit.MILLISECONDS.sleep(500);
                       el.click();
                      
                    }
                    else{
                        System.out.println("This is what we got from the web element\n");
                        System.out.println(el.getText());
                   
                    }
                }
             
               
               
                jse.executeScript("int x = 0;"
                        + "scroll(0, 0);");
                TimeUnit.SECONDS.sleep(1);
                for(WebElement el : Names)
                    { 
               
               
                    jse.executeScript("return arguments[0].scrollIntoView(0, document.documentElement.scrollHeight-10);", el);
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(el.getText());
                  
                    }
            }
                    
               
             
               
             
                catch (NoSuchElementException e)
                {
                    System.err.println("too slow on the scrolling");
                
                }
       
                
                

           
                

                
    }
    
    
}
