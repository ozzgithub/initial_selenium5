import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

import java.security.Key;

public class Automation_Assignment2 {
    public static void main(String[] args) {

        /*
        Go to https://www.techglobalschool.com/
2. Scroll down to the bottom of the page
3. Send keys to subscribe form and make sure the keys sent are passed
1. Enter “John” to “Enter your first name” input box
2. Enter “Doe” to “Enter your last name” input box
3. Enter “john.doe@gmail.com” to “Add your email” input box
4. Validate the keys sent are passed in the DOM
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement firstName = driver.findElement(By.id("input_comp-khwayxk9"));
        WebElement lastName = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement email = driver.findElement(By.id("input_comp-khwb0zsz"));





        firstName.sendKeys("John");
        Waiter.pause(2);
        lastName.sendKeys("Doe");
        Waiter.pause(2);
        email.sendKeys("john.doe@gmail.com");
        Waiter.pause(2);





        System.out.println(firstName.getAttribute("value").equals("John"));

        Waiter.pause(2);
        System.out.println(lastName.getAttribute("value").equals("Doe"));

        Waiter.pause(2);
        System.out.println(email.getAttribute("value").equals("john.doe@gmail.com"));





        Driver.quitDriver();
    }
}






















