import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class _05_Locators_tagName {
    public static void main(String[] args) {

        /*
        Go to https://techglobal-training.netlify.app/
Select “Frontend Testing” from the “Practices” dropdown
Select the “Locators” card
Validate the "Locators header"

Note: Make sure the header is displayed, make sure the text is exactly "Locators"

         */

        try {
            WebDriver driver = Driver.getDriver();

            TechGlobalUtil.getFrontendTesting();

            driver.findElement(By.id("card-1")).click();
            Waiter.pause(5);

            WebElement heading = driver.findElement(By.id("main_heading"));

            System.out.println(heading.isDisplayed());
            System.out.println(heading.getText());

            if (heading.isDisplayed()) System.out.println("Heading displayed PASSED");
            else System.out.println("FAILED");

            if (heading.getText().equals("Locators")) System.out.println("PASSED");
            else System.out.println("FAILED");

        } catch (Exception e) {
            System.out.println("TEST FAILED due to " + e.getMessage());
        } finally {
            Driver.quitDriver();
        }
    }
}
