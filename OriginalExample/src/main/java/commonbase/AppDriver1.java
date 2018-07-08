package commonbase;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppDriver1 {
	public static WebDriver driver;
	public static Properties ObjectXpath;
	
	public AppDriver1() throws Throwable {
		ObjectXpath=new Properties();
		FileInputStream fs = new FileInputStream(new File("C:\\Users\\gujje\\eclipse-workspace\\OriginalExample\\src\\test\\java\\ConfigData1\\ObjectRepo1.properties"));
		ObjectXpath.load(fs);	
	}

	public static void openBrowser(String browser) {
		
	     
		     try {
		    	 if((browser.equalsIgnoreCase("chrome"))) {
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gujje\\eclipse-workspace\\Automation\\chromedriver.exe");
	            driver= new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        System.out.println("User is able to open a browser");
		
		           }
		    	 }catch (Exception e) {
					    e.printStackTrace();
					    System.out.println("User is not able to open a browser");
					 
				        } 
                } 
    
	public static void navigateURL( String URL) {
			try {
				driver.get(ObjectXpath.getProperty(URL));
				 System.out.println("User is able to launch the application");
			}catch (Exception e) {
				e.printStackTrace();
				 System.out.println("User is not able to launch the application");
			}
	 }
	
	public static void enterText(String xpath,String entervalue) {
			try {
				driver.findElement(By.xpath(ObjectXpath.getProperty(xpath))).sendKeys(entervalue);
				 System.out.println("User is able to enter text");
				 Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
			 System.out.println("User is not able to enter text");
		}


}
    
	public static void  clickbutton(String xpath) {
        try {
               driver.findElement(By.xpath(ObjectXpath.getProperty(xpath))).click();
              System.out.println("User is able to click the button");
              Thread.sleep(2000);
             }catch (Exception e) {
               e.printStackTrace();
                 System.out.println("User is not able to click the button ");
            }
         }
  
	public static void selectbutton(String xpath, String value) {
	WebElement mySelectElement = driver.findElement(By.xpath("Quantity"));
   	Select dropdown= new Select(mySelectElement);
     dropdown.selectByVisibleText(value);
   }

}
