import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class Automation_Assignment3 {

    public static void main(String[] args) {


        /*
TEST CASE 1
Go to https://techglobal-training.netlify.app/
Select "Frontend Testing" from the "Practices" dropdown
Select the "Xpath-CSS Locators" card
Validate the Programming Languages list items below
Java
JavaScript
C#

         */


        WebDriver driver = Driver.getDriver();
        TechGlobalUtil.getFrontendTesting();
        TechGlobalUtil.clickOnCard(2);

        System.out.println(driver.findElement(By.xpath("(//h3[@class='Xpath_subheader__VOtsU'])[1]")).getText());

        List<WebElement> elementList = driver.findElements(By.xpath("(((//ul)[2])//li)"));

        String[] itemsText =
                {"Java",
                        "JavaScript",
                        "C#"};

        for (int i = 0; i < elementList.size(); i++) {

            System.out.println(elementList.get(i).isDisplayed());

            System.out.println(elementList.get(i).getText().equals(itemsText[i]));

            System.out.println(elementList.get(i).getText());


        }


        Driver.quitDriver();


    }

}












/*
TEST CASE 2
Go to https://techglobal-training.netlify.app/
Select "Frontend Testing" from the "Practices" dropdown
Select the "Xpath-CSS Locators" card
Validate the Automation Tools list items below
Selenium WebDriver
WebDriverIO
Cypress
Playwright


        WebDriver driver = Driver.getDriver();
        TechGlobalUtil.getFrontendTesting();
        TechGlobalUtil.clickOnCard(2);

       System.out.println(driver.findElement(By.xpath("(//h3[@class='Xpath_subheader__VOtsU'])[2]")).getText());

    List<WebElement> elementList =  driver.findElements(By.xpath("(((//ul)[3])//li)"));

    String[] itemsText = {"Selenium WebDriver", "WebDriverIO", "Cypress", "Playwright"};

        for (int i = 0; i < elementList.size(); i++) {

       System.out.println(elementList.get(i).isDisplayed());

            System.out.println(elementList.get(i).getText().equals(itemsText[i]));

            System.out.println(elementList.get(i).getText());

    }


        Driver.quitDriver();


         */













