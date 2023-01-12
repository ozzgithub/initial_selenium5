import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercise_Ozge {

    public static void main(String[] args) throws InterruptedException {


        /*
        TEST CASE 1
Go to https://techglobal-training.netlify.app/
Validate the address in the footer is displayed and text is "2860 S River Rd Suite 350, Des Plaines IL 60018"
Validate the copyright in the footer is displayed and text is "© 2023 TechGlobal - All Rights Reserved"






        System.setProperty("webdriver.chromedriver", "/Users/ozanatc/IdeaProjects/initial_selenium_project_5");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://techglobal-training.netlify.app/");

        List<WebElement> element = driver.findElements(By.xpath("//footer[@class='Footer_footer__kXlYa']//p"));

        String[] actualtext = {"2860 S River Rd Suite 350, Des Plaines IL 60018","© 2023 TechGlobal - All Rights Reserved" };


        for (int i = 0; i < element.size(); i++) {

            if (element.get(i).getText().equals(actualtext[i])) System.out.println("PASSED");
            else System.out.println("FAILED");


        }


        driver.quit();


         */



/*
TEST CASE 1
        1. Go to “https://www.apple.com/”
        2. Validate the title of the page is displayed as “Apple”





        System.setProperty("webdriver.chromedriwer" , "/Users/ozanatc/IdeaProjects/initial_selenium_project_5");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.apple.com/");

       String title = driver.getTitle().equals("Apple") ? "Validation title PASSED" : "Validation title FAILED";

       String url =  driver.getCurrentUrl().equals("https://www.apple.com/") ? "Validation URL PASSED" : "Validation URL FAILED";
        System.out.println(title);
        System.out.println(driver.getTitle());
        System.out.println(url);
        System.out.println(driver.getCurrentUrl());


       driver.quit();



 */

        /*
        Go to https://www.techglobalschool.com
        Refresh the page
        Navigate to https://www.amazon.com/
        Navigate back to TechGlobal web site
        Navigate forward Amazon web site
        Validate the URL of the page
        Validate the title of the page



        System.setProperty("webdriver.chromedriver" , "/Users/ozanatc/IdeaProjects/initial_selenium_project_5");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techglobalschool.com");

        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);

       String url =  driver.getCurrentUrl().equals("https://www.amazon.com/") ? "PASSED" : "FAILED";
       String title = driver.getTitle().equals("Amazon.com. Spend less. Smile more.") ? "PASSED" : "FAILED";

        System.out.println(url);
        System.out.println(driver.getCurrentUrl());
        System.out.println(title);
        System.out.println(driver.getTitle());


        driver.quit();





        System.setProperty("webdriver.chromedriver" , "/Users/ozanatc/IdeaProjects/initial_selenium_project_5");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

       WebElement img  = driver.findElement(By.cssSelector("div[class*='k1zIA']>img"));

        System.out.println(img.isDisplayed());

        driver.quit();





        System.setProperty("webdriver.chromedriver", "/Users/ozanatc/IdeaProjects/initial_selenium_project_5");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

       List<WebElement> list  =  driver.findElements(By.xpath("//div[@class='o3j99 n1xJcf Ne6nSd']//a"));

        for (int i = 0; i < list.size(); i++) {

        if (list.get(i).isDisplayed() && list.get(i).isEnabled()) {
            System.out.println("PASSED");
            System.out.println(list.get(i).getText());
        } else System.out.println("FAILED");


        }

        driver.quit();


         */

        System.setProperty("webdriver.chromedriver", "/Users/ozanatc/IdeaProjects/initial_selenium_project_5");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

       List<WebElement> links =  driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']//a"));

        String[] texts = {"Advertising", "Business", "How Search works"};
        for (int i = 0; i < links.size(); i++) {
            if (links.get(i).isDisplayed() && links.get(i).isEnabled() && links.get(i).getText().equals(texts[i])) {
                System.out.println("PASSED");
                System.out.println(links.get(i).getText());

            }else System.out.println("FAILED");

        }

        driver.quit();



    }
}
