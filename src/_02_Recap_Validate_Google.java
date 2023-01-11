import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _02_Recap_Validate_Google {

    public static void main(String[] args) {


        /*
        TEST CASE 3
Go to https://www.google.com/
Validate the page title is "Google"



        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        if(driver.getTitle().equals("Google")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");
        if (driver.getCurrentUrl().equals("https://www.google.com/")) System.out.println("PASSED");
        else System.out.println("FAILED");


        Driver.quitDriver();

         */

        /*
       TEST CASE 4
Go to https://www.google.com/
Enter "Software Engineer in Test" to search input box
Click the search button
Validate the first result contains the text "Software Engineer in Test" (edited)

         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");



        WebElement searchInput = driver.findElement(By.className("gLFyf"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchInput.sendKeys("Software Engineer in Test");
        searchButton.click();

        if(driver.findElement(By.xpath("(//div[@class='yuRUbf']//h3)[1]")).getText().contains("Software Engineer in Test"))
            System.out.println("PASSED");
        else System.out.println("FAILED");

        Driver.quitDriver();   
    }














    }

