package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewDemo {
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(500);
        driver.get("https://www.facebook.com/");
//        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//        Select month1 = new Select(month);
//        month1.selectByVisibleText("Dec");
//        Thread.sleep(500);
//        month1.selectByIndex(5);
//        Thread.sleep(500);
//       String title= driver.getTitle();
//        System.out.println(" title of the page"  + title);
//        driver.close();
        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));





    }
}
