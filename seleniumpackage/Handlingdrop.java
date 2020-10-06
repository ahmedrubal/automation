package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Handlingdrop {
    public static void main(String[]args){
        WebDriver driver;
        System .setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
       WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select selectmonth = new Select(month);
        selectmonth.selectByIndex(12);
        WebElement day = driver.findElement(By.cssSelector("select.9407_5dba_8esg"));
        Select selectday = new Select(day);
        selectday.selectByVisibleText("3");
    }
}
