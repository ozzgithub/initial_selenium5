import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;

import java.util.List;

public class _01_Recap_Validate_Address {
    public static void main(String[] args) {


        /*

TEST CASE 1
Go to https://techglobal-training.netlify.app/
Validate the address in the footer is displayed and text is "2860 S River Rd Suite 350, Des Plaines IL 60018"
Validate the copyright in the footer is displayed and text is "© 2023 TechGlobal - All Rights Reserved"



        WebDriver driver = Driver.getDriver();

        driver.get("https://techglobal-training.netlify.app/");


       List<WebElement> elements = driver.findElements(By.xpath("//footer[@class='Footer_footer__kXlYa']/div/div/p"));

       String[] actualText = {"2860 S River Rd Suite 350, Des Plaines IL 60018" , "© 2023 TechGlobal - All Rights Reserved"};

        for (int i = 0; i < elements.size(); i++) {

            if (elements.get(i).getText().equals(actualText[i])) {
                System.out.println("PASSED");

            }else System.out.println("FAILED");

        }




        Driver.quitDriver();


         */

        /*
        TEST CASE 2
Go to https://techglobal-training.netlify.app/
Validate both the instagram and facebook items are displayed and enabled



        System.setProperty("webdriver.chromedriver" , "/Users/ozanatc/IdeaProjects/initial_selenium_project_5");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techglobal-training.netlify.app/");

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='Footer_socials__7h4n1']//a"));

        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).isDisplayed() && elements.get(i).isEnabled()) {
                System.out.println("PASSED");
            }else System.out.println("FAILED");

        }

        driver.quit();



         */


        /*
        TEST CASE 3
Go to https://www.google.com/
Validate the page title is "Google"
Validate the page url is "https://www.google.com/"



        System.setProperty("webdriver.chromedriver", "/Users/ozanatc/IdeaProjects/initial_selenium_project_5");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

      if (driver.getTitle().equals("Google")) System.out.println("PASSED");
      else System.out.println("FAILED");


      driver.quit();

         */

        /*
        TEST CASE 4
        Go to https://www.google.com/
        Enter "Software Engineer in Test" to search input box
        Click the search button
        Validate the first result contains the text "Software Engineer in Test"

         */

        System.setProperty("webdriver.chromedriver", "/Users/ozanatc/IdeaProjects/initial_selenium_project_5");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

       WebElement input =  driver.findElement(By.xpath("//input[@class='gLFyf']"));

        input.sendKeys("Software Engineer in Test");
        input.click();















    }
}
