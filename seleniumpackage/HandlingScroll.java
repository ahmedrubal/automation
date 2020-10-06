package seleniumpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScroll {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");

      JavascriptExecutor jse = (JavascriptExecutor)driver;//object creation for JavaScriptExecutor interface
        //create object for interface don't need to use new keyword (new keyword use for class)
        jse.executeScript("window.scrollTo(0,500)"); //page scroll up but scroll bar goes down(x and y cordinate)
        Thread.sleep(1000);// used thread.sleep for wait 5 seconds and exception handelled by using throws keyword
        jse.executeScript("scrollBy (0, -500)"); //page scroll down by making y cordinate negative value
        Thread.sleep(5000);
        jse.executeScript("-200,0"); //page scroll left always have to change x cordinate value
        Thread.sleep(5000);
        jse.executeScript("200,0");//page scroll right
       // driver.close();
    }
}
