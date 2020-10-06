package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
        UserName.sendKeys("Rubal");
            // Webdriver Browser commands
        Utils.sleep(5);
        driver.get("https://www.hollisterco.com/shop/us");

        String title = driver.getTitle();
        System.out.println("Title of the page ::" + title);
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println("currenturl of the page is::" + CurrentUrl);
        String pagesource = driver.getPageSource();
        System.out.println("source code of page is::" + pagesource);
        // Browser navigation commands
        driver.navigate().to("https://www.hollisterco.com/shop/us");
        driver.navigate().back();
        Thread.sleep(500);
        driver.navigate().forward();
        Thread.sleep(500);
        driver.navigate().refresh();

        driver.close();
    }
}


