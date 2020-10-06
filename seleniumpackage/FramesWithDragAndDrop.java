package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FramesWithDragAndDrop {
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver;
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://jqueryui.com/droppable/");
        System.out.println( driver.findElements(By.tagName("iframe")).size());
        //BY using index
    //driver.switchTo().frame(0);
        //By using webelement
    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
    driver.findElement(By.xpath("//div[@id=\"draggable\"]")).click();
    Actions action = new Actions(driver);
       WebElement source= driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
       WebElement target =driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
       Thread.sleep(5000);
        action.dragAndDrop(source,target).build().perform();
        //come out from frame
        driver.switchTo().defaultContent();


    }
}
