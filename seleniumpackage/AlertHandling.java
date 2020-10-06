package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert() ;
        System.out.println(alert.getText());
        alert.accept();
        driver.findElement(By.xpath("//input[@class='text_field']")).sendKeys("Munni");
    }
}
