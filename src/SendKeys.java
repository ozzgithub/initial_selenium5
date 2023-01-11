import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Waiter;

public class SendKeys {
    public static void main(String[] args) {
       /*
TEST CASE
Go to https://www.wikipedia.org/
Search for "Tesla"
Validate the main title of the page is "Tesla"
NOTE: Use xpath or cssSelector to locate the web elements
 */


        WebDriver driver = Driver.getDriver();

        driver.get("https://www.wikipedia.org/");

        driver.findElement(By.id("searchInput")).sendKeys("Tesla");

        Waiter.pause(2);

        driver.findElement(By.cssSelector("button[class*='pure-button']")).click();

        System.out.println(driver.findElement(By.cssSelector(".mw-page-title-main")).getText());


        driver.quit();

    }
}